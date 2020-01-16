package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.EmptyStatement;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class EmptyStatementWrapper extends ModiscoASTNodeWrapper {

	public EmptyStatementWrapper(EmptyStatement emptyStatement) {
        super(emptyStatement);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from EmptyStatement not supported");
	}
	
}
