package ccslFaultTypeDescriptionExecutor.xmlNodeParser;

import java.util.List;

import ccslFaultTypeDescriptionExecutor.faultTypeDescription.FaultTypeDescription;
import ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionAction.ActionPipe;
import ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionAction.InjectionAction;
import ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionStrategy.InjectionStrategy;
import ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionStrategy.InjectionStrategyFactory;
import ccslFaultTypeDescriptionExecutor.javaCompiler.JavaCompilerFromString;
import ccslFaultTypeDescriptionExecutor.javaCompiler.StringToJavaCompilationException;
import ccslFaultTypeDescriptionExecutor.xmlReader.InjectionActionXMLNode;
import ccslFaultTypeDescriptionExecutor.xmlReader.InjectionStrategyXMLNode;
import ccslFaultTypeDescriptionExecutor.xmlReader.FaultTypeDescriptionXMLNode;

public class FaultTypeDescriptionNodeParser {
	
	private static final FaultTypeDescriptionNodeParser INSTANCE = new FaultTypeDescriptionNodeParser();

	private FaultTypeDescriptionNodeParser() {

	}

	public static FaultTypeDescriptionNodeParser getInstance() {
		return INSTANCE;
	}

	private InjectionStrategy getConcreteStrategyInstance(InjectionStrategyXMLNode strategyXMLNode) {
		if (!strategyXMLNode.isCustom()) {
			return InjectionStrategyFactory.createsStrategy(strategyXMLNode.getName());
		}
		return null;
	}
	
	private ActionPipe getConcreteActionInstances(List<InjectionActionXMLNode> actionsXMLNode, String actionsPathDir) throws StringToJavaCompilationException  {
		ActionPipe pipe = new ActionPipe();
		for (InjectionActionXMLNode actionXMLNode : actionsXMLNode) {			
			String actionPath = actionsPathDir + "\\" + actionXMLNode.getName() + ".java";
				InjectionAction genericAction = (InjectionAction) JavaCompilerFromString
						.getNewInstanceClassFromFile(actionXMLNode.getName(), actionPath);
				pipe.addAction(genericAction);
		}
		return pipe;
	}
	
	public FaultTypeDescription xmlNodeToFaultTypeDescription(FaultTypeDescriptionXMLNode faultTypeXMLNode,
			String actionsPathDir) throws StringToJavaCompilationException {
		String ocl = faultTypeXMLNode.getOcl();
		ActionPipe pipe = getConcreteActionInstances(faultTypeXMLNode.getActions(), actionsPathDir);
		InjectionStrategy strategy = getConcreteStrategyInstance(faultTypeXMLNode.getStrategy());
		return new FaultTypeDescription(ocl, pipe, strategy);
	}
}
