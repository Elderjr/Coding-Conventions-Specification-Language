package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.InterfaceDeclaration;

public class InterfaceDeclarationWrapper extends ModiscoWrapper {

	public InterfaceDeclarationWrapper(InterfaceDeclaration interfaceDeclaration) {
        super(interfaceDeclaration);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
