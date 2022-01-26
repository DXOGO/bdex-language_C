package Primaria;

import java.util.HashMap;
import java.util.Map;

public class Context {
  private ContextType ctxType;
  private Map<String, Types> vars;

  public Context(ContextType ctxType) {
    this.ctxType = ctxType;
    vars = new HashMap<>();
  }

  public void addVar(String var, Types type) {
    vars.put(var, type);
  }

  public ContextType getType() {
    return ctxType;
  }

  public boolean hasVar(String var) {
    return vars.containsKey(var);
  }

  public String lastVar() {
    return vars.keySet().toArray(new String[0])[0];
  }

  public Types varType(String var) {
    if (vars.containsKey(var))
      return vars.get(var);
    return null;
  }

  public Map<String, Types> getVars() {
    return vars;
  }

  public void loadVars(Map<String, Types> vars) {
    for (String key : vars.keySet())
      this.vars.put(key, vars.get(key));
  }
}
