package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.FieldAccess;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class FieldAccessWrapper extends ModiscoASTNodeWrapper {

	public FieldAccessWrapper(FieldAccess fieldAccess) {
        super(fieldAccess);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from FieldAccess not supported");
	}
	
}
