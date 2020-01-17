package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ArrayAccess;

public class ArrayAccessWrapper extends ModiscoWrapper {

	public ArrayAccessWrapper(ArrayAccess arrayAccess) {
        super(arrayAccess);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
