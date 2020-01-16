package ccslFaultTypeDescriptionExecutor.modiscoWrapper;
import org.eclipse.gmt.modisco.java.ASTNode;
import org.eclipse.gmt.modisco.java.ClassFile;
import ccslFaultTypeDescriptionExecutor.modiscoWrapper.ModiscoASTNodeWrapper;

public class ClassFileWrapper extends ModiscoASTNodeWrapper {

	public ClassFileWrapper(ClassFile classFile) {
        super(classFile);
	}

	@Override
	public boolean deleteField(ASTNode field, ASTNode originalFieldNode) {
      throw new UnsupportedOperationException("deleteField from ClassFile not supported");
	}
	
}
