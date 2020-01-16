package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.TypeAccess;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class TypeAccessWrapper extends ModiscoASTNodeWrapper {

	public TypeAccessWrapper(TypeAccess typeAccess) {
        super(typeAccess);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from TypeAccess not supported");
	}
	
}
