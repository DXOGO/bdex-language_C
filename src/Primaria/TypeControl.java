package Primaria;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.misc.Aggregate;

public class TypeControl {
  public static void setType(ST string, Types type) {
    string.addAggr("stat.{type}", type);
  }

  public static Types getType(ST string) {
    return (Types) ((Aggregate) string.getAttribute("stat")).get("type");
  }

  public static Types operationType(ST expr1, String op, ST expr2) {
    Types type1 = getType(expr1);
    Types type2 = getType(expr2);

    if (type1 == Types.COLF || type2 == Types.COLF)
      return Types.COLF;

    if (type1 == Types.ANY || type2 == Types.ANY) // nas comparações não dá bool em vez de any?
      return Types.ANY;

    switch (op) {
      case "+":
        if (type1 == Types.INT && type2 == Types.INT) {
          return Types.INT;
        } else if (type1 == Types.REAL && type2 == Types.REAL) {
          return Types.REAL;
        } else if ((type1 == Types.REAL && type2 == Types.INT) || (type1 == Types.INT && type2 == Types.REAL)) {
          return Types.REAL;
        } else if (type1 == Types.STRING && type2 == Types.STRING) {
          return Types.STRING;
        } else if (type1 == Types.TUPLE && type2 == Types.TUPLE) {
          return Types.TUPLE;
        } else if (type1 == Types.BOOL && type2 == Types.BOOL) {
          return Types.INT;
        } else if ((type1 == Types.BOOL && type2 == Types.INT) || (type1 == Types.INT && type2 == Types.BOOL)) {
          return Types.INT;
        } else if ((type1 == Types.BOOL && type2 == Types.REAL) || (type1 == Types.REAL && type2 == Types.BOOL)) {
          return Types.REAL;
        } else if (type1 == Types.TABLE && type2 == Types.TABLEDEF) {
          return Types.TABLE;
        } else if (type1 == Types.TABLE && type2 == Types.TABLE) {
          return Types.TABLE;
        }
        break;
      case "-":
        if (type1 == Types.INT && type2 == Types.INT) {
          return Types.INT;
        } else if (type1 == Types.REAL && type2 == Types.REAL) {
          return Types.REAL;
        } else if ((type1 == Types.REAL && type2 == Types.INT) || (type1 == Types.INT && type2 == Types.REAL)) {
          return Types.REAL;
        } else if (type1 == Types.BOOL && type2 == Types.BOOL) {
          return Types.INT;
        } else if ((type1 == Types.BOOL && type2 == Types.INT) || (type1 == Types.INT && type2 == Types.BOOL)) {
          return Types.INT;
        } else if ((type1 == Types.BOOL && type2 == Types.REAL) || (type1 == Types.REAL && type2 == Types.BOOL)) {
          return Types.REAL;
        }
        break;
      case "==":
        return Types.BOOL;
      case "!=":
        return Types.BOOL;
      case ">":
        if (type1 == Types.INT && type2 == Types.INT) {
          return Types.BOOL;
        } else if (type1 == Types.REAL && type2 == Types.REAL) {
          return Types.BOOL;
        } else if ((type1 == Types.REAL && type2 == Types.INT) || (type1 == Types.INT && type2 == Types.REAL)) {
          return Types.BOOL;
        } else if (type1 == Types.STRING && type2 == Types.STRING) {
          return Types.BOOL;
        } else if (type1 == Types.TUPLE && type2 == Types.TUPLE) {
          return Types.BOOL;
        } else if (type1 == Types.BOOL && type2 == Types.BOOL) {
          return Types.BOOL;
        } else if ((type1 == Types.BOOL && type2 == Types.INT) || (type1 == Types.INT && type2 == Types.BOOL)) {
          return Types.BOOL;
        } else if ((type1 == Types.BOOL && type2 == Types.REAL) || (type1 == Types.REAL && type2 == Types.BOOL)) {
          return Types.BOOL;
        }
        break;
      case ">=":
        if (type1 == Types.INT && type2 == Types.INT) {
          return Types.BOOL;
        } else if (type1 == Types.REAL && type2 == Types.REAL) {
          return Types.BOOL;
        } else if ((type1 == Types.REAL && type2 == Types.INT) || (type1 == Types.INT && type2 == Types.REAL)) {
          return Types.BOOL;
        } else if (type1 == Types.STRING && type2 == Types.STRING) {
          return Types.BOOL;
        } else if (type1 == Types.TUPLE && type2 == Types.TUPLE) {
          return Types.BOOL;
        } else if (type1 == Types.BOOL && type2 == Types.BOOL) {
          return Types.BOOL;
        } else if ((type1 == Types.BOOL && type2 == Types.INT) || (type1 == Types.INT && type2 == Types.BOOL)) {
          return Types.BOOL;
        } else if ((type1 == Types.BOOL && type2 == Types.REAL) || (type1 == Types.REAL && type2 == Types.BOOL)) {
          return Types.BOOL;
        }
        break;
      case "<":
        if (type1 == Types.INT && type2 == Types.INT) {
          return Types.BOOL;
        } else if (type1 == Types.REAL && type2 == Types.REAL) {
          return Types.BOOL;
        } else if ((type1 == Types.REAL && type2 == Types.INT) || (type1 == Types.INT && type2 == Types.REAL)) {
          return Types.BOOL;
        } else if (type1 == Types.STRING && type2 == Types.STRING) {
          return Types.BOOL;
        } else if (type1 == Types.TUPLE && type2 == Types.TUPLE) {
          return Types.BOOL;
        } else if (type1 == Types.BOOL && type2 == Types.BOOL) {
          return Types.BOOL;
        } else if ((type1 == Types.BOOL && type2 == Types.INT) || (type1 == Types.INT && type2 == Types.BOOL)) {
          return Types.BOOL;
        } else if ((type1 == Types.BOOL && type2 == Types.REAL) || (type1 == Types.REAL && type2 == Types.BOOL)) {
          return Types.BOOL;
        }
        break;
      case "<=":
        if (type1 == Types.INT && type2 == Types.INT) {
          return Types.BOOL;
        } else if (type1 == Types.REAL && type2 == Types.REAL) {
          return Types.BOOL;
        } else if ((type1 == Types.REAL && type2 == Types.INT) || (type1 == Types.INT && type2 == Types.REAL)) {
          return Types.BOOL;
        } else if (type1 == Types.STRING && type2 == Types.STRING) {
          return Types.BOOL;
        } else if (type1 == Types.TUPLE && type2 == Types.TUPLE) {
          return Types.BOOL;
        } else if (type1 == Types.BOOL && type2 == Types.BOOL) {
          return Types.BOOL;
        } else if ((type1 == Types.BOOL && type2 == Types.INT) || (type1 == Types.INT && type2 == Types.BOOL)) {
          return Types.BOOL;
        } else if ((type1 == Types.BOOL && type2 == Types.REAL) || (type1 == Types.REAL && type2 == Types.BOOL)) {
          return Types.BOOL;
        }
        break;
      case "*":
        if (type1 == Types.INT && type2 == Types.INT) {
          return Types.INT;
        } else if (type1 == Types.REAL && type2 == Types.REAL) {
          return Types.REAL;
        } else if ((type1 == Types.REAL && type2 == Types.INT) || (type1 == Types.INT && type2 == Types.REAL)) {
          return Types.REAL;
        } else if ((type1 == Types.TUPLE && type2 == Types.INT) || (type1 == Types.INT && type2 == Types.TUPLE)) {
          return Types.TUPLE;
        } else if ((type1 == Types.TUPLE && type2 == Types.BOOL) || (type1 == Types.BOOL && type2 == Types.TUPLE)) {
          return Types.TUPLE;
        } else if (type1 == Types.BOOL && type2 == Types.BOOL) {
          return Types.INT;
        } else if ((type1 == Types.BOOL && type2 == Types.INT) || (type1 == Types.INT && type2 == Types.BOOL)) {
          return Types.INT;
        } else if ((type1 == Types.BOOL && type2 == Types.REAL) || (type1 == Types.REAL && type2 == Types.BOOL)) {
          return Types.REAL;
        } else if (type1 == Types.TABLE && type2 == Types.TABLE) {
          return Types.TABLE;
        }
        break;
      case "/":
        if (type1 == Types.INT && type2 == Types.INT) {
          return Types.REAL;
        } else if (type1 == Types.REAL && type2 == Types.REAL) {
          return Types.REAL;
        } else if ((type1 == Types.REAL && type2 == Types.INT) || (type1 == Types.INT && type2 == Types.REAL)) {
          return Types.REAL;
        } else if (type1 == Types.BOOL && type2 == Types.BOOL) { // can't divide by zero
          return Types.REAL;
        } else if ((type1 == Types.BOOL && type2 == Types.INT) || (type1 == Types.INT && type2 == Types.BOOL)) {
          return Types.INT;
        } else if ((type1 == Types.BOOL && type2 == Types.REAL) || (type1 == Types.REAL && type2 == Types.BOOL)) {
          return Types.REAL;
        }
        break;
      case "^":
        if (type1 == Types.TABLE && type2 == Types.TABLE) {
          return Types.TABLE;
        }
        break;
      case "%":
        if (type1 == Types.INT && type2 == Types.INT) {
          return Types.INT;
        } else if (type1 == Types.REAL && type2 == Types.REAL) {
          return Types.REAL;
        } else if ((type1 == Types.REAL && type2 == Types.INT) || (type1 == Types.INT && type2 == Types.REAL)) {
          return Types.REAL;
        } else if (type1 == Types.BOOL && type2 == Types.BOOL) {
          return Types.INT;
        } else if ((type1 == Types.BOOL && type2 == Types.INT) || (type1 == Types.INT && type2 == Types.BOOL)) {
          return Types.INT;
        } else if ((type1 == Types.BOOL && type2 == Types.REAL) || (type1 == Types.REAL && type2 == Types.BOOL)) {
          return Types.REAL;
        }
        break;
    }

    return null;
  }
}
