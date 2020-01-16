package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.PrimitiveTypeVoid;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class PrimitiveTypeVoidWrapper extends ModiscoASTNodeWrapper {

	public PrimitiveTypeVoidWrapper(PrimitiveTypeVoid primitiveTypeVoid) {
        super(primitiveTypeVoid);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from PrimitiveTypeVoid not supported");
	}
	
}
