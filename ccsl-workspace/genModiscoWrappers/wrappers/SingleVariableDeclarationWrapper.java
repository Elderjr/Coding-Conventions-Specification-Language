package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.SingleVariableDeclaration;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class SingleVariableDeclarationWrapper extends ModiscoASTNodeWrapper {

	public SingleVariableDeclarationWrapper(SingleVariableDeclaration singleVariableDeclaration) {
        super(singleVariableDeclaration);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from SingleVariableDeclaration not supported");
	}
	
}
