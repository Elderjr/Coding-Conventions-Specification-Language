package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.MethodRef;

public class MethodRefWrapper extends ModiscoWrapper {

	public MethodRefWrapper(MethodRef methodRef) {
        super(methodRef);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
