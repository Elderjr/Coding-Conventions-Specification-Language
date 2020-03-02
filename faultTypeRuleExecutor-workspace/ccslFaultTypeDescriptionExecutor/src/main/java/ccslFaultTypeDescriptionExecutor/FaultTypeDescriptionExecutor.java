package ccslFaultTypeDescriptionExecutor;

import java.util.Collection;
import java.util.List;


import org.eclipse.emf.ecore.EClass;
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

	
	public FaultTypeDescriptionRunMetrics executeFaultTypeDescription(FaultTypeDescription faultType, Model modiscoModel) {
		long queryTime = 0;
		long injectionTime = 0;
		int totalNodesSelectedByQuery = 0;
		int totalNodesModified = 0;
		FaultTypeDescriptionRunMetrics metrics = new FaultTypeDescriptionRunMetrics();
		try {
			queryTime = System.currentTimeMillis();
			OCL oclInstance = OCL.newInstance();
			EClass context = JavaPackage.eINSTANCE.getASTNode();
			ExpressionInOCL expression = oclInstance.createQuery(context, faultType.getOcl());
			Query queryEval = oclInstance.createQuery(expression);
			Collection<?> result = (Collection<?>) queryEval.evaluateEcore(modiscoModel);
			queryTime = System.currentTimeMillis() - queryTime;
			totalNodesSelectedByQuery = result.size();
			if (result != null && result instanceof Collection) {
				List<ASTNode> nodes = faultType.getStrategy().selectNodes(result);
				injectionTime = System.currentTimeMillis();
				for (ASTNode node : nodes) {
					boolean isActionsWerePerfomed = faultType.getActionPipe().doActions(node);
					if (isActionsWerePerfomed) {
						totalNodesModified++;
					}
				}
				injectionTime = System.currentTimeMillis() - injectionTime;
			} else {
				System.err.println("The generated OCL doesn't return a collection.");
			}
			metrics.setInjectionTime(injectionTime);
			metrics.setQueryTime(queryTime);
			metrics.setTotalElementsModified(totalNodesModified);
			metrics.setTotalElementsSelectedByQuery(totalNodesSelectedByQuery);
		} catch (ParserException e) {
			System.err.println("The generated OCL is invalid. " + e.getMessage());
		}
		return metrics;
	}
}
