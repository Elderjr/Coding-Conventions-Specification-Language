package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.UnresolvedAnnotationDeclaration;

public class UnresolvedAnnotationDeclarationWrapper extends ModiscoWrapper {

	public UnresolvedAnnotationDeclarationWrapper(UnresolvedAnnotationDeclaration unresolvedAnnotationDeclaration) {
        super(unresolvedAnnotationDeclaration);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
