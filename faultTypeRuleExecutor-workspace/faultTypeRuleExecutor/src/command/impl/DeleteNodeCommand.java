package command.impl;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;

import command.InjectionAction;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.ExpressionStatement;

public class DeleteNodeCommand implements InjectionAction {

	@Override
	public void doAction(ASTNode target) {
		if (target == null)
			return;
		Object container = target.eContainer();
		if (container instanceof ExpressionStatement) {
			target = (ASTNode) container;
			container = target.eContainer();
		}
		Object fieldValue = null;
		boolean accessibleHasBeenChanged;
		for (Field containerField : ActionUtils.getAllClassFields(container.getClass())) {
			if (Modifier.isStatic(containerField.getModifiers())) {
				continue;
			}
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
