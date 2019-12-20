package command;

import command.impl.DeleteInfixOperator;
import command.impl.DeleteNodeCommand;
import command.impl.InfixOperatorReplace;
import command.impl.MoveScopeUp;
import javaCompiler.JavaCompilerFromString;

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
