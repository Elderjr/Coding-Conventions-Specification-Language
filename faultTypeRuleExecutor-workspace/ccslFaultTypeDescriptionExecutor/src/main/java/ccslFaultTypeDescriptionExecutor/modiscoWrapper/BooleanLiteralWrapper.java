package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.BooleanLiteral;

public class BooleanLiteralWrapper extends ModiscoWrapper {

	public BooleanLiteralWrapper(BooleanLiteral booleanLiteral) {
        super(booleanLiteral);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
