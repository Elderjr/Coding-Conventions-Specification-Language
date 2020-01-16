package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.NamespaceAccess;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class NamespaceAccessWrapper extends ModiscoASTNodeWrapper {

	public NamespaceAccessWrapper(NamespaceAccess namespaceAccess) {
        super(namespaceAccess);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from NamespaceAccess not supported");
	}
	
}
