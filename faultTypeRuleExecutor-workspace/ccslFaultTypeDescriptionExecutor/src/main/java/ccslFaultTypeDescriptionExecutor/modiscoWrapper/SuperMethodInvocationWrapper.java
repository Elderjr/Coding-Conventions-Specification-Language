package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.SuperMethodInvocation;

public class SuperMethodInvocationWrapper extends ModiscoWrapper {

	public SuperMethodInvocationWrapper(SuperMethodInvocation superMethodInvocation) {
        super(superMethodInvocation);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
