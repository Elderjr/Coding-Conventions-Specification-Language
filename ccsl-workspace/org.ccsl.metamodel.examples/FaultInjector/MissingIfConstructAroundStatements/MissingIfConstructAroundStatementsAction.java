import org.eclipse.gmt.modisco.java.*;
import command.InjectionAction;
import command.impl.*;

public class MissingIfConstructAroundStatementsAction implements InjectionAction {

  @Override
  public void doCommand(ASTNode node) {
    if (node instanceof IfStatement) {
      IfStatement ifStmt = (IfStatement) node;
      new MoveScopeUp().doCommand(ifStmt.getThenStatement());
    }
  }
}
