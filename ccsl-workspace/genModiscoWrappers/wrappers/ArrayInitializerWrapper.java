package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.ArrayInitializer;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class ArrayInitializerWrapper extends ModiscoASTNodeWrapper {

	public ArrayInitializerWrapper(ArrayInitializer arrayInitializer) {
        super(arrayInitializer);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from ArrayInitializer not supported");
	}
	
}
