package faultType;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.Model;
import org.eclipse.ocl.pivot.utilities.ParserException;
import faultInjector.Injector;
import faultInjectorStrategy.FaultInjectorStrategy;
import faultType.FaultType;

public class FaultTypeExecutor {

	private static final FaultTypeExecutor INSTANCE = new FaultTypeExecutor();

	private FaultTypeExecutor() {
	}

	public static FaultTypeExecutor getInstance() {
		return INSTANCE;
	}

	public Model executeFaultType(FaultType faultType, FaultInjectorStrategy strategy, String xmiPathFile) {
		Resource r = Injector.getInstance().loadXMIResource(xmiPathFile);
		TreeIterator<EObject> contents = r.getAllContents();
		Model modiscoModel = (Model) contents.next();
		executeFaultType(faultType, strategy, modiscoModel);
		return modiscoModel;
	}

	public void executeFaultType(FaultType faultType, FaultInjectorStrategy strategy, Model modiscoModel) {
		Object result = null;
		try {
			result = Injector.getInstance().executeQuery(faultType.getOcl(), modiscoModel);
			if (result != null && result instanceof Collection) {
				List<ASTNode> nodes = strategy.selectNodes((Collection<?>) result);
				for (Object node : nodes) {
					faultType.getAction().doCommand((ASTNode) node);
				}
			} else {
				System.err.println("The generated OCL doesn't return a collection.");
			}
		} catch (ParserException e) {
			System.err.println("The generated OCL is invalid. " + e.getMessage());
		}
	}
}
