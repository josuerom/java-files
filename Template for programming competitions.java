/**
 * @author   Josué Romero
 * @created  31/03/23 21:29:54
 * @function Plantilla enfocada para competencias de programación -> vjudge.net codeforces.com
**/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.text.DecimalFormat;
import static java.lang.Math.*;

public class TemplateCP {

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

   public static void main(String[] args) throws IOException {
      Scanner sc = new Scanner();
      int tt = Integer.parseInt(sc.next());
      while (tt-- > 0) {
         ${1:Cursor_here}
      }
   }
}