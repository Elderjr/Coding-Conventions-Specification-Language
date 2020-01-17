package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.TagElement;

public class TagElementWrapper extends ModiscoWrapper {

	public TagElementWrapper(TagElement tagElement) {
        super(tagElement);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
