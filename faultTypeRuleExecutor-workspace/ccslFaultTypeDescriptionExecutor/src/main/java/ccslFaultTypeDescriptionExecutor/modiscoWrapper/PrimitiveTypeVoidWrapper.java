package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.PrimitiveTypeVoid;

public class PrimitiveTypeVoidWrapper extends ModiscoWrapper {

	public PrimitiveTypeVoidWrapper(PrimitiveTypeVoid primitiveTypeVoid) {
        super(primitiveTypeVoid);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
