package faultInjector;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import faultInjectorStrategyImpl.AllStrategy;
import faultType.FaultType;
import faultType.FaultTypeExecutor;
import faultType.impl.RemoveElseBlocks;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.emf.JavaPackage;
import org.eclipse.gmt.modisco.java.generation.files.GenerateJavaExtended;
import org.eclipse.ocl.pivot.ExpressionInOCL;
import org.eclipse.ocl.pivot.utilities.OCL;
import org.eclipse.ocl.pivot.utilities.ParserException;
import org.eclipse.ocl.pivot.utilities.Query;
import org.eclipse.ocl.xtext.essentialocl.EssentialOCLStandaloneSetup;

public class Injector {

	private static final Injector INSTANCE = new Injector();
	private ResourceSet rs;
	private OCL ocl;
	private EClass contextEClass;

	private Injector() {
		EPackage.Registry.INSTANCE.put(JavaPackage.eNS_URI, JavaPackage.eINSTANCE);
		EssentialOCLStandaloneSetup.doSetup();
		rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		contextEClass = JavaPackage.eINSTANCE.getASTNode();
		ocl = OCL.newInstance(rs);
	}

	public static Injector getInstance() {
		return INSTANCE;
	}

	public Resource loadXMIResource(String xmiPathFile) {
		return rs.getResource(URI.createURI(xmiPathFile), true);
	}

	public Object executeQuery(String oclText, Object modelEvaluated) throws ParserException {

		ExpressionInOCL expression = ocl.createQuery(contextEClass, oclText);
		Query queryEval = ocl.createQuery(expression);
		return queryEval.evaluateEcore(modelEvaluated);
	}

	public void regeneratedProject(Model modiscoModel) throws IOException {
		GenerateJavaExtended javaGenerator = new GenerateJavaExtended(modiscoModel, new File("./"),
				new ArrayList<Object>());
		javaGenerator.doGenerate(null);
	}

	public static void main(String[] args) throws IOException {
		FaultType faultType = new RemoveElseBlocks();
		Model modiscoModel = FaultTypeExecutor.getInstance().executeFaultType(faultType, new AllStrategy(),
				"file:///D:\\documentos\\sampleProject_java.xmi");
		Injector.getInstance().regeneratedProject(modiscoModel);
	}
}
