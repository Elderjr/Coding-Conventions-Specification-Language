package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ClassFile;

public class ClassFileWrapper extends ModiscoWrapper {

	public ClassFileWrapper(ClassFile classFile) {
        super(classFile);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
