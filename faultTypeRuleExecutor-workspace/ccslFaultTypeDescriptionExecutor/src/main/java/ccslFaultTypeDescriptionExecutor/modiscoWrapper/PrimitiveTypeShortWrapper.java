package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.PrimitiveTypeShort;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class PrimitiveTypeShortWrapper extends ModiscoASTNodeWrapper {

	public PrimitiveTypeShortWrapper(PrimitiveTypeShort primitiveTypeShort) {
        super(primitiveTypeShort);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from PrimitiveTypeShort not supported");
	}
	
}
