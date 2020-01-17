package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.UnresolvedItemAccess;

public class UnresolvedItemAccessWrapper extends ModiscoWrapper {

	public UnresolvedItemAccessWrapper(UnresolvedItemAccess unresolvedItemAccess) {
        super(unresolvedItemAccess);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
