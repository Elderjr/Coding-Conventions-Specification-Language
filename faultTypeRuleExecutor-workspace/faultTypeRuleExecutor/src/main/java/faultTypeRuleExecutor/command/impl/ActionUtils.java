package faultTypeRuleExecutor.command.impl;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.gmt.modisco.java.ASTNode;

public class ActionUtils {

	public static void setValue(ASTNode nodeField, ASTNode newNodeField) {
		if (nodeField.eContainer() != null && nodeField.eContainer() instanceof ASTNode) {
			setValue((ASTNode) nodeField.eContainer(), nodeField, newNodeField);
		}
	}

	public static void setValue(ASTNode container, ASTNode nodeField, ASTNode newNodeField) {
		for (Field field : getAllClassFields(container.getClass())) {
			if (Modifier.isStatic(field.getModifiers())) {
				continue;
			}
			if (!field.canAccess(container)) {
				field.setAccessible(true);
			}
			try {
				Object fieldValue = field.get(container);
				if (fieldValue == nodeField) {
					// Monovalued
					field.set(container, newNodeField);
				} else if (fieldValue instanceof Collection) {
					// Multivalued
					EObjectContainmentEList<ASTNode> values = (EObjectContainmentEList<ASTNode>) fieldValue;
					if (values.contains(nodeField)) {
						int fieldIndex = values.indexOf(nodeField);
						values.remove(nodeField);
						values.add(fieldIndex, newNodeField);
					}
				}
			} catch (IllegalArgumentException | IllegalAccessException e) {
				System.err.println("Error in accessing field " + field.getName() + ": " + e.getMessage());
			}
		}
	}

	private static List<Field> getAllClassFieldsRec(List<Field> fields, Class<?> type) {
		fields.addAll(Arrays.asList(type.getDeclaredFields()));
		if (type.getSuperclass() != null) {
			getAllClassFieldsRec(fields, type.getSuperclass());
		}
		return fields;
	}

	public static List<Field> getAllClassFields(Class<?> type) {
		List<Field> fields = new LinkedList<>();
		getAllClassFieldsRec(fields, type);
		return fields;
	}
}
