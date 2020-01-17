package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.VariableDeclarationFragment;

public class VariableDeclarationFragmentWrapper extends ModiscoWrapper {

	public VariableDeclarationFragmentWrapper(VariableDeclarationFragment variableDeclarationFragment) {
        super(variableDeclarationFragment);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
