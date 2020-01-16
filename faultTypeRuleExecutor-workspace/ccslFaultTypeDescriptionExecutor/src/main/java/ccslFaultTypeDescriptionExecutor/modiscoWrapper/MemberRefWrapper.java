package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.MemberRef;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class MemberRefWrapper extends ModiscoASTNodeWrapper {

	public MemberRefWrapper(MemberRef memberRef) {
        super(memberRef);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from MemberRef not supported");
	}
	
}
