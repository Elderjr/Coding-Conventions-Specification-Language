package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.UnresolvedSingleVariableDeclaration;

public class UnresolvedSingleVariableDeclarationWrapper extends ModiscoWrapper {

	public UnresolvedSingleVariableDeclarationWrapper(UnresolvedSingleVariableDeclaration unresolvedSingleVariableDeclaration) {
        super(unresolvedSingleVariableDeclaration);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
