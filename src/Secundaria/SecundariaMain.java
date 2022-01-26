package Secundaria;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;

public class SecundariaMain {
   public static void main(String[] args) {
      try {
         // create a CharStream that reads from standard input:
         CharStream input = CharStreams.fromStream(System.in);
         // create a lexer that feeds off of input CharStream:
         SecundariaLexer lexer = new SecundariaLexer(input);
         // create a buffer of tokens pulled from the lexer:
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         // create a parser that feeds off the tokens buffer:
         SecundariaParser parser = new SecundariaParser(tokens);
         // replace error listener:
         // parser.removeErrorListeners(); // remove ConsoleErrorListener
         // parser.addErrorListener(new ErrorHandlingListener());
         // begin parsing at main rule:
         ParseTree tree = parser.main();
         if (parser.getNumberOfSyntaxErrors() == 0) {
            // print LISP-style tree:
            // System.out.println(tree.toStringTree(parser));
            Verify visitor0 = new Verify();
            visitor0.visit(tree);

            // Map<String,ArrayList<String>> curr = visitor0.getMap();
            // for (Map.Entry<String, ArrayList<String>> entry : curr.entrySet()) {
            // System.out.println(entry.getKey() + " " + entry.getValue());
            // }
         }
      } catch (IOException e) {
         e.printStackTrace();
         System.exit(1);
      } catch (RecognitionException e) {
         e.printStackTrace();
         System.exit(1);
      }
   }

   public Map<String, ArrayList<String>> load(String fname) {
      try {
         CharStream input = CharStreams.fromFileName(fname);
         SecundariaLexer lexer = new SecundariaLexer(input);
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         SecundariaParser parser = new SecundariaParser(tokens);
         ParseTree tree = parser.main();

         if (parser.getNumberOfSyntaxErrors() == 0) {
            Verify visitor0 = new Verify();
            visitor0.visit(tree);

            return visitor0.getMap();
         }
      } catch (IOException e) {
         return new LinkedHashMap<>();
      } catch (Exception e) {
      }

      return null;
   }
}
