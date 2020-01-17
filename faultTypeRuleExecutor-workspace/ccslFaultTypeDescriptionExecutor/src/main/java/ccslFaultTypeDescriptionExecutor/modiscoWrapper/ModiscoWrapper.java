package ccslFaultTypeDescriptionExecutor.modiscoWrapper;

import org.eclipse.gmt.modisco.java.ASTNode;

public abstract class ModiscoWrapper implements VisitableModiscoWrapper {

	private ASTNode node;
	
	public ModiscoWrapper(ASTNode node) {
		this.node = node;
	}
	
	public ASTNode getASTNode() {
		return node;
	}
}
