package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.ArrayLengthAccess;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class ArrayLengthAccessWrapper extends ModiscoASTNodeWrapper {

	public ArrayLengthAccessWrapper(ArrayLengthAccess arrayLengthAccess) {
        super(arrayLengthAccess);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from ArrayLengthAccess not supported");
	}
	
}
