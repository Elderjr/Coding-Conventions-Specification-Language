package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.ArrayCreation;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class ArrayCreationWrapper extends ModiscoASTNodeWrapper {

	public ArrayCreationWrapper(ArrayCreation arrayCreation) {
        super(arrayCreation);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from ArrayCreation not supported");
	}
	
}
