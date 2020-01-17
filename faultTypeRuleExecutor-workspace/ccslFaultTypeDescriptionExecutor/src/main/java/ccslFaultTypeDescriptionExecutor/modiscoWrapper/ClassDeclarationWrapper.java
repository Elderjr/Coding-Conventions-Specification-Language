package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ClassDeclaration;

public class ClassDeclarationWrapper extends ModiscoWrapper {

	public ClassDeclarationWrapper(ClassDeclaration classDeclaration) {
        super(classDeclaration);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
