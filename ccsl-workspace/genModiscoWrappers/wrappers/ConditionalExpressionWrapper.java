package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.ConditionalExpression;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class ConditionalExpressionWrapper extends ModiscoASTNodeWrapper {

	public ConditionalExpressionWrapper(ConditionalExpression conditionalExpression) {
        super(conditionalExpression);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from ConditionalExpression not supported");
	}
	
}
