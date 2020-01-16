package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.SwitchCase;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class SwitchCaseWrapper extends ModiscoASTNodeWrapper {

	public SwitchCaseWrapper(SwitchCase switchCase) {
        super(switchCase);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from SwitchCase not supported");
	}
	
}
