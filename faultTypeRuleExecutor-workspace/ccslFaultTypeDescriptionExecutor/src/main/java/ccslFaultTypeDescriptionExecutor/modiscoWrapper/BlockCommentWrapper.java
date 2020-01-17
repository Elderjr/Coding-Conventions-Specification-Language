package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.BlockComment;

public class BlockCommentWrapper extends ModiscoWrapper {

	public BlockCommentWrapper(BlockComment blockComment) {
        super(blockComment);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
