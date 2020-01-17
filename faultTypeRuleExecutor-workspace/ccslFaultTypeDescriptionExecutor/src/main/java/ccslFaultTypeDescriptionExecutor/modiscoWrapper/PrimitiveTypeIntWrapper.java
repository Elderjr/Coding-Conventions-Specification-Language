package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.PrimitiveTypeInt;

public class PrimitiveTypeIntWrapper extends ModiscoWrapper {

	public PrimitiveTypeIntWrapper(PrimitiveTypeInt primitiveTypeInt) {
        super(primitiveTypeInt);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
