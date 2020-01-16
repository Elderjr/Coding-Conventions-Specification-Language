package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.SynchronizedStatement;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class SynchronizedStatementWrapper extends ModiscoASTNodeWrapper {

	public SynchronizedStatementWrapper(SynchronizedStatement synchronizedStatement) {
        super(synchronizedStatement);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from SynchronizedStatement not supported");
	}
	
}
