package command;

import command.impl.MiaAction;
import command.impl.MiebAction;
import command.impl.DeleteNodeCommand;

public final class InjectionCommandFactory {

	public static InjectionCommand createsAction(String actionName) {
		if (actionName.toLowerCase().equals("delete")) {
			return new DeleteNodeCommand();
		} else if (actionName.toLowerCase().equals("mia")) {
			return new MiaAction();
		} else if (actionName.toLowerCase().equals("mieb")) {
			return new MiebAction();
		}
		return null;
	}
}
