package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.TypeDeclarationStatement;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class TypeDeclarationStatementWrapper extends ModiscoASTNodeWrapper {

	public TypeDeclarationStatementWrapper(TypeDeclarationStatement typeDeclarationStatement) {
        super(typeDeclarationStatement);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from TypeDeclarationStatement not supported");
	}
	
}
