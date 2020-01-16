package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.MethodRef;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class MethodRefWrapper extends ModiscoASTNodeWrapper {

	public MethodRefWrapper(MethodRef methodRef) {
        super(methodRef);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from MethodRef not supported");
	}
	
}
