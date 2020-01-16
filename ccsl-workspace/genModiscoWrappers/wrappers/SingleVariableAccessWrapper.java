package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.SingleVariableAccess;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class SingleVariableAccessWrapper extends ModiscoASTNodeWrapper {

	public SingleVariableAccessWrapper(SingleVariableAccess singleVariableAccess) {
        super(singleVariableAccess);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from SingleVariableAccess not supported");
	}
	
}
