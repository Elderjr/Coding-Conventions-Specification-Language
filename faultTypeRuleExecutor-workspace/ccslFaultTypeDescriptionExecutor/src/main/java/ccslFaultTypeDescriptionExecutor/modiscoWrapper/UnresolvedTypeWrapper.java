package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.UnresolvedType;

public class UnresolvedTypeWrapper extends ModiscoWrapper {

	public UnresolvedTypeWrapper(UnresolvedType unresolvedType) {
        super(unresolvedType);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
