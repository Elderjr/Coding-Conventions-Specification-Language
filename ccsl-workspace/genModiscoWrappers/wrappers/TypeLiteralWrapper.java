package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.TypeLiteral;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class TypeLiteralWrapper extends ModiscoASTNodeWrapper {

	public TypeLiteralWrapper(TypeLiteral typeLiteral) {
        super(typeLiteral);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from TypeLiteral not supported");
	}
	
}
