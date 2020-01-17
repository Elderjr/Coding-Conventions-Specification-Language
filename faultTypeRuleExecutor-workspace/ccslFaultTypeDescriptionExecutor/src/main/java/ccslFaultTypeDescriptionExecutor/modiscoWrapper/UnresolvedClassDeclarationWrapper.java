package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.UnresolvedClassDeclaration;

public class UnresolvedClassDeclarationWrapper extends ModiscoWrapper {

	public UnresolvedClassDeclarationWrapper(UnresolvedClassDeclaration unresolvedClassDeclaration) {
        super(unresolvedClassDeclaration);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
