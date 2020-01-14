package faultTypeRuleExecutor.command.impl;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;

import faultTypeRuleExecutor.command.InjectionAction;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.Assignment;
import org.eclipse.gmt.modisco.java.Block;
import org.eclipse.gmt.modisco.java.DoStatement;
import org.eclipse.gmt.modisco.java.EmptyStatement;
import org.eclipse.gmt.modisco.java.EnhancedForStatement;
import org.eclipse.gmt.modisco.java.ExpressionStatement;
import org.eclipse.gmt.modisco.java.ForStatement;
import org.eclipse.gmt.modisco.java.IfStatement;
import org.eclipse.gmt.modisco.java.LabeledStatement;
import org.eclipse.gmt.modisco.java.MethodInvocation;
import org.eclipse.gmt.modisco.java.ParenthesizedExpression;
import org.eclipse.gmt.modisco.java.WhileStatement;
import org.eclipse.gmt.modisco.java.emf.JavaPackage;
import org.eclipse.gmt.modisco.java.emf.impl.JavaPackageImpl;

public class DeleteNodeCommand implements InjectionAction {

	@Override
	public boolean doAction(ASTNode target) {
		ASTNode nodeToBeDeleted = getNodeToBeDeleted(target);
		if(isNodeShouldBeReplacedToEmptyBlock(nodeToBeDeleted)) {
			ActionUtils.setValue(nodeToBeDeleted, JavaPackageImpl.eINSTANCE.getJavaFactory().createEmptyStatement());
		} else if(nodeToBeDeleted instanceof Assignment){
			deleteAssignment((Assignment) nodeToBeDeleted);
		} else {
			deleteGenericNode(nodeToBeDeleted);
		}
		return true;
	}
	
	private ASTNode getNodeToBeDeleted(ASTNode target) {
		if(target.eContainer() != null && target.eContainer() instanceof ExpressionStatement) {
			return (ASTNode) target.eContainer();
		}
		return target;
	}
	
	private boolean isNodeShouldBeReplacedToEmptyBlock(ASTNode target) {
		if(target.eContainer() != null) {
			if(target.eContainer() instanceof IfStatement) {
				IfStatement ifStmt = (IfStatement) target.eContainer();
				return ifStmt.getThenStatement() == target || ifStmt.getElseStatement() == target;
			} else if(target.eContainer() instanceof WhileStatement) {
				WhileStatement whileStmt = (WhileStatement) target.eContainer();
				return whileStmt.getBody() == target;
			}else if (target.eContainer() instanceof ForStatement) {
				ForStatement forStmt = (ForStatement) target.eContainer();
				return forStmt.getBody() == target;
			}else if (target.eContainer() instanceof EnhancedForStatement) {
				EnhancedForStatement forStmt = (EnhancedForStatement) target.eContainer();
				return forStmt.getBody() == target;
			}else if (target.eContainer() instanceof DoStatement) {
				DoStatement doStmt = (DoStatement) target.eContainer();
				return doStmt.getBody() == target;
			} else if (target.eContainer() instanceof LabeledStatement) {
				LabeledStatement labelStmt = (LabeledStatement) target.eContainer();
				return labelStmt.getBody() == target;
			}
		}
		return false;
	}
	
	private void deleteAssignment(Assignment assignment) {
		if(!(assignment.eContainer() instanceof Block)) {
			ActionUtils.setValue(assignment, assignment.getLeftHandSide());
		} else {
			deleteGenericNode(assignment);
		}
	}
	
	private void deleteGenericNode(ASTNode node) {
		Object container = node.eContainer();
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
				if (fieldValue == node) {
					containerField.set(container, null);
				} else if (fieldValue instanceof Collection) {
					Collection<?> values = (Collection<?>) fieldValue;
					values.remove(node);
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
