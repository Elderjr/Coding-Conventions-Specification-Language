package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.PrimitiveTypeChar;

public class PrimitiveTypeCharWrapper extends ModiscoWrapper {

	public PrimitiveTypeCharWrapper(PrimitiveTypeChar primitiveTypeChar) {
        super(primitiveTypeChar);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
