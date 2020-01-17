import org.eclipse.gmt.modisco.java.*;
import ccslFaultTypeDescriptionExecutor.faultTypeDescription.injectionAction.*;

public class WrongArithmeticExpressionInParameterOfAFunctionCallStep1 implements InjectionAction {

  private ASTNode getTarget(ASTNode root) {
    return root;
  }

  @Override
  public boolean doAction(ASTNode node) {
    ASTNode target = getTarget(node);
    if(target != null) {
      java.util.Map<String, String> replacementMap = new java.util.HashMap<>();
      replacementMap.put("-","+");
      replacementMap.put("+","-");
      replacementMap.put("*","+");
      replacementMap.put("/","*");
      replacementMap.put("%","*");
      return new InfixOperatorReplaceAction(replacementMap).doAction(target);
    }
    return false;
  }
}
