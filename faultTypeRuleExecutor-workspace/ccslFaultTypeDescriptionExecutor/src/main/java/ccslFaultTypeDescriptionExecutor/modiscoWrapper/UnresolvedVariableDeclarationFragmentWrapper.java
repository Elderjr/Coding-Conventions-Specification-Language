package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.UnresolvedVariableDeclarationFragment;

public class UnresolvedVariableDeclarationFragmentWrapper extends ModiscoWrapper {

	public UnresolvedVariableDeclarationFragmentWrapper(UnresolvedVariableDeclarationFragment unresolvedVariableDeclarationFragment) {
        super(unresolvedVariableDeclarationFragment);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
