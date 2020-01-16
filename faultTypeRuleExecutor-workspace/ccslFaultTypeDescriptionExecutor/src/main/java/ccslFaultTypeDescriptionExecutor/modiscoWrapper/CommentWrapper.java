package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.Comment;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class CommentWrapper extends ModiscoASTNodeWrapper {

	public CommentWrapper(Comment comment) {
        super(comment);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from Comment not supported");
	}
	
}
