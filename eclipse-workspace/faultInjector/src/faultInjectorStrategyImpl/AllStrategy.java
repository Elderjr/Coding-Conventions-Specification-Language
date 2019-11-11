package faultInjectorStrategyImpl;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmt.modisco.java.ASTNode;

import faultInjectorStrategy.FaultInjectorStrategy;

public class AllStrategy implements FaultInjectorStrategy {

	@Override
	public List<ASTNode> selectNodes(Collection<?> nodes) {
		List<ASTNode> nodesSelected = new LinkedList<>();
		for (Object node : nodes) {
			nodesSelected.add((ASTNode) node);
		}
		return nodesSelected;
	}

}
