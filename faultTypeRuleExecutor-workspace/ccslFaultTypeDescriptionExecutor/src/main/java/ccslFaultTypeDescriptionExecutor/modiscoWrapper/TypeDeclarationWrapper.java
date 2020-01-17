package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.TypeDeclaration;

public class TypeDeclarationWrapper extends ModiscoWrapper {

	public TypeDeclarationWrapper(TypeDeclaration typeDeclaration) {
        super(typeDeclaration);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
