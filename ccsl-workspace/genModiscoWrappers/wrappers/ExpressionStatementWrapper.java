package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.ExpressionStatement;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class ExpressionStatementWrapper extends ModiscoASTNodeWrapper {

	public ExpressionStatementWrapper(ExpressionStatement expressionStatement) {
        super(expressionStatement);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from ExpressionStatement not supported");
	}
	
}
