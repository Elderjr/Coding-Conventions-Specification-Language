package ccslSpecification;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.CompilationUnit;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.Package;
import org.eclipse.gmt.modisco.java.emf.JavaPackage;
import org.eclipse.modisco.java.composition.javaapplication.Java2File;
import org.eclipse.modisco.java.composition.javaapplication.JavaApplication;
import org.eclipse.modisco.java.composition.javaapplication.JavaapplicationFactory;
import org.eclipse.modisco.java.composition.javaapplication.JavaapplicationPackage;
import org.eclipse.modisco.kdm.source.extension.ASTNodeSourceRegion;
import org.eclipse.ocl.pivot.utilities.ParserException;
import org.eclipse.ocl.xtext.essentialocl.EssentialOCLStandaloneSetup;

import nodeUtils.NodeUtils;
import ocl.OclQuery;
import xmiReader.XMIReader;

public class CcslSpecificationRunner {

	private static CcslSpecificationRunner INSTANCE = new CcslSpecificationRunner();
	private boolean componentsInitialized = false;

	private CcslSpecificationRunner() {

	}

	public static CcslSpecificationRunner getInstance() {
		return INSTANCE;
	}

	private void buildEssentialComponents() {
		EPackage.Registry.INSTANCE.put(JavaPackage.eNS_URI, JavaPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(JavaapplicationPackage.eNS_URI, JavaapplicationPackage.eINSTANCE);
		EssentialOCLStandaloneSetup.doSetup();
	}

	private boolean equalsASTNode(ASTNode n1, ASTNode n2) {
		String uri1 = n1.eResource().getURIFragment(n1);
		String uri2 = n2.eResource().getURIFragment(n2);
		return uri1.equals(uri2);
	}
	private CCSLReport runOCLInModel(String oclQuery, String modiscoXmi, String kdmFragmentsPath)
			throws ParserException {
		ResourceSet rs = XMIReader.getInstance().createsResourceSet();
		Resource modiscoResource = XMIReader.getInstance().loadResourceFromXMI(rs, modiscoXmi);
		Model modiscoModel = (Model) modiscoResource.getContents().get(0);
		long startTime = System.currentTimeMillis();
		EList<?> nodes = (EList<?>) OclQuery.getInstance().evaluateQuery(oclQuery, JavaPackage.eINSTANCE.getASTNode(),
				modiscoModel);
		long oclQueryTime = System.currentTimeMillis() - startTime;
		Map<String, List<ASTNode>> compilationUnitMap = new HashMap<>();
		Map<Package, Resource> resourcesMap = new HashMap<>();

		startTime = System.currentTimeMillis();
		// Pre optimization
		for (Object obj : nodes) {
			if (obj != null && obj instanceof ASTNode) {
				ASTNode node = (ASTNode) obj;
				if (node.getOriginalCompilationUnit() == null) {
					System.out.println("[WARNING] Node" + node + " does not have an original compilation unit");
					continue;
				}
				Package nodePackage = NodeUtils.getNodePackage(node);
				if (nodePackage != null) {
					// Add node in the map of compilation units
					if (!compilationUnitMap.containsKey(node.getOriginalCompilationUnit().getOriginalFilePath())) {
						compilationUnitMap.put(node.getOriginalCompilationUnit().getOriginalFilePath(),
								new LinkedList<>());
					}
					compilationUnitMap.get(node.getOriginalCompilationUnit().getOriginalFilePath()).add(node);

					// Add node in the map of packages
					if (!resourcesMap.containsKey(nodePackage)) {
						String fullPackageName = NodeUtils.getFullPackageName(nodePackage);
						Resource packageResource = XMIReader.getInstance().loadResourceFromXMI(rs,
								kdmFragmentsPath + "\\" + fullPackageName + "_java2kdm.xmi");
						resourcesMap.put(nodePackage, packageResource);
					}
				}
			}
		}

		List<String> violations = new LinkedList<>();
		Resource packageResource;
		// Get line per package
		for (Entry<Package, Resource> entry : resourcesMap.entrySet()) {
			packageResource = entry.getValue();
			EList<EObject> java2FileList = packageResource.getContents();
			for (Object obj : java2FileList) {
				if (obj instanceof Java2File) {
					Java2File java2File = (Java2File) obj;
					String filePath = java2File.getJavaUnit().getOriginalFilePath();
					if (compilationUnitMap.containsKey(filePath)) {
						Iterator<ASTNodeSourceRegion> regions = java2File.getChildren().iterator();
						ASTNode node;
						ASTNodeSourceRegion region;
						while (regions.hasNext()) {
							region = regions.next();
							Iterator<ASTNode> nodesIterator = compilationUnitMap.get(filePath).iterator();
							while (nodesIterator.hasNext()) {
								node = nodesIterator.next();
								if (equalsASTNode(node, (ASTNode) region.getNode())) {
									violations.add(
											"[VIOLATION] Violation found on " + filePath + ":" + region.getStartLine());
									nodesIterator.remove();
									regions.remove();
									break;
								}
							}
						}
					}
				}
			}
		}
		long gettingLinesTime = System.currentTimeMillis() - startTime;
		return new CCSLReport(modiscoXmi, violations, nodes.size(), violations.size(), oclQueryTime, gettingLinesTime);
	}

	public void runCCSLSpecification(String modiscoXmi[], String kdmFragmentsFolder[], String oclQuery)
			throws ParserException {
		if (!componentsInitialized) {
			buildEssentialComponents();
		}
		CCSLReport reports[] = new CCSLReport[modiscoXmi.length];
		long totalQueryTime = 0;
		long totalGettingLinesTime = 0;
		int totalViolations = 0;
		int totalViolationsWithLine = 0;
		for (int i = 0; i < modiscoXmi.length; i++) {
			System.out.println("Running ccsl on " + modiscoXmi[i]);
			reports[i] = runOCLInModel(oclQuery, modiscoXmi[i], kdmFragmentsFolder[i]);
			for (String violation : reports[i].getViolations()) {
				System.out.println(violation);
			}
			totalQueryTime += reports[i].getOclQueryTime();
			totalGettingLinesTime += reports[i].getGettingLinesTime();
			totalViolations += reports[i].getTotalViolations();
			totalViolationsWithLine += reports[i].getTotalViolationsWithLine();
		}
		System.out.println("Query time: " + totalQueryTime);
		System.out.println("Getting lines time: " + totalGettingLinesTime);
		System.out.println("Violations: " + totalViolationsWithLine + "/" + totalViolations);
	}
}
