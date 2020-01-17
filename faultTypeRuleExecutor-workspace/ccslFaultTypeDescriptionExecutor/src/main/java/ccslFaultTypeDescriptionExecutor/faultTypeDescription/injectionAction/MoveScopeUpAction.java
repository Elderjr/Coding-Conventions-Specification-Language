package ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionAction;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.Block;
import org.eclipse.gmt.modisco.java.BooleanLiteral;
import org.eclipse.gmt.modisco.java.CatchClause;
import org.eclipse.gmt.modisco.java.DoStatement;
import org.eclipse.gmt.modisco.java.EnhancedForStatement;
import org.eclipse.gmt.modisco.java.ForStatement;
import org.eclipse.gmt.modisco.java.IfStatement;
import org.eclipse.gmt.modisco.java.LabeledStatement;
import org.eclipse.gmt.modisco.java.Statement;
import org.eclipse.gmt.modisco.java.TryStatement;
import org.eclipse.gmt.modisco.java.WhileStatement;
import org.eclipse.gmt.modisco.java.emf.JavaPackage;
import org.eclipse.gmt.modisco.java.emf.impl.BlockImpl;
import org.eclipse.gmt.modisco.java.emf.impl.ClassDeclarationImpl;
import org.eclipse.gmt.modisco.java.emf.impl.IfStatementImpl;

import ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionAction.ActionUtils.Triple;

public class MoveScopeUpAction implements InjectionAction {

	private boolean isScope(ASTNode node) {
		return (node instanceof Block) || (node instanceof IfStatement) || (node instanceof ForStatement)
				|| (node instanceof EnhancedForStatement) || (node instanceof DoStatement)
				|| (node instanceof WhileStatement) || (node instanceof CatchClause) || (node instanceof TryStatement)
				|| (node instanceof LabeledStatement);
	}

	private boolean hasContainer(ASTNode node) {
		return node.eContainer() != null && node.eContainer() instanceof ASTNode;
	}

	private boolean shouldScopeBeSkipped(ASTNode node, boolean skipInnerBlocks) {
		if (node != null && hasContainer(node)) {
			if (skipInnerBlocks && node instanceof Block) {
				// block container is a scope but not an block,i.e., inline block if(){, do(){s
				return (!(node.eContainer() instanceof Block) && (isScope((ASTNode) node.eContainer())));
			} else if (node instanceof IfStatement) {
				// inline if-elses
				return node.eContainer() instanceof IfStatement
						&& ((IfStatement) node.eContainer()).getElseStatement() == node;
			}
		}
		return false;
	}

	@Override
	public boolean doAction(ASTNode node) {
		if (!(node instanceof Statement))
			return false;
		if (hasContainer(node)) {
			ASTNode nodeScope = (ASTNode) node.eContainer();
			while (nodeScope != null && hasContainer(nodeScope)
					&& (shouldScopeBeSkipped(nodeScope, true) || !isScope(nodeScope))) {
				nodeScope = (ASTNode) nodeScope.eContainer();
			}
			if (hasContainer(nodeScope)) {
				ASTNode superNodeScope = (ASTNode) nodeScope.eContainer();
				ASTNode previousNode = nodeScope;
				while (superNodeScope != null && hasContainer(superNodeScope)
						&& (shouldScopeBeSkipped(superNodeScope, false) || !isScope(superNodeScope))) {
					previousNode = superNodeScope;
					superNodeScope = (ASTNode) superNodeScope.eContainer();
				}
				if (superNodeScope != null) {
					new DeleteNodeCommand().doAction(node);
					if (shouldCreateANewBlock(superNodeScope, previousNode)) {
						Block block = JavaPackage.eINSTANCE.getJavaFactory().createBlock();
						boolean success = ActionUtils.setValue(previousNode, block);
						block.getStatements().add((Statement) node);
						block.getStatements().add((Statement) previousNode);
						return success;
					} else {
						return moveNode(node, superNodeScope, previousNode);
					}
				}
			}
		}
		return false;
	}

	private boolean shouldCreateANewBlock(ASTNode container, ASTNode field) {
		if (!(field instanceof Block)) {
			if (container instanceof IfStatement) {
				IfStatement ifStmt = (IfStatement) container;
				return ifStmt.getThenStatement() == field || ifStmt.getElseStatement() == field;
			} else if (container instanceof ForStatement) {
				return ((ForStatement) container).getBody() == field;
			} else if (container instanceof EnhancedForStatement) {
				return ((EnhancedForStatement) container).getBody() == field;
			} else if (container instanceof DoStatement) {
				return ((DoStatement) container).getBody() == field;
			} else if (container instanceof WhileStatement) {
				return ((WhileStatement) container).getBody() == field;
			} else if (container instanceof LabeledStatement) {
				return ((LabeledStatement) container).getBody() == field;
			}
		}
		return false;
	}

	private boolean moveNode(ASTNode newNodeField, ASTNode container, ASTNode nodeField) {
		boolean getValueWithSuccess = false;
		boolean setValueWithSuccess = false;
		for (Triple t : ActionUtils.getTripleValues(container.getClass())) {
			Object fieldValue = null;
			try {
				fieldValue = t.getterMethod.invoke(container);
				getValueWithSuccess = true;
			} catch (IllegalArgumentException | IllegalAccessException | InvocationTargetException e) {
				System.err.println("Error in accessing method" + t.getterMethod.getName() + ": " + e.getMessage());
				getValueWithSuccess = false;
			}
			if (!getValueWithSuccess)
				return false;
			if (fieldValue == nodeField && t.setterMethod != null) {
				// Monovalued
				try {
					t.setterMethod.invoke(container, newNodeField);
					setValueWithSuccess = true;
				} catch (IllegalArgumentException | IllegalAccessException | InvocationTargetException e) {
					System.err.println("Error in accessing method" + t.setterMethod.getName() + ": " + e.getMessage());
				}
			} else if (fieldValue instanceof List) {
				// Multivalued
				List<ASTNode> values = (List<ASTNode>) fieldValue;
				if (values.contains(nodeField) && !values.contains(newNodeField)) {
					setValueWithSuccess = true;
					int fieldIndex = values.indexOf(nodeField);
					values.add(fieldIndex, newNodeField);
				}
			}
		}
		return setValueWithSuccess;
	}
}
