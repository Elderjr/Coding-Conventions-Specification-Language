package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.ParenthesizedExpression;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class ParenthesizedExpressionWrapper extends ModiscoASTNodeWrapper {

	public ParenthesizedExpressionWrapper(ParenthesizedExpression parenthesizedExpression) {
        super(parenthesizedExpression);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from ParenthesizedExpression not supported");
	}
	
}
