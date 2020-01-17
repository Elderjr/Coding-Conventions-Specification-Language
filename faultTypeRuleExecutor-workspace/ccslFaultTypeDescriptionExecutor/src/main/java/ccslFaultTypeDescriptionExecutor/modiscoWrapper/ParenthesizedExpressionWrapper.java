package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ParenthesizedExpression;

public class ParenthesizedExpressionWrapper extends ModiscoWrapper {

	public ParenthesizedExpressionWrapper(ParenthesizedExpression parenthesizedExpression) {
        super(parenthesizedExpression);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
