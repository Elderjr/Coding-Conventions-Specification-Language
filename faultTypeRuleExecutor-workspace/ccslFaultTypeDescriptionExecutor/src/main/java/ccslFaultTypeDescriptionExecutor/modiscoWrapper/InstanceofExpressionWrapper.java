package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.InstanceofExpression;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class InstanceofExpressionWrapper extends ModiscoASTNodeWrapper {

	public InstanceofExpressionWrapper(InstanceofExpression instanceofExpression) {
        super(instanceofExpression);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from InstanceofExpression not supported");
	}
	
}
