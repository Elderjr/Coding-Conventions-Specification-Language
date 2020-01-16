package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.AssignmentKind;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class AssignmentKindWrapper extends ModiscoASTNodeWrapper {

	public AssignmentKindWrapper(AssignmentKind assignmentKind) {
        super(assignmentKind);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from AssignmentKind not supported");
	}
	
}
