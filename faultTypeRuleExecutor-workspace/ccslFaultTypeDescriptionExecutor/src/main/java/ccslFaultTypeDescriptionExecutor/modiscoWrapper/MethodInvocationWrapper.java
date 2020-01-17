package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.MethodInvocation;

public class MethodInvocationWrapper extends ModiscoWrapper {

	public MethodInvocationWrapper(MethodInvocation methodInvocation) {
        super(methodInvocation);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
