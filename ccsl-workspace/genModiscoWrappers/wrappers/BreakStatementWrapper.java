package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.BreakStatement;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class BreakStatementWrapper extends ModiscoASTNodeWrapper {

	public BreakStatementWrapper(BreakStatement breakStatement) {
        super(breakStatement);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from BreakStatement not supported");
	}
	
}
