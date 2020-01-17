package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ClassInstanceCreation;

public class ClassInstanceCreationWrapper extends ModiscoWrapper {

	public ClassInstanceCreationWrapper(ClassInstanceCreation classInstanceCreation) {
        super(classInstanceCreation);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
