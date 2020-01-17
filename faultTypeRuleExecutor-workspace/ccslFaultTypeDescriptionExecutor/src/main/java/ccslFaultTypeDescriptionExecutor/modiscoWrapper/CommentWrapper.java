package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.Comment;

public class CommentWrapper extends ModiscoWrapper {

	public CommentWrapper(Comment comment) {
        super(comment);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
