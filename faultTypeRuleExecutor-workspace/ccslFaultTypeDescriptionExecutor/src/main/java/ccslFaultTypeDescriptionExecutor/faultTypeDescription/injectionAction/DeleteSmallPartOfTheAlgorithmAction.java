package ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionAction;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.AbstractVariablesContainer;
import org.eclipse.gmt.modisco.java.Block;
import org.eclipse.gmt.modisco.java.CatchClause;
import org.eclipse.gmt.modisco.java.DoStatement;
import org.eclipse.gmt.modisco.java.EnhancedForStatement;
import org.eclipse.gmt.modisco.java.ForStatement;
import org.eclipse.gmt.modisco.java.IfStatement;
import org.eclipse.gmt.modisco.java.LabeledStatement;
import org.eclipse.gmt.modisco.java.MethodDeclaration;
import org.eclipse.gmt.modisco.java.ReturnStatement;
import org.eclipse.gmt.modisco.java.SwitchStatement;
import org.eclipse.gmt.modisco.java.TryStatement;
import org.eclipse.gmt.modisco.java.VariableDeclaration;
import org.eclipse.gmt.modisco.java.WhileStatement;

public class DeleteSmallPartOfTheAlgorithmAction implements InjectionAction{

	private void generatesNodesSet(List<? extends ASTNode> nodes, List<ASTNode> selectedNodes) {
		for(ASTNode node : nodes) {
			generatesNodesSet(node, selectedNodes);
		}
	}
	
	private void generatesNodesSet(ASTNode node, List<ASTNode> selectedNodes){
		if(node instanceof ForStatement) {
			generatesNodesSet(((ForStatement) node).getBody(), selectedNodes);
		} else if (node instanceof EnhancedForStatement) {
			generatesNodesSet(((EnhancedForStatement) node).getBody(), selectedNodes);
		} else if (node instanceof DoStatement) {
			generatesNodesSet(((DoStatement) node).getBody(), selectedNodes);
		} else if (node instanceof WhileStatement) {
			generatesNodesSet(((WhileStatement) node).getBody(), selectedNodes);
		} else if (node instanceof IfStatement) {
			generatesNodesSet(((IfStatement) node).getThenStatement(), selectedNodes);
			generatesNodesSet(((IfStatement) node).getElseStatement(), selectedNodes);
		} else if (node instanceof Block) {
			generatesNodesSet(((Block) node).getStatements(), selectedNodes);
		} else if (node instanceof LabeledStatement) {
			generatesNodesSet(((LabeledStatement) node).getBody(), selectedNodes);
		} else if (node instanceof AbstractVariablesContainer) {
			//nothing todo
		} else if(node instanceof ReturnStatement) {
			//nothing todo
		} else if (node instanceof TryStatement) {
			generatesNodesSet(((TryStatement) node).getBody(), selectedNodes);
		} else if (node instanceof CatchClause) {
			generatesNodesSet(((CatchClause) node).getBody(), selectedNodes);
		} else if (node instanceof SwitchStatement) {
			generatesNodesSet(((SwitchStatement) node).getStatements(), selectedNodes);
		} else if(node != null){
			selectedNodes.add(node);
		}
	}
	
	@Override
	public boolean doAction(ASTNode target) {
		if(!(target instanceof MethodDeclaration)) {
			return false;
		}
		MethodDeclaration methodDecl = (MethodDeclaration) target;
		List<ASTNode> selectedNodes = new LinkedList<>();
		generatesNodesSet(methodDecl.getBody(), selectedNodes);
		Random r = new Random();
		if(selectedNodes.size() > 0) {
			ASTNode node = selectedNodes.get(r.nextInt(selectedNodes.size()));
			new DeleteNodeCommand().doAction(node);
			return true;
		}		
		return false;
	}

	
}
