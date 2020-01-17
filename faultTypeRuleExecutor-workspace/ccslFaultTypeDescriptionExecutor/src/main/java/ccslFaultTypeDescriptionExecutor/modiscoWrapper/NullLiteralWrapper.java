package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.NullLiteral;

public class NullLiteralWrapper extends ModiscoWrapper {

	public NullLiteralWrapper(NullLiteral nullLiteral) {
        super(nullLiteral);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
