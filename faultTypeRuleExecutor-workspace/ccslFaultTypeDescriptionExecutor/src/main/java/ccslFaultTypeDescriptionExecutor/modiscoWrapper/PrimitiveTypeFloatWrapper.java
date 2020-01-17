package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.PrimitiveTypeFloat;

public class PrimitiveTypeFloatWrapper extends ModiscoWrapper {

	public PrimitiveTypeFloatWrapper(PrimitiveTypeFloat primitiveTypeFloat) {
        super(primitiveTypeFloat);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
