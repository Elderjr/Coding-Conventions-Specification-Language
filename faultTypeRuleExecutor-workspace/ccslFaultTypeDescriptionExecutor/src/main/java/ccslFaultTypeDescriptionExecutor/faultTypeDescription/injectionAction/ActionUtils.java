package ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionAction;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.ParenthesizedExpression;

public class ActionUtils {

	public static boolean setValue(ASTNode nodeField, ASTNode newNodeField) {
		if (nodeField.eContainer() != null && nodeField.eContainer() instanceof ASTNode) {
			return setValue((ASTNode) nodeField.eContainer(), nodeField, newNodeField);
		}
		return false;
	}

	public static boolean setValue(ASTNode container, ASTNode nodeField, ASTNode newNodeField) {
		boolean setWithSuccess = false;
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
					setWithSuccess = true;
				} else if (fieldValue instanceof Collection) {
					// Multivalued
					EObjectContainmentEList<ASTNode> values = (EObjectContainmentEList<ASTNode>) fieldValue;
					if (values.contains(nodeField)) {
						setWithSuccess = true;
						int fieldIndex = values.indexOf(nodeField);
						values.remove(nodeField);
						values.add(fieldIndex, newNodeField);
					}
				}
			} catch (IllegalArgumentException | IllegalAccessException e) {
				System.err.println("Error in accessing field " + field.getName() + ": " + e.getMessage());
				setWithSuccess = false;
			}
		}
		return setWithSuccess;
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
	
	public static RecursiveTreeResult getASTNodeContainerSkippingParentheses(ASTNode node) {
		EObject container = node.eContainer();
		EObject previousNode = node;
		while(container != null && container instanceof ParenthesizedExpression) {
			previousNode = container;
			container = container.eContainer();
		}
		if(container != null && container instanceof ASTNode) {
			return new RecursiveTreeResult((ASTNode) container, (ASTNode) previousNode);
		}
		return null;
	}
}
