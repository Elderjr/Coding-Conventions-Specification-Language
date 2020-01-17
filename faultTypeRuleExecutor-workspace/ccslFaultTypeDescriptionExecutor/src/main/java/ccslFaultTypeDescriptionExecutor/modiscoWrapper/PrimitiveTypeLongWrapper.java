package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.PrimitiveTypeLong;

public class PrimitiveTypeLongWrapper extends ModiscoWrapper {

	public PrimitiveTypeLongWrapper(PrimitiveTypeLong primitiveTypeLong) {
        super(primitiveTypeLong);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
