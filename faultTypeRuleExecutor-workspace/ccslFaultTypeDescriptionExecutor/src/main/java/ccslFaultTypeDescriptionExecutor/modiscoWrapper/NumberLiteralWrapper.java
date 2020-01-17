package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.NumberLiteral;

public class NumberLiteralWrapper extends ModiscoWrapper {

	public NumberLiteralWrapper(NumberLiteral numberLiteral) {
        super(numberLiteral);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
