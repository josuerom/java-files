import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class NumerosPrimos {

	public static void main(String[] args) throws IOException {
		System.out.print("¿Cuántos números primos quieres ver?: ");
		Integer pedido = leerNumero();

		int contador = 0, numero = 2;
		String resl = "";
		while (contador < pedido) {
			if (numeroPrimo(numero)) {
				if (contador < pedido-1) {
					resl += numero + ", ";
					contador++;
				}
				if (contador == pedido-1) {
					resl += numero + "]";
					contador++;
				}
			}
			numero++;
		}
		System.out.println("[" + resl);
	}

	private static Integer leerNumero() throws IOException  {
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(entrada);
		String strNumero = buffer.readLine();
		Integer numero = Integer.parseInt(strNumero);
		return numero;
	}

	private static Boolean numeroPrimo(Integer numero) {
		Boolean esPrimo = true;

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				esPrimo = false;
			}
		}
		return esPrimo;
	}
}
