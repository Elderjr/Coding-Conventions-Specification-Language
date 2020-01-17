package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.BodyDeclaration;

public class BodyDeclarationWrapper extends ModiscoWrapper {

	public BodyDeclarationWrapper(BodyDeclaration bodyDeclaration) {
        super(bodyDeclaration);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
