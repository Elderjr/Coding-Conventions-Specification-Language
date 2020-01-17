package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ImportDeclaration;

public class ImportDeclarationWrapper extends ModiscoWrapper {

	public ImportDeclarationWrapper(ImportDeclaration importDeclaration) {
        super(importDeclaration);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
