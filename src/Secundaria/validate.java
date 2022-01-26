package Secundaria;
import java.io.*;
import java.util.*;


public class validate{
    public static void main(String[] arg){
        SecundariaMain test = new SecundariaMain();
        Map<String,ArrayList<String>> curr = null;
        curr = test.load("Secundaria/exemplo.csv");
        System.out.println();
        if (curr==null){
            System.out.println(curr);
        }else{
            for (Map.Entry<String, ArrayList<String>> entry : curr.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }


    public boolean validateFile(String file_in){
        //String file_in = "exemplo.csv";
        int exitCode;
        try{
            ProcessBuilder pb = new ProcessBuilder("antlr4-run","Secundaria", "<",file_in);
            pb.redirectErrorStream(true);
            Process p = pb.start();
            //Process p = Runtime.getRuntime().exec("antlr4-run < " + file_in);
            InputStream is = p.getInputStream();
            System.out.println(toString(is));
            is.close();
            exitCode = p.waitFor();
            System.out.println(exitCode);
            if (exitCode != 0) return false;
            else return true;
        } catch (IOException e) {
            System.out.println("IO Error: " + e);
            return false;
        } catch (InterruptedException e) {
            System.out.println("Inturrupted: " + e);
            return false;
        }
    }

    public String toString(InputStream is) throws IOException {
        Writer writer = new StringWriter();
        char[] buffer = new char[1024];
        Reader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
        int n;
        while ((n = reader.read(buffer)) != -1) {
            writer.write(buffer, 0, n);
        }
        return writer.toString();
    }
}