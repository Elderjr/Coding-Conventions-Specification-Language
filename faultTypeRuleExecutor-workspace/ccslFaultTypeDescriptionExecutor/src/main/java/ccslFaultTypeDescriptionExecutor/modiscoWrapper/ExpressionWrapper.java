package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.Expression;

public class ExpressionWrapper extends ModiscoWrapper {

	public ExpressionWrapper(Expression expression) {
        super(expression);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
