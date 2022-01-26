package Primaria;

import org.stringtemplate.v4.ST;

public class STTyped extends ST {
  private Types type;

  public STTyped(String template, Types type) {
    super(template);
    this.type = type;
  }

  public Types getType() {
    return type;
  }
}
