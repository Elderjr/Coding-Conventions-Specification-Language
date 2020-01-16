package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.ASTNode;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class ASTNodeWrapper extends ModiscoASTNodeWrapper {

	public ASTNodeWrapper(ASTNode aSTNode) {
        super(aSTNode);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from ASTNode not supported");
	}
	
}
