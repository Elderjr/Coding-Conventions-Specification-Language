package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.BodyDeclaration;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class BodyDeclarationWrapper extends ModiscoASTNodeWrapper {

	public BodyDeclarationWrapper(BodyDeclaration bodyDeclaration) {
        super(bodyDeclaration);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from BodyDeclaration not supported");
	}
	
}
