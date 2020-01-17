package ccslFaultTypeDescriptionExecutor;

import java.util.Collection;
import java.util.List;

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
import ccslFaultTypeDescriptionExecutor.faultTypeDescription.FaultTypeDescription;

public class FaultTypeDescriptionExecutor {

	private static final FaultTypeDescriptionExecutor INSTANCE = new FaultTypeDescriptionExecutor();

	private FaultTypeDescriptionExecutor() {
	}

	public static FaultTypeDescriptionExecutor getInstance() {
		return INSTANCE;
	}

	
	public FaultTypeDescriptionResult executeFaultTypeDescription(FaultTypeDescription faultType, Model modiscoModel) {
		try {
			long startTime = System.currentTimeMillis();
			OCL oclInstance = OCL.newInstance();
			EClass context = JavaPackage.eINSTANCE.getASTNode();
			ExpressionInOCL expression = oclInstance.createQuery(context, faultType.getOcl());
			Query queryEval = oclInstance.createQuery(expression);
			System.out.println("Executing OCL query...");
			Collection<?> result = (Collection<?>) queryEval.evaluateEcore(modiscoModel);
			int totalElementsSelectedByQuery = result.size();
			int totalElementsSelectedByStrategy = 0;
			int totalElementsModified = 0;
			System.out.println("Executing OCL query... OK (" + result.size() + " nodes found)");
			
			if (result != null && result instanceof Collection) {
				System.out.println("Executing strategy... ");
				List<ASTNode> nodes = faultType.getStrategy().selectNodes(result);
				totalElementsSelectedByStrategy = nodes.size();
				System.out.println("Executing strategy... OK (" + nodes.size() + " selected)");
				System.out.println("Executing actions...");
				for (ASTNode node : nodes) {
					boolean isActionsWerePerfomed = faultType.getActionPipe().doActions(node);
					if (isActionsWerePerfomed) {
						totalElementsModified++;
					}
				}
				System.out.println("Executing actions... OK");
			} else {
				System.err.println("The generated OCL doesn't return a collection.");
			}
			long performance = System.currentTimeMillis() - startTime;
			return new FaultTypeDescriptionResult(performance, totalElementsSelectedByQuery,
					totalElementsSelectedByStrategy, totalElementsModified, modiscoModel);
		} catch (ParserException e) {
			System.err.println("The generated OCL is invalid. " + e.getMessage());
			return null;
		}
	}
}
