package faultTypeRuleExecutor.command;

import faultTypeRuleExecutor.command.impl.DeleteInfixOperator;
import faultTypeRuleExecutor.command.impl.DeleteNodeCommand;
import faultTypeRuleExecutor.command.impl.InfixOperatorReplace;
import faultTypeRuleExecutor.command.impl.MoveScopeUp;
import faultTypeRuleExecutor.javaCompiler.JavaCompilerFromString;

public final class InjectionCommandFactory {

	public static InjectionAction createsDefaultAction(String actionName) {
		if (actionName.toLowerCase().equals("delete")) {
			return new DeleteNodeCommand();
		} else if (actionName.equals("MoveScopeUp")) {
			return new MoveScopeUp();
		} else if (actionName.equals("DeleteInfixOperator")) {
			return new DeleteInfixOperator();
		} else if (actionName.equals("InfixOperatorReplace")) {
			return new InfixOperatorReplace(null);
		}
		return null;
	}

	public static InjectionAction compileCustomAction(String className, String sourcePath) throws Exception {
		return (InjectionAction) JavaCompilerFromString.getNewInstanceClassFromFile(className, sourcePath);
	}
}
