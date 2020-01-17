package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.FieldAccess;

public class FieldAccessWrapper extends ModiscoWrapper {

	public FieldAccessWrapper(FieldAccess fieldAccess) {
        super(fieldAccess);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
