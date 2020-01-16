package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.VariableDeclarationExpression;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class VariableDeclarationExpressionWrapper extends ModiscoASTNodeWrapper {

	public VariableDeclarationExpressionWrapper(VariableDeclarationExpression variableDeclarationExpression) {
        super(variableDeclarationExpression);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from VariableDeclarationExpression not supported");
	}
	
}
