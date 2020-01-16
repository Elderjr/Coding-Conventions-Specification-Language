package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.PrimitiveTypeChar;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class PrimitiveTypeCharWrapper extends ModiscoASTNodeWrapper {

	public PrimitiveTypeCharWrapper(PrimitiveTypeChar primitiveTypeChar) {
        super(primitiveTypeChar);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from PrimitiveTypeChar not supported");
	}
	
}
