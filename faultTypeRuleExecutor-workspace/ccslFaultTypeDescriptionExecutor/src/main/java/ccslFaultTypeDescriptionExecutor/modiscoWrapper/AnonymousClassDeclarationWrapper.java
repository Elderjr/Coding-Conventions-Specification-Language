package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.AnonymousClassDeclaration;

public class AnonymousClassDeclarationWrapper extends ModiscoWrapper {

	public AnonymousClassDeclarationWrapper(AnonymousClassDeclaration anonymousClassDeclaration) {
        super(anonymousClassDeclaration);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
