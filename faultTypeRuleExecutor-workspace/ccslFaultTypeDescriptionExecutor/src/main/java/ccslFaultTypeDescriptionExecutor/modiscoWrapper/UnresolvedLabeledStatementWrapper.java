package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.UnresolvedLabeledStatement;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class UnresolvedLabeledStatementWrapper extends ModiscoASTNodeWrapper {

	public UnresolvedLabeledStatementWrapper(UnresolvedLabeledStatement unresolvedLabeledStatement) {
        super(unresolvedLabeledStatement);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from UnresolvedLabeledStatement not supported");
	}
	
}
