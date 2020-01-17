package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.LineComment;

public class LineCommentWrapper extends ModiscoWrapper {

	public LineCommentWrapper(LineComment lineComment) {
        super(lineComment);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
