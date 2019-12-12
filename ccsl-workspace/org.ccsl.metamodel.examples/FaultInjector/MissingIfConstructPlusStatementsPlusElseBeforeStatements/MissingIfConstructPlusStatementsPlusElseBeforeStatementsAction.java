import org.eclipse.gmt.modisco.java.*;
import command.InjectionAction;
import command.impl.*;

public class MissingIfConstructPlusStatementsPlusElseBeforeStatementsAction implements InjectionAction {

  @Override
  public void doAction(ASTNode node) {
    if (!(node instanceof IfStatement))
      return;
    IfStatement ifStmt = (IfStatement) node;
    if (ifStmt.getElseStatement() == null)
      return;
    new MoveScopeUp().doAction(ifStmt.getElseStatement());
  }
}
