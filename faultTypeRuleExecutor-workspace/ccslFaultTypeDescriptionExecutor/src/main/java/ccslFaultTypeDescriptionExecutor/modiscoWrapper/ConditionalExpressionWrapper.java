package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ConditionalExpression;

public class ConditionalExpressionWrapper extends ModiscoWrapper {

	public ConditionalExpressionWrapper(ConditionalExpression conditionalExpression) {
        super(conditionalExpression);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
