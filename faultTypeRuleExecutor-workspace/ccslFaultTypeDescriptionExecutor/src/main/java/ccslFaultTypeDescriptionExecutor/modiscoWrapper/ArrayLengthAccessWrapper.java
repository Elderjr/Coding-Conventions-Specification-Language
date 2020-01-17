package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ArrayLengthAccess;

public class ArrayLengthAccessWrapper extends ModiscoWrapper {

	public ArrayLengthAccessWrapper(ArrayLengthAccess arrayLengthAccess) {
        super(arrayLengthAccess);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
