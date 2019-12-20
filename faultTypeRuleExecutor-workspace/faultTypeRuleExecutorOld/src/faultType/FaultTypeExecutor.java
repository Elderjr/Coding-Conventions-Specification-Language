package faultType;

import java.util.Collection;
import java.util.List;

import faultInjectorStrategy.FaultInjectorStrategy;
import main.Main;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.gmt.modisco.java.emf.JavaPackage;
import org.eclipse.ocl.pivot.ExpressionInOCL;
import org.eclipse.ocl.pivot.utilities.OCL;
import org.eclipse.ocl.pivot.utilities.ParserException;
import org.eclipse.ocl.pivot.utilities.Query;

import command.InjectionAction;

public class FaultTypeExecutor {

	private static final FaultTypeExecutor INSTANCE = new FaultTypeExecutor();

	private FaultTypeExecutor() {
	}

	public static FaultTypeExecutor getInstance() {
		return INSTANCE;
	}

	public Model executeFaultType(FaultTypeDescription faultType, String xmiPathFile) {
		System.out.println("Reading MoDisco instance...");
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource r = rs.getResource(URI.createURI(xmiPathFile), true);
		TreeIterator<EObject> contents = r.getAllContents();
		System.out.println("Reading MoDisco instance... OK");
		Model modiscoModel = (Model) contents.next();
		OCL oclInstance = OCL.newInstance(rs);
		executeFaultType(faultType, modiscoModel, oclInstance);
		return modiscoModel;
	}

	private void executeFaultType(FaultTypeDescription faultType, Model modiscoModel, OCL oclInstance) {
		try {
			EClass context = JavaPackage.eINSTANCE.getASTNode();
			System.out.println("Executing OCL query...");
			ExpressionInOCL expression = oclInstance.createQuery(context, faultType.getOcl());
			Query queryEval = oclInstance.createQuery(expression);
			Collection<?> result = (Collection<?>) queryEval.evaluateEcore(modiscoModel);
			System.out.println("Executing OCL query... OK (" + result.size() + " nodes found)");
			if (result != null && result instanceof Collection) {
				System.out.println("Executing strategy... ");
				List<ASTNode> nodes = faultType.getStrategy().selectNodes(result);
				System.out.println("Executing strategy... OK (" + nodes.size() + " selected)");
				System.out.println("Executing actions...");
				for (ASTNode node : nodes) {
					faultType.getActionPipe().doActions(node);
				}
				System.out.println("Executing actions... OK");
			} else {
				System.err.println("The generated OCL doesn't return a collection.");
			}
		} catch (ParserException e) {
			System.err.println("The generated OCL is invalid. " + e.getMessage());
		}
	}
}
