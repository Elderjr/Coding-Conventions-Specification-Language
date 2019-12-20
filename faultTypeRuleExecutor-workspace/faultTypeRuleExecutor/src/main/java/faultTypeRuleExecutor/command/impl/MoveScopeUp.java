package faultTypeRuleExecutor.command.impl;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.Block;
import org.eclipse.gmt.modisco.java.DoStatement;
import org.eclipse.gmt.modisco.java.EnhancedForStatement;
import org.eclipse.gmt.modisco.java.ForStatement;
import org.eclipse.gmt.modisco.java.IfStatement;
import org.eclipse.gmt.modisco.java.WhileStatement;

import faultTypeRuleExecutor.command.InjectionAction;

public class MoveScopeUp implements InjectionAction {

	private class ScopeTreeResult {
		private ASTNode scope;
		private ASTNode previousNode;
	}

	@Override
	public void doAction(ASTNode node) {
		if (node == null)
			return;
		ScopeTreeResult nodeScope = getScope(node);
		ScopeTreeResult superScope = null;
		if (nodeScope != null) {
			ASTNode scope = nodeScope.scope;
			//Skips if(){ or while(){ or for(){ or do{
			if (scope instanceof Block && !(scope.eContainer() instanceof Block)) {
				scope = (ASTNode) scope.eContainer();
			}
			//Skips if-else
			while (scope instanceof IfStatement && scope.eContainer() != null
					&& scope.eContainer() instanceof IfStatement
					&& ((IfStatement) scope.eContainer()).getElseStatement() == scope) {
				scope = ((ASTNode) scope.eContainer());
			}
			superScope = getScope(scope);
		}
		if (superScope != null) {
			for (Field field : ActionUtils.getAllClassFields(superScope.scope.getClass())) {
				if (Modifier.isStatic(field.getModifiers())) {
					continue;
				}
				if (!field.canAccess(superScope.scope)) {
					field.setAccessible(true);
				}
				try {
					Object fieldValue = field.get(superScope.scope);
					if (fieldValue == superScope.previousNode) {
						// Monovalued
						field.set(superScope.scope, node);
					} else if (fieldValue instanceof Collection) {
						// Multivalued
						EObjectContainmentEList<ASTNode> values = (EObjectContainmentEList<ASTNode>) fieldValue;
						if (values.contains(superScope.previousNode)) {
							int indexOfPreviousNode = values.indexOf(superScope.previousNode);
							values.add(indexOfPreviousNode, node);
						}
					}
				} catch (IllegalArgumentException | IllegalAccessException e) {
					System.err.println("Error in accessing field " + field.getName() + ": " + e.getMessage());
				}
			}
		}

	}

	private boolean isScope(ASTNode node) {
		return (node instanceof Block) || (node instanceof IfStatement) || (node instanceof ForStatement)
				|| (node instanceof EnhancedForStatement) || (node instanceof DoStatement)
				|| (node instanceof WhileStatement);
	}

	private ScopeTreeResult getScope(ASTNode node) {
		ASTNode previousNode = null;
		ASTNode currentNode = node;
		do {
			if (currentNode != null && currentNode.eContainer() != null
					&& currentNode.eContainer() instanceof ASTNode) {
				previousNode = currentNode;
				currentNode = (ASTNode) currentNode.eContainer();
			}
		} while (!isScope(currentNode) && currentNode != null && currentNode instanceof ASTNode);
		if (currentNode != null && currentNode instanceof ASTNode && previousNode != null) {
			ScopeTreeResult result = new ScopeTreeResult();
			result.scope = currentNode;
			result.previousNode = previousNode;
			return result;
		}
		return null;
	}
}
