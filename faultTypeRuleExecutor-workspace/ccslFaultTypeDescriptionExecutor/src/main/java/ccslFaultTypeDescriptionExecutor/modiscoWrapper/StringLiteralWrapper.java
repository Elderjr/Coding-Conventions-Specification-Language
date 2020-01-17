package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.StringLiteral;

public class StringLiteralWrapper extends ModiscoWrapper {

	public StringLiteralWrapper(StringLiteral stringLiteral) {
        super(stringLiteral);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
