package command;

import command.impl.DeleteBlockContainerRelation;
import command.impl.DeleteNodeCommand;

public final class InjectionCommandFactory {

	public static InjectionCommand createsAction(String actionName) {
		return new DeleteNodeCommand();
	}
}
