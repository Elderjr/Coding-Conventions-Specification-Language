package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.DoStatement;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class DoStatementWrapper extends ModiscoASTNodeWrapper {

	public DoStatementWrapper(DoStatement doStatement) {
        super(doStatement);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from DoStatement not supported");
	}
	
}
