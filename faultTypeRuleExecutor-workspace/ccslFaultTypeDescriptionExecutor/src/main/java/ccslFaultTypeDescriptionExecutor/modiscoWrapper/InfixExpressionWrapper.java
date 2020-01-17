package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.InfixExpression;

public class InfixExpressionWrapper extends ModiscoWrapper {

	public InfixExpressionWrapper(InfixExpression infixExpression) {
        super(infixExpression);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
