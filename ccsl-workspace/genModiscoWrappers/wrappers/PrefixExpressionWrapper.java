package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.PrefixExpression;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class PrefixExpressionWrapper extends ModiscoASTNodeWrapper {

	public PrefixExpressionWrapper(PrefixExpression prefixExpression) {
        super(prefixExpression);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from PrefixExpression not supported");
	}
	
}
