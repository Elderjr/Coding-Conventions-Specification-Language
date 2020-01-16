package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.ArrayType;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class ArrayTypeWrapper extends ModiscoASTNodeWrapper {

	public ArrayTypeWrapper(ArrayType arrayType) {
        super(arrayType);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from ArrayType not supported");
	}
	
}
