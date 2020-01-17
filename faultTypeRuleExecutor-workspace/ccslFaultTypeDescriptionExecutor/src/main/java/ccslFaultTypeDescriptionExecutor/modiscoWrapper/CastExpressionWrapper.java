package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.CastExpression;

public class CastExpressionWrapper extends ModiscoWrapper {

	public CastExpressionWrapper(CastExpression castExpression) {
        super(castExpression);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
