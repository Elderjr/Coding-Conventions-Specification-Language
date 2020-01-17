package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.Block;

public class BlockWrapper extends ModiscoWrapper {

	public BlockWrapper(Block block) {
        super(block);
	}

	@Override
	public void accept(ModiscoWrapperVisitor visitor) {
      visitor.visit(this);
	}
	
}
