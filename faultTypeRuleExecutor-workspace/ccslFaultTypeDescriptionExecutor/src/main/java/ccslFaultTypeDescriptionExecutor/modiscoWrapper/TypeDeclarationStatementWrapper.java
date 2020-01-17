package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.TypeDeclarationStatement;

public class TypeDeclarationStatementWrapper extends ModiscoWrapper {

	public TypeDeclarationStatementWrapper(TypeDeclarationStatement typeDeclarationStatement) {
        super(typeDeclarationStatement);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
