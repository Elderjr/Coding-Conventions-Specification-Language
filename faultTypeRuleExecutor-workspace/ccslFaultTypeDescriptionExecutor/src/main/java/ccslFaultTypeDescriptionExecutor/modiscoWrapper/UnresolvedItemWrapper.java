package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.UnresolvedItem;

public class UnresolvedItemWrapper extends ModiscoWrapper {

	public UnresolvedItemWrapper(UnresolvedItem unresolvedItem) {
        super(unresolvedItem);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
