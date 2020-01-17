package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.Initializer;

public class InitializerWrapper extends ModiscoWrapper {

	public InitializerWrapper(Initializer initializer) {
        super(initializer);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
