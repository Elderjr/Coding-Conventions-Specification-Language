package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.EnumConstantDeclaration;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class EnumConstantDeclarationWrapper extends ModiscoASTNodeWrapper {

	public EnumConstantDeclarationWrapper(EnumConstantDeclaration enumConstantDeclaration) {
        super(enumConstantDeclaration);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from EnumConstantDeclaration not supported");
	}
	
}
