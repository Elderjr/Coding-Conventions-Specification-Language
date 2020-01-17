package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.Type;

public class TypeWrapper extends ModiscoWrapper {

	public TypeWrapper(Type type) {
        super(type);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
