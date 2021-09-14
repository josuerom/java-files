import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Pares {

  public static void main(String[] args) throws IOException {
    System.out.print("Ingrese el número: ");
    Integer numero = leerNumero();

    /* Llamo al método esParOImpar */
    esParOImpar(numero);
  }

  private static Integer leerNumero() throws IOException {
    InputStreamReader entrada = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(entrada);
    String strNumero = buffer.readLine();
    Integer numero = Integer.parseInt(strNumero);
    return numero;
  }

  private static void esParOImpar(Integer numero) {
    if (numero%2 == 0) {
      System.out.println("El número " + numero + " es PAR.");
    } else {
      System.out.println("El número " + numero + " es IMPAR.");
    }
  }
}
