package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.TypeAccess;

public class TypeAccessWrapper extends ModiscoWrapper {

	public TypeAccessWrapper(TypeAccess typeAccess) {
        super(typeAccess);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
