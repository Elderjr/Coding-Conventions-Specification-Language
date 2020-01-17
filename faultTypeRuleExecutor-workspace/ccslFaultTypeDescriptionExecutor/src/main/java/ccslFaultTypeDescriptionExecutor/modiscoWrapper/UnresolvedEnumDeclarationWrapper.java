package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.UnresolvedEnumDeclaration;

public class UnresolvedEnumDeclarationWrapper extends ModiscoWrapper {

	public UnresolvedEnumDeclarationWrapper(UnresolvedEnumDeclaration unresolvedEnumDeclaration) {
        super(unresolvedEnumDeclaration);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
