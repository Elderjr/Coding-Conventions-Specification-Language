package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.PrefixExpressionKind;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class PrefixExpressionKindWrapper extends ModiscoASTNodeWrapper {

	public PrefixExpressionKindWrapper(PrefixExpressionKind prefixExpressionKind) {
        super(prefixExpressionKind);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from PrefixExpressionKind not supported");
	}
	
}
