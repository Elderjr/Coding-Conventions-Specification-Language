package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.ClassInstanceCreation;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class ClassInstanceCreationWrapper extends ModiscoASTNodeWrapper {

	public ClassInstanceCreationWrapper(ClassInstanceCreation classInstanceCreation) {
        super(classInstanceCreation);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from ClassInstanceCreation not supported");
	}
	
}
