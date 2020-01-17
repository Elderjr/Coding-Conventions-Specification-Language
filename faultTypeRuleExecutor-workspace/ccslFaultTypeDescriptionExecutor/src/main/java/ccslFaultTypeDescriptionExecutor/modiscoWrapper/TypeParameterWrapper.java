package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.TypeParameter;

public class TypeParameterWrapper extends ModiscoWrapper {

	public TypeParameterWrapper(TypeParameter typeParameter) {
        super(typeParameter);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
