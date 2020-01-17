package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.AnnotationTypeDeclaration;

public class AnnotationTypeDeclarationWrapper extends ModiscoWrapper {

	public AnnotationTypeDeclarationWrapper(AnnotationTypeDeclaration annotationTypeDeclaration) {
        super(annotationTypeDeclaration);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
