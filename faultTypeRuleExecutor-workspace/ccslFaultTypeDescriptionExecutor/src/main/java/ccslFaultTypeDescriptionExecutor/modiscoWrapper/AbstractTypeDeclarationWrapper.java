package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.AbstractTypeDeclaration;

public class AbstractTypeDeclarationWrapper extends ModiscoWrapper {

	public AbstractTypeDeclarationWrapper(AbstractTypeDeclaration abstractTypeDeclaration) {
        super(abstractTypeDeclaration);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
