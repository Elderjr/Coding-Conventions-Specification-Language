package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.UnresolvedAnnotationTypeMemberDeclaration;

public class UnresolvedAnnotationTypeMemberDeclarationWrapper extends ModiscoWrapper {

	public UnresolvedAnnotationTypeMemberDeclarationWrapper(UnresolvedAnnotationTypeMemberDeclaration unresolvedAnnotationTypeMemberDeclaration) {
        super(unresolvedAnnotationTypeMemberDeclaration);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
