package ccslFaultTypeDescriptionExecutor.modiscoWrapper;

import org.eclipse.gmt.modisco.java.ASTNode;

public abstract class ModiscoASTNodeWrapper {

	private ASTNode node;
	
	public ModiscoASTNodeWrapper(ASTNode node) {
		this.node = node;
	}
	
	public abstract boolean deleteField(ASTNode field, ASTNode originalFieldNode);
	
	protected ASTNode getASTNode() {
		return node;
	}
	
	public ModiscoASTNodeWrapper eContainer() {
		if(node.eContainer() != null && node.eContainer() instanceof ASTNode) {
			return ModiscoJavaToWrapper.modiscoJavaToWrapper((ASTNode) node.eContainer());
		}
		return null;
	}
}
