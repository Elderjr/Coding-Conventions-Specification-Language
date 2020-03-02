package ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionAction;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.AbstractVariablesContainer;
import org.eclipse.gmt.modisco.java.Block;
import org.eclipse.gmt.modisco.java.CatchClause;
import org.eclipse.gmt.modisco.java.ClassDeclaration;
import org.eclipse.gmt.modisco.java.DoStatement;
import org.eclipse.gmt.modisco.java.EnhancedForStatement;
import org.eclipse.gmt.modisco.java.FieldAccess;
import org.eclipse.gmt.modisco.java.FieldDeclaration;
import org.eclipse.gmt.modisco.java.ForStatement;
import org.eclipse.gmt.modisco.java.IfStatement;
import org.eclipse.gmt.modisco.java.LabeledStatement;
import org.eclipse.gmt.modisco.java.MethodDeclaration;
import org.eclipse.gmt.modisco.java.MethodInvocation;
import org.eclipse.gmt.modisco.java.Package;
import org.eclipse.gmt.modisco.java.ReturnStatement;
import org.eclipse.gmt.modisco.java.SingleVariableAccess;
import org.eclipse.gmt.modisco.java.SingleVariableDeclaration;
import org.eclipse.gmt.modisco.java.SuperFieldAccess;
import org.eclipse.gmt.modisco.java.SwitchStatement;
import org.eclipse.gmt.modisco.java.TryStatement;
import org.eclipse.gmt.modisco.java.Type;
import org.eclipse.gmt.modisco.java.VariableDeclaration;
import org.eclipse.gmt.modisco.java.VariableDeclarationExpression;
import org.eclipse.gmt.modisco.java.VariableDeclarationFragment;
import org.eclipse.gmt.modisco.java.VariableDeclarationStatement;
import org.eclipse.gmt.modisco.java.WhileStatement;
import org.eclipse.gmt.modisco.java.emf.JavaPackage;

public class ReplaceVariableAccessAction implements InjectionAction {

	private void getAllCandidateVariables(ASTNode currentNode, ASTNode previousNode,
			List<VariableDeclaration> selectedNodes) {
		if (currentNode == null || currentNode instanceof Package)
			return;
		if (currentNode instanceof Block) {
			Block block = (Block) currentNode;
			for (int i = 0; i < block.getStatements().indexOf(previousNode); i++) {
				ASTNode n = block.getStatements().get(i);
				if (n instanceof AbstractVariablesContainer) {
					selectedNodes.addAll(((AbstractVariablesContainer) n).getFragments());
				}
			}
		} else if (currentNode instanceof ClassDeclaration) {
			ClassDeclaration clazzDecl = (ClassDeclaration) currentNode;
			for (ASTNode n : clazzDecl.getBodyDeclarations()) {
				if (n instanceof FieldDeclaration) {
					selectedNodes.addAll(((FieldDeclaration) n).getFragments());
				}
			}
		} else if (currentNode instanceof MethodDeclaration) {
			MethodDeclaration methodDecl = (MethodDeclaration) currentNode;
			for (SingleVariableDeclaration n : methodDecl.getParameters()) {
				selectedNodes.add(n);
			}
		} else if (currentNode instanceof AbstractVariablesContainer) {
			selectedNodes.addAll(((AbstractVariablesContainer) currentNode).getFragments());
		} else if(currentNode instanceof ForStatement) {
			ForStatement forStmt = (ForStatement) currentNode;
			for (ASTNode n : forStmt.getInitializers()) {
				if (n instanceof AbstractVariablesContainer) {
					selectedNodes.addAll(((AbstractVariablesContainer) n).getFragments());
				}
			}
		} else if(currentNode instanceof EnhancedForStatement) {
			EnhancedForStatement forStmt = (EnhancedForStatement) currentNode;
			selectedNodes.add(forStmt.getParameter());
		}
		getAllCandidateVariables((ASTNode) currentNode.eContainer(), currentNode, selectedNodes);
	}

	private Type getVariableType(VariableDeclaration v) {
		if (v instanceof SingleVariableDeclaration) {
			return ((SingleVariableDeclaration) v).getType().getType();
		} else if (v instanceof VariableDeclarationFragment) {
			VariableDeclarationFragment varDecl = ((VariableDeclarationFragment) v);
			if (varDecl.getVariablesContainer() != null && varDecl.getVariablesContainer().getType() != null) {
				return ((VariableDeclarationFragment) v).getVariablesContainer().getType().getType();
			}
		}
		return null;
	}

	private boolean hasSameType(VariableDeclaration v1, VariableDeclaration v2) {
		if(v1 != null && v2 != null) {
			Type typeV1 = getVariableType(v1);
			Type typeV2 = getVariableType(v2);
			return v1.getExtraArrayDimensions() == v2.getExtraArrayDimensions() && typeV1 != null && typeV2 != null
					&& typeV1 == typeV2;
		}
		return false;
	}

	@Override
	public boolean doAction(ASTNode target) {
		if (target instanceof SingleVariableAccess || target instanceof FieldAccess || target instanceof SuperFieldAccess) {
			VariableDeclaration varDecl = null;
			if(target instanceof SingleVariableAccess) {
				varDecl = ((SingleVariableAccess) target).getVariable();
			}else {
				varDecl = ((FieldAccess) target).getField().getVariable();
			}
			List<VariableDeclaration> candidates = new LinkedList<>();
			getAllCandidateVariables(target, null, candidates);
			ASTNode container = target;
			while (container != null && container instanceof ASTNode
					&& !(container instanceof AbstractVariablesContainer)) {
				if(container.eContainer() != null && container.eContainer() instanceof ASTNode) {
					container = (ASTNode) container.eContainer();
				} else {
					container = null;
				}
			}
			if (container != null && container instanceof AbstractVariablesContainer) {
				AbstractVariablesContainer varContainer = (AbstractVariablesContainer) container;
				candidates.removeAll(varContainer.getFragments());
			}
			for (VariableDeclaration v : candidates) {
				if (varDecl != v && hasSameType(varDecl, v)) {
					SingleVariableAccess newVarAccess = JavaPackage.eINSTANCE.getJavaFactory()
							.createSingleVariableAccess();
					newVarAccess.setVariable(v);
					ActionUtils.setValue(target, newVarAccess);
					return true;
				}
			}
		}
		return false;
	}
}
