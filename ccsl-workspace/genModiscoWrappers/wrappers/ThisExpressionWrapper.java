package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.ThisExpression;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class ThisExpressionWrapper extends ModiscoASTNodeWrapper {

	public ThisExpressionWrapper(ThisExpression thisExpression) {
        super(thisExpression);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from ThisExpression not supported");
	}
	
}
