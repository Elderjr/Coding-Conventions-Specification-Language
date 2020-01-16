package ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionStrategy;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmt.modisco.java.ASTNode;

public class AllStrategy implements InjectionStrategy {

	@Override
	public List<ASTNode> selectNodes(Collection<?> nodes) {
		List<ASTNode> nodesSelected = new LinkedList<>();
		for (Object node : nodes) {
			nodesSelected.add((ASTNode) node);
		}
		return nodesSelected;
	}

}
