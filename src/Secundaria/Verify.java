package Secundaria;

import java.util.*;

public class Verify extends SecundariaBaseVisitor<String> {
   Map<String, String> header = new LinkedHashMap<>();
   Map<String, ArrayList<String>> tbl = new LinkedHashMap<>();
   Map<String, ArrayList<String>> new_tbl = null;
   boolean isvalid = true;
   List<String> info = new ArrayList<>();
   List<String> types = new ArrayList<>();
   String[] xgorda;
   String[] tuple;
   String line;
   String curr_type;
   int i = 0;
   int ii;

   @Override
   public String visitMain(SecundariaParser.MainContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public String visitHeader(SecundariaParser.HeaderContext ctx) {

      i++;
      String[] dados = ctx.getText().split("\t");
      for (String clmn : dados) {
         xgorda = clmn.split(":");
         header.put(xgorda[0], xgorda[1].strip());
         tbl.put(xgorda[0], new ArrayList<String>());
         types.add(xgorda[1]);
      }

      return visitChildren(ctx);
   }

   @Override
   public String visitLinha(SecundariaParser.LinhaContext ctx) {

      // analisa a linha/tuplo atual, verifica se o tamanho dela corresponde ao
      // tamanho do header
      line = ctx.getText(); // linha
      info.add(line.strip()); // array list com as linhas todas
      tuple = line.split("\t"); // array list com os valores da linha atual

      if (header.size() != tuple.length) {
         System.err.println("[ERROR] Inconsistent data!");
         isvalid = false;
      }

      // verifica se os dados sao do tipo que devem
      if (isvalid) {
         for (int p = 0; p < tuple.length; p++) {
            curr_type = types.get(p);
            try {
               switch (curr_type.strip()) {
                  case "INT":
                     Integer.parseInt(tuple[p].strip());
                     break;
                  case "FLOAT":
                     Float.parseFloat(tuple[p].strip());
                     break;
                  case "STRING":
                     break;
                  default:
                     System.err.println("[ERROR] Default case reached, unknown variable type: " + curr_type);
                     isvalid = false;
               }
            } catch (NumberFormatException nfe) {
               System.err.println("[ERROR] Unable to parse data: " + tuple[p].strip());
               isvalid = false;
            }

         }

         // popula mapa representante da tabela
         ii = 0;
         for (String atribute : header.keySet()) {
            tbl.get(atribute).add(tuple[ii++].strip());
         }
      }

      // mostra a belhice
      return visitChildren(ctx);
   }

   public Map<String, ArrayList<String>> getMap() {
      if (isvalid) {
         new_tbl = new LinkedHashMap<>();
         // popula map com os dados da tabela
         for (Map.Entry<String, ArrayList<String>> entry : tbl.entrySet()) {
            new_tbl.put(entry.getKey() + ":" + header.get(entry.getKey()), entry.getValue());
         }
      }
      return new_tbl;
   }
}
