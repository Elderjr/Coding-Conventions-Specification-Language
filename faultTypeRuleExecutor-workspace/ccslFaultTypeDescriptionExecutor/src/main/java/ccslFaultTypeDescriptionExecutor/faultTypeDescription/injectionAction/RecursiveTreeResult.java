package ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionAction;

import org.eclipse.gmt.modisco.java.ASTNode;

class RecursiveTreeResult {

	private ASTNode lastNode;
	private ASTNode previousNode;
	
	public RecursiveTreeResult(ASTNode lastNode, ASTNode previousNode) {
		this.lastNode = lastNode;
		this.previousNode = previousNode;
	}
	
	public ASTNode getLastNode() {
		return this.lastNode;
	}
	
	public ASTNode getPreviousNode() {
		return this.previousNode;
	}
}
