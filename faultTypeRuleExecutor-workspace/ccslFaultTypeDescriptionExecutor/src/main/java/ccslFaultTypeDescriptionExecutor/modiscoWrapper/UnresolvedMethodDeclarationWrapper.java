package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.UnresolvedMethodDeclaration;

public class UnresolvedMethodDeclarationWrapper extends ModiscoWrapper {

	public UnresolvedMethodDeclarationWrapper(UnresolvedMethodDeclaration unresolvedMethodDeclaration) {
        super(unresolvedMethodDeclaration);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
