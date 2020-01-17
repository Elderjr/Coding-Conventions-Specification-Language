package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ParameterizedType;

public class ParameterizedTypeWrapper extends ModiscoWrapper {

	public ParameterizedTypeWrapper(ParameterizedType parameterizedType) {
        super(parameterizedType);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
