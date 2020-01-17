package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ArrayInitializer;

public class ArrayInitializerWrapper extends ModiscoWrapper {

	public ArrayInitializerWrapper(ArrayInitializer arrayInitializer) {
        super(arrayInitializer);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
