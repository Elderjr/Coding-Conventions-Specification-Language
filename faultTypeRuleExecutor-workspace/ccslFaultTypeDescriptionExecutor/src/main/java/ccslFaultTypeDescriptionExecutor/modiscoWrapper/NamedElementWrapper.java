package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.NamedElement;

public class NamedElementWrapper extends ModiscoWrapper {

	public NamedElementWrapper(NamedElement namedElement) {
        super(namedElement);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
