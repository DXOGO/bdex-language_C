package Primaria;

import java.util.Stack;

public class ContextControl {
  private Stack<Context> contextStack;
  private int tempVars = 0;

  public ContextControl() {
    contextStack = new Stack<>();
    contextStack.add(new Context(ContextType.MAIN));
  }

  public Context getCurrentContext() {
    return contextStack.peek();
  }

  public boolean isInsideContext(ContextType type) {
    for (Context context : contextStack) {
      if (context.getType() == type)
        return true;
    }
    return false;
  }

  public void newContext(ContextType ctx) {
    contextStack.add(new Context(ctx));
  }

  public void exitContext() {
    contextStack.pop();
  }

  public String getNewTempVar() {
    tempVars++;
    return latestTempVar();
  }

  public void returnTempVar() {
    tempVars--;
  }

  public String latestTempVar() {
    return "temp" + tempVars;
  }

  public boolean hasTempVar() {
    return tempVars > 0;
  }

  public void addVar(String var, Types type) {
    getCurrentContext().addVar(var, type);
  }

  public String lastVar() {
    return getCurrentContext().lastVar();
  }

  public Types varType(String var) {
    for (Context context : contextStack) {
      Types type = context.varType(var);
      if (type != null)
        return type;
    }

    return null;
  }

}
