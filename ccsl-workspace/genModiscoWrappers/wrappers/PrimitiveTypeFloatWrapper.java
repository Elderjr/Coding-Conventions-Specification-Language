package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.PrimitiveTypeFloat;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class PrimitiveTypeFloatWrapper extends ModiscoASTNodeWrapper {

	public PrimitiveTypeFloatWrapper(PrimitiveTypeFloat primitiveTypeFloat) {
        super(primitiveTypeFloat);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from PrimitiveTypeFloat not supported");
	}
	
}
