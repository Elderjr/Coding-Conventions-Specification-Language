import org.eclipse.gmt.modisco.java.*;
import command.InjectionAction;
import command.impl.*;

public class MissingVariableAssignmentUsingAnExpressionAction implements InjectionAction {

  @Override
  public void doCommand(ASTNode node) {
    if (node instanceof Assignment) {
      Assignment assignment = (Assignment) node;
      new DeleteNodeCommand().doCommand(assignment);
    }
  }
}
