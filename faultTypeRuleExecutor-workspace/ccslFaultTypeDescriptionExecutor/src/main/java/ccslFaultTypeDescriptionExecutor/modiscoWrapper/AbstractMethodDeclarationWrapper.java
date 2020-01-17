package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.AbstractMethodDeclaration;

public class AbstractMethodDeclarationWrapper extends ModiscoWrapper {

	public AbstractMethodDeclarationWrapper(AbstractMethodDeclaration abstractMethodDeclaration) {
        super(abstractMethodDeclaration);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
