package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.CatchClause;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class CatchClauseWrapper extends ModiscoASTNodeWrapper {

	public CatchClauseWrapper(CatchClause catchClause) {
        super(catchClause);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from CatchClause not supported");
	}
	
}
