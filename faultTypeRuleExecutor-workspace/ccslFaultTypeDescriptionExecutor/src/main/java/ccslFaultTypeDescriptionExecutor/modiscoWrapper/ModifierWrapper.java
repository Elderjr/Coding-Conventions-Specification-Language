package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.Modifier;

public class ModifierWrapper extends ModiscoWrapper {

	public ModifierWrapper(Modifier modifier) {
        super(modifier);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
