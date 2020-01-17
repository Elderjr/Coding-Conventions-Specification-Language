package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.UnresolvedTypeDeclaration;

public class UnresolvedTypeDeclarationWrapper extends ModiscoWrapper {

	public UnresolvedTypeDeclarationWrapper(UnresolvedTypeDeclaration unresolvedTypeDeclaration) {
        super(unresolvedTypeDeclaration);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
