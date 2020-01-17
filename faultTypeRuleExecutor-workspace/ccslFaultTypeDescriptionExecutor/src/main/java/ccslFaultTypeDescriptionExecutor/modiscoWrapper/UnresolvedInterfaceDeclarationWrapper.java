package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.UnresolvedInterfaceDeclaration;

public class UnresolvedInterfaceDeclarationWrapper extends ModiscoWrapper {

	public UnresolvedInterfaceDeclarationWrapper(UnresolvedInterfaceDeclaration unresolvedInterfaceDeclaration) {
        super(unresolvedInterfaceDeclaration);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
