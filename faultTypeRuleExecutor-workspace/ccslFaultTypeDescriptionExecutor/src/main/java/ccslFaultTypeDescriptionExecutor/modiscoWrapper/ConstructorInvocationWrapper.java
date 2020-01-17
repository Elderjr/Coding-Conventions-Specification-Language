package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ConstructorInvocation;

public class ConstructorInvocationWrapper extends ModiscoWrapper {

	public ConstructorInvocationWrapper(ConstructorInvocation constructorInvocation) {
        super(constructorInvocation);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
