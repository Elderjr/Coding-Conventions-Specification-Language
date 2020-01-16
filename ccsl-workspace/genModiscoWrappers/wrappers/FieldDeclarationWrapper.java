package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.FieldDeclaration;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class FieldDeclarationWrapper extends ModiscoASTNodeWrapper {

	public FieldDeclarationWrapper(FieldDeclaration fieldDeclaration) {
        super(fieldDeclaration);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from FieldDeclaration not supported");
	}
	
}
