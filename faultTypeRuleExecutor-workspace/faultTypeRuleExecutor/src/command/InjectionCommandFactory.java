package command;

import command.impl.DeleteNodeCommand;

public final class InjectionCommandFactory {

	public static InjectionCommand createsAction(String actionName) {
		if (actionName.equals("Delete")) {
			return new DeleteNodeCommand();
		}
		return null;
	}
}
