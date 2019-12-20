package faultTypeRuleExecutor.faultType;

import faultTypeRuleExecutor.command.InjectionAction;
import faultTypeRuleExecutor.command.InjectionCommandFactory;
import faultTypeRuleExecutor.command.impl.ActionPipe;
import faultTypeRuleExecutor.faultInjectorStrategy.FaultInjectorStrategy;
import faultTypeRuleExecutor.faultInjectorStrategy.FaultInjectorStrategyFactory;
import faultTypeRuleExecutor.javaCompiler.JavaCompilerFromString;
import faultTypeRuleExecutor.xmlReader.ActionXMLNode;
import faultTypeRuleExecutor.xmlReader.FaultTypeDescriptionXMLNode;

public class XMLNode2FaultTypeDescriptionParser {

	private static final XMLNode2FaultTypeDescriptionParser INSTANCE = new XMLNode2FaultTypeDescriptionParser();

	private XMLNode2FaultTypeDescriptionParser() {

	}

	public static XMLNode2FaultTypeDescriptionParser getInstance() {
		return INSTANCE;
	}

	private FaultInjectorStrategy getStrategyFromFaultTypeXMLNode(FaultTypeDescriptionXMLNode faultTypeXMLNode) {
		if (!faultTypeXMLNode.getStrategy().isCustom()) {
			return FaultInjectorStrategyFactory.createsStrategy(faultTypeXMLNode.getStrategy().getName());
		}
		return null;
	}

	private ActionPipe getActionsFromFaultTypeXMLNode(FaultTypeDescriptionXMLNode faultTypeXMLNode, String dir)
			throws Exception {
		ActionPipe pipe = new ActionPipe();
		for (ActionXMLNode actionXMLNode : faultTypeXMLNode.getActions()) {
			if (!actionXMLNode.isCustom()) {
				pipe.addAction(InjectionCommandFactory.createsDefaultAction(actionXMLNode.getName()));
			} else {
				String actionPath = dir + "\\" + actionXMLNode.getName() + ".java";
				InjectionAction genericAction = (InjectionAction) JavaCompilerFromString
						.getNewInstanceClassFromFile(actionXMLNode.getName(), actionPath);
				pipe.addAction(genericAction);
			}
		}
		return pipe;
	}

	public FaultTypeDescription xmlNodeToFaultTypeDescription(FaultTypeDescriptionXMLNode faultTypeXMLNode,
			String dirPath) throws Exception {
		String ocl = faultTypeXMLNode.getOcl();
		ActionPipe pipe = getActionsFromFaultTypeXMLNode(faultTypeXMLNode, dirPath);
		FaultInjectorStrategy strategy = getStrategyFromFaultTypeXMLNode(faultTypeXMLNode);
		return new FaultTypeDescription(ocl, pipe, strategy);
	}
}
