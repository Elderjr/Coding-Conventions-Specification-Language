package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.AbstractTypeQualifiedExpression;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class AbstractTypeQualifiedExpressionWrapper extends ModiscoASTNodeWrapper {

	public AbstractTypeQualifiedExpressionWrapper(AbstractTypeQualifiedExpression abstractTypeQualifiedExpression) {
        super(abstractTypeQualifiedExpression);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from AbstractTypeQualifiedExpression not supported");
	}
	
}
