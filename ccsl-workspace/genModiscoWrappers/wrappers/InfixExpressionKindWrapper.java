package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.InfixExpressionKind;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class InfixExpressionKindWrapper extends ModiscoASTNodeWrapper {

	public InfixExpressionKindWrapper(InfixExpressionKind infixExpressionKind) {
        super(infixExpressionKind);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from InfixExpressionKind not supported");
	}
	
}
