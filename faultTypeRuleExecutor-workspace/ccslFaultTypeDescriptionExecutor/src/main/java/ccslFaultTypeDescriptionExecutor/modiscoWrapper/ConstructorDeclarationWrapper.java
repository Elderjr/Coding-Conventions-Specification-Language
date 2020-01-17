package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ConstructorDeclaration;

public class ConstructorDeclarationWrapper extends ModiscoWrapper {

	public ConstructorDeclarationWrapper(ConstructorDeclaration constructorDeclaration) {
        super(constructorDeclaration);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
