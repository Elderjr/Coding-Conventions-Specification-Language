package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.PrimitiveTypeDouble;

public class PrimitiveTypeDoubleWrapper extends ModiscoWrapper {

	public PrimitiveTypeDoubleWrapper(PrimitiveTypeDouble primitiveTypeDouble) {
        super(primitiveTypeDouble);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
