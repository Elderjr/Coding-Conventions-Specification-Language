package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.PrimitiveTypeByte;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class PrimitiveTypeByteWrapper extends ModiscoASTNodeWrapper {

	public PrimitiveTypeByteWrapper(PrimitiveTypeByte primitiveTypeByte) {
        super(primitiveTypeByte);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from PrimitiveTypeByte not supported");
	}
	
}
