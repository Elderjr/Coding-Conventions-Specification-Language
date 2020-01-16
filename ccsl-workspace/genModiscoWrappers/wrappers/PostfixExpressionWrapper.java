package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.PostfixExpression;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class PostfixExpressionWrapper extends ModiscoASTNodeWrapper {

	public PostfixExpressionWrapper(PostfixExpression postfixExpression) {
        super(postfixExpression);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from PostfixExpression not supported");
	}
	
}
