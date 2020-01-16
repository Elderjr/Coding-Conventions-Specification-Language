package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.LabeledStatement;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class LabeledStatementWrapper extends ModiscoASTNodeWrapper {

	public LabeledStatementWrapper(LabeledStatement labeledStatement) {
        super(labeledStatement);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from LabeledStatement not supported");
	}
	
}
