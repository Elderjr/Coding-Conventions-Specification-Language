package ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionAction;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmt.modisco.java.ASTNode;

public class ActionUtils {

	public static class Triple {
		Field field;
		Method getterMethod;
		Method setterMethod;
		
		Triple(Field f, Method getterMethod, Method setterMethod) {
			this.field = f;
			this.getterMethod = getterMethod;
			this.setterMethod = setterMethod;
		}
	}

	public static boolean setValue(ASTNode nodeField, ASTNode newNodeField) {
		if (nodeField.eContainer() != null && nodeField.eContainer() instanceof ASTNode) {
			return setValue((ASTNode) nodeField.eContainer(), nodeField, newNodeField);
		}
		return false;
	}

	public static boolean setValue(ASTNode container, ASTNode nodeField, ASTNode newNodeField) {
		boolean setWithSuccess = false;
		for (Triple t : getTripleValues(container.getClass())) {
			try {
				Object fieldValue = t.getterMethod.invoke(container);
				if (fieldValue == nodeField && t.setterMethod != null) {
					// Monovalued
					t.setterMethod.invoke(container, newNodeField);
					setWithSuccess = true;
				} else if (fieldValue instanceof List) {
					// Multivalued
					List<ASTNode> values = (List<ASTNode>) fieldValue;
					if (values.contains(nodeField)) {
						setWithSuccess = true;
						int fieldIndex = values.indexOf(nodeField);
						values.remove(nodeField);
						values.add(fieldIndex, newNodeField);
					}
				}
			} catch (IllegalArgumentException | IllegalAccessException | InvocationTargetException e) {
				System.err.println("Error in accessing field " + t.field.getName() + ": " + e.getMessage());
				setWithSuccess = false;
			}
		}
		return setWithSuccess;
	}

	private static List<Triple> tripleValuesRec(List<Triple> triple, Class<?> type) {
		for(Field f: type.getDeclaredFields()) {
			String getterMethodName = "get" + f.getName().substring(0, 1).toUpperCase() + f.getName().substring(1);
			String setterMethodName = "set" + f.getName().substring(0, 1).toUpperCase() + f.getName().substring(1);
			Method getterMethod = null;
			Method setterMethod = null;
			for (Method m : type.getDeclaredMethods()) {
				if(m.getName().equals(getterMethodName) && m.getParameters().length == 0) {
					getterMethod = m;
				} else if(m.getName().equals(setterMethodName) && m.getParameters().length == 1) {
					setterMethod = m;
				}
			}
			if(f != null && getterMethod != null) {
				triple.add(new Triple(f, getterMethod, setterMethod));
			}
		}
		
		if (type.getSuperclass() != null) {
			tripleValuesRec(triple, type.getSuperclass());
		}
		return triple;
	}

	public static List<Triple> getTripleValues(Class<?> type) {
		List<Triple> fields = new LinkedList<>();
		tripleValuesRec(fields, type);
		return fields;
	}
}
