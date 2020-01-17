package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.PrimitiveTypeBoolean;

public class PrimitiveTypeBooleanWrapper extends ModiscoWrapper {

	public PrimitiveTypeBooleanWrapper(PrimitiveTypeBoolean primitiveTypeBoolean) {
        super(primitiveTypeBoolean);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
