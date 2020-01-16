package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.EnhancedForStatement;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class EnhancedForStatementWrapper extends ModiscoASTNodeWrapper {

	public EnhancedForStatementWrapper(EnhancedForStatement enhancedForStatement) {
        super(enhancedForStatement);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from EnhancedForStatement not supported");
	}
	
}
