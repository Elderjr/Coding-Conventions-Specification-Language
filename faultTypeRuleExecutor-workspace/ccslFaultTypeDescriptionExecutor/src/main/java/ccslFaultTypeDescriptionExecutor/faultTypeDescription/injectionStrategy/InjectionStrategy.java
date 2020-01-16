package ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionStrategy;

import java.util.Collection;
import java.util.List;

import org.eclipse.gmt.modisco.java.ASTNode;

public interface InjectionStrategy {

	public List<ASTNode> selectNodes(Collection<?> nodes);
}
