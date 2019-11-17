package command.impl;

import java.lang.reflect.Field;
import java.util.Collection;

import command.InjectionCommand;
import org.eclipse.gmt.modisco.java.ASTNode;

public class DeleteNodeCommand implements InjectionCommand {

	@Override
	public void doCommand(ASTNode target) {
		Object container = target.eContainer();
		Object fieldValue = null;
		boolean accessibleHasBeenChanged;
		for (Field containerField : container.getClass().getDeclaredFields()) {
			try {
				if (!containerField.canAccess(container)) {
					containerField.setAccessible(true);
					accessibleHasBeenChanged = true;
				} else {
					accessibleHasBeenChanged = false;
				}
				fieldValue = containerField.get(container);
				if (fieldValue == target) {
					containerField.set(container, null);
				} else if (fieldValue instanceof Collection) {
					Collection<?> values = (Collection<?>) fieldValue;
					values.remove(target);
				}
				if (accessibleHasBeenChanged) {
					containerField.setAccessible(false);
				}
			} catch (IllegalArgumentException | IllegalAccessException e) {
				System.err.println("Error in accessing field " + containerField.getName() + ": " + e.getMessage());
			}
		}
	}

}
