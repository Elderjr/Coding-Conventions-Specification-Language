package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.ImportDeclaration;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class ImportDeclarationWrapper extends ModiscoASTNodeWrapper {

	public ImportDeclarationWrapper(ImportDeclaration importDeclaration) {
        super(importDeclaration);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from ImportDeclaration not supported");
	}
	
}
