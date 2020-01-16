package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.BooleanLiteral;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class BooleanLiteralWrapper extends ModiscoASTNodeWrapper {

	public BooleanLiteralWrapper(BooleanLiteral booleanLiteral) {
        super(booleanLiteral);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from BooleanLiteral not supported");
	}
	
}
