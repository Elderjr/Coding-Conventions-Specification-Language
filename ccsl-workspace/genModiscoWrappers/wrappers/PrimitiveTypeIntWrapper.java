package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.PrimitiveTypeInt;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class PrimitiveTypeIntWrapper extends ModiscoASTNodeWrapper {

	public PrimitiveTypeIntWrapper(PrimitiveTypeInt primitiveTypeInt) {
        super(primitiveTypeInt);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from PrimitiveTypeInt not supported");
	}
	
}
