package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.EnumDeclaration;

public class EnumDeclarationWrapper extends ModiscoWrapper {

	public EnumDeclarationWrapper(EnumDeclaration enumDeclaration) {
        super(enumDeclaration);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
