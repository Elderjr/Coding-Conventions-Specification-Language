package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.PrimitiveTypeByte;

public class PrimitiveTypeByteWrapper extends ModiscoWrapper {

	public PrimitiveTypeByteWrapper(PrimitiveTypeByte primitiveTypeByte) {
        super(primitiveTypeByte);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
