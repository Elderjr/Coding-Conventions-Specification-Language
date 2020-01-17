package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ArrayCreation;

public class ArrayCreationWrapper extends ModiscoWrapper {

	public ArrayCreationWrapper(ArrayCreation arrayCreation) {
        super(arrayCreation);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
