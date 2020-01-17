package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.PrimitiveType;

public class PrimitiveTypeWrapper extends ModiscoWrapper {

	public PrimitiveTypeWrapper(PrimitiveType primitiveType) {
        super(primitiveType);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
