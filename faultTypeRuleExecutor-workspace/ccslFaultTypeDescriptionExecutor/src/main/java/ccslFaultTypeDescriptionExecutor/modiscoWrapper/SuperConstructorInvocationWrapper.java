package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.SuperConstructorInvocation;

public class SuperConstructorInvocationWrapper extends ModiscoWrapper {

	public SuperConstructorInvocationWrapper(SuperConstructorInvocation superConstructorInvocation) {
        super(superConstructorInvocation);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
