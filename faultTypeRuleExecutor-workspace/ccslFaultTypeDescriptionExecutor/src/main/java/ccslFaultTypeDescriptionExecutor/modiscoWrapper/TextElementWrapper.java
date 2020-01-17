package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.TextElement;

public class TextElementWrapper extends ModiscoWrapper {

	public TextElementWrapper(TextElement textElement) {
        super(textElement);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
