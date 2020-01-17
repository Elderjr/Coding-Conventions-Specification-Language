package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.FieldDeclaration;

public class FieldDeclarationWrapper extends ModiscoWrapper {

	public FieldDeclarationWrapper(FieldDeclaration fieldDeclaration) {
        super(fieldDeclaration);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
