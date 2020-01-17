package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.AnnotationTypeMemberDeclaration;

public class AnnotationTypeMemberDeclarationWrapper extends ModiscoWrapper {

	public AnnotationTypeMemberDeclarationWrapper(AnnotationTypeMemberDeclaration annotationTypeMemberDeclaration) {
        super(annotationTypeMemberDeclaration);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
