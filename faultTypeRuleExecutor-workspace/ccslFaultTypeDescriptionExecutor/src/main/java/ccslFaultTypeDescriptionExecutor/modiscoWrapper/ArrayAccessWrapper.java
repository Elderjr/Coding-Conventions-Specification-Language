package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.ArrayAccess;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class ArrayAccessWrapper extends ModiscoASTNodeWrapper {

	public ArrayAccessWrapper(ArrayAccess arrayAccess) {
        super(arrayAccess);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from ArrayAccess not supported");
	}
	
}
