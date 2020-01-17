package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.PrefixExpression;

public class PrefixExpressionWrapper extends ModiscoWrapper {

	public PrefixExpressionWrapper(PrefixExpression prefixExpression) {
        super(prefixExpression);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
