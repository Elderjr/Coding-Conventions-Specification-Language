import org.eclipse.gmt.modisco.java.*;
import ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionAction.*;

public class MissingVariableAssignmentUsingAnExpressionStep1 implements InjectionAction {

  private ASTNode getTarget(ASTNode root) {
    if (root instanceof Assignment) {
      Assignment assignment = (Assignment) root;
      return assignment.getRightHandSide();
    }
    return null;
  }

  @Override
  public boolean doAction(ASTNode node) {
    ASTNode target = getTarget(node);
    if(target != null) {
      return new DeleteNodeCommand().doAction(target);
    }
    return false;
  }
}
