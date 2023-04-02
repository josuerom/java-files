/**
 * @author   Josué Romero
 * @created  31/03/23 21:29:54
 * @function Plantilla enfocada para competencias de programación -> vjudge.net codeforces.com
**/
import java.io.*;
import java.util.StringTokenizer;
import java.lang.StringBuilder;
import java.util.Arrays;
import static java.lang.Math.*;

public class TemplateCP {

   public static void main(String[] args) throws IOException {
      Scanner sc = new Scanner();
      PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
      int tt = Integer.parseInt(sc.next());
      while (tt-- > 0) {
         //Write solve!
      }
      pr.close();
   }

   static class Scanner {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer("");
      int spaces = 0;

      public String nextLine() throws IOException {
         if (spaces-- > 0) return "";
         else if (st.hasMoreTokens()) return new StringBuilder(st.nextToken("\n")).toString();
         return br.readLine();
      }

      public String next() throws IOException {
         spaces = 0;
         while (!st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
         return st.nextToken();
      }

      public boolean hasNext() throws IOException {
         while (!st.hasMoreTokens()) {
            String line = br.readLine();
            if (line == null) return false;
            if (line.equals("")) spaces = Math.max(spaces, 0) + 1;
            st = new StringTokenizer(line);
         }
         return true;
      }
   }
}
