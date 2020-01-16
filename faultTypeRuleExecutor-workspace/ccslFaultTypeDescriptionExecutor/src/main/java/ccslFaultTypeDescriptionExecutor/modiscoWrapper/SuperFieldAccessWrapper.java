package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.SuperFieldAccess;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class SuperFieldAccessWrapper extends ModiscoASTNodeWrapper {

	public SuperFieldAccessWrapper(SuperFieldAccess superFieldAccess) {
        super(superFieldAccess);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from SuperFieldAccess not supported");
	}
	
}
