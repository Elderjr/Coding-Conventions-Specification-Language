package faultInjectorStrategy;

import java.util.Collection;
import java.util.List;

import org.eclipse.gmt.modisco.java.ASTNode;

public interface FaultInjectorStrategy {

	public List<ASTNode> selectNodes(Collection<?> nodes);
}
