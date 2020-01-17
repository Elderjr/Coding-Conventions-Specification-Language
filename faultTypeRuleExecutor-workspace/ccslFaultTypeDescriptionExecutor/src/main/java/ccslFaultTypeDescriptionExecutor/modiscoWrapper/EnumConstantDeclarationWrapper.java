package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.EnumConstantDeclaration;

public class EnumConstantDeclarationWrapper extends ModiscoWrapper {

	public EnumConstantDeclarationWrapper(EnumConstantDeclaration enumConstantDeclaration) {
        super(enumConstantDeclaration);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
