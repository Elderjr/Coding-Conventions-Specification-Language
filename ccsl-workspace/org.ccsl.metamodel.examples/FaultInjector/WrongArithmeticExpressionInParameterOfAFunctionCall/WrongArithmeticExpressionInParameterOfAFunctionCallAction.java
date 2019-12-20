import org.eclipse.gmt.modisco.java.*;
import faultTypeRuleExecutor.command.InjectionAction;
import faultTypeRuleExecutor.command.impl.*;

public class WrongArithmeticExpressionInParameterOfAFunctionCallAction implements InjectionAction {

  private ASTNode getTarget(ASTNode root) {
    return root;
  }

  @Override
  public void doAction(ASTNode node) {
    ASTNode target = getTarget(node);
    if(target != null) {
      java.util.Map<String, String> replacementMap = new java.util.HashMap<>();
      replacementMap.put("+","-");
      replacementMap.put("-","+");
      replacementMap.put("*","+");
      replacementMap.put("/","*");
      new InfixOperatorReplace(replacementMap).doAction(target);
    }
  }
}
