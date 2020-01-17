package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.PrimitiveTypeShort;

public class PrimitiveTypeShortWrapper extends ModiscoWrapper {

	public PrimitiveTypeShortWrapper(PrimitiveTypeShort primitiveTypeShort) {
        super(primitiveTypeShort);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
