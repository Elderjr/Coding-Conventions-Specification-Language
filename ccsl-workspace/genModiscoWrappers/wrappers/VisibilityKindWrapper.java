package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.VisibilityKind;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class VisibilityKindWrapper extends ModiscoASTNodeWrapper {

	public VisibilityKindWrapper(VisibilityKind visibilityKind) {
        super(visibilityKind);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from VisibilityKind not supported");
	}
	
}
