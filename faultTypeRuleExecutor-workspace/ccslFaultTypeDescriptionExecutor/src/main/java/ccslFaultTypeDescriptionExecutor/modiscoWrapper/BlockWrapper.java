package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.Block;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class BlockWrapper extends ModiscoASTNodeWrapper {

	public BlockWrapper(Block block) {
        super(block);
	}

	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
		Block block = (Block) getASTNode();
		if (block.getStatements().contains(field)) {
			block.getStatements().remove(field);
			return true;
		}
		return false;
	}
	
}
