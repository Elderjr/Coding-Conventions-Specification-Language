package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.AbstractMethodInvocation;

public class AbstractMethodInvocationWrapper extends ModiscoWrapper {

	public AbstractMethodInvocationWrapper(AbstractMethodInvocation abstractMethodInvocation) {
        super(abstractMethodInvocation);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
