package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.MethodRefParameter;

public class MethodRefParameterWrapper extends ModiscoWrapper {

	public MethodRefParameterWrapper(MethodRefParameter methodRefParameter) {
        super(methodRefParameter);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
