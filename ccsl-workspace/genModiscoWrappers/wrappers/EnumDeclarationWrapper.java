package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.EnumDeclaration;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class EnumDeclarationWrapper extends ModiscoASTNodeWrapper {

	public EnumDeclarationWrapper(EnumDeclaration enumDeclaration) {
        super(enumDeclaration);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from EnumDeclaration not supported");
	}
	
}
