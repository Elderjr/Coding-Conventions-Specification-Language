package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.AbstractTypeQualifiedExpression;

public class AbstractTypeQualifiedExpressionWrapper extends ModiscoWrapper {

	public AbstractTypeQualifiedExpressionWrapper(AbstractTypeQualifiedExpression abstractTypeQualifiedExpression) {
        super(abstractTypeQualifiedExpression);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
