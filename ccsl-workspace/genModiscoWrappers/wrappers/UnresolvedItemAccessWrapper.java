package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.UnresolvedItemAccess;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class UnresolvedItemAccessWrapper extends ModiscoASTNodeWrapper {

	public UnresolvedItemAccessWrapper(UnresolvedItemAccess unresolvedItemAccess) {
        super(unresolvedItemAccess);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from UnresolvedItemAccess not supported");
	}
	
}
