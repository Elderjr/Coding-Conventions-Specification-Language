package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.SuperFieldAccess;

public class SuperFieldAccessWrapper extends ModiscoWrapper {

	public SuperFieldAccessWrapper(SuperFieldAccess superFieldAccess) {
        super(superFieldAccess);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
