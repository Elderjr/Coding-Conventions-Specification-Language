package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.Javadoc;

public class JavadocWrapper extends ModiscoWrapper {

	public JavadocWrapper(Javadoc javadoc) {
        super(javadoc);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
