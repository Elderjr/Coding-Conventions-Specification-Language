package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.NullLiteral;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class NullLiteralWrapper extends ModiscoASTNodeWrapper {

	public NullLiteralWrapper(NullLiteral nullLiteral) {
        super(nullLiteral);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from NullLiteral not supported");
	}
	
}
