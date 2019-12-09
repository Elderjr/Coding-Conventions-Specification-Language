package command;

import compiler.JavaSourceFromString;

import command.impl.DeleteNodeCommand;

public final class InjectionCommandFactory {

	public static InjectionAction createsDefaultAction(String actionName) {
		if (actionName.toLowerCase().equals("delete")) {
			return new DeleteNodeCommand();
		}
		return null;
	}

	public static InjectionAction compileCustomAction(String className, String sourcePath) throws Exception {
		return (InjectionAction) JavaSourceFromString.compileClass(className, sourcePath);
	}
}
