package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.InheritanceKind;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class InheritanceKindWrapper extends ModiscoASTNodeWrapper {

	public InheritanceKindWrapper(InheritanceKind inheritanceKind) {
        super(inheritanceKind);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from InheritanceKind not supported");
	}
	
}
