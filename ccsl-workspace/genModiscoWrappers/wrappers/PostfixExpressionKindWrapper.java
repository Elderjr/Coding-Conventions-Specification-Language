package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.PostfixExpressionKind;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class PostfixExpressionKindWrapper extends ModiscoASTNodeWrapper {

	public PostfixExpressionKindWrapper(PostfixExpressionKind postfixExpressionKind) {
        super(postfixExpressionKind);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from PostfixExpressionKind not supported");
	}
	
}
