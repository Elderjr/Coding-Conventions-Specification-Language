package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ArrayType;

public class ArrayTypeWrapper extends ModiscoWrapper {

	public ArrayTypeWrapper(ArrayType arrayType) {
        super(arrayType);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
