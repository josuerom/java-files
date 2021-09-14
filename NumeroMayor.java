import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class NumeroMayor {

	public NumeroMayor() throws IOException {
		System.out.print("Ingrese el primer número: ");
		Integer numero1 = leerNumero();
		System.out.print("Ingrese el segundo número: ");
		Integer numero2 = leerNumero();
		System.out.print("Ingrese el tercer número: ");
		Integer numero3 = leerNumero();

		calcularNumeroMayor(numero1, numero2, numero3);
		calcularNumeroMenor(numero1, numero2, numero3);
	}

	public static void main(String[] args) throws IOException {
		NumeroMayor practica = new NumeroMayor();
	}

	private static Integer leerNumero() throws IOException {
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(entrada);
		String strNumero = buffer.readLine();
		Integer numero = Integer.parseInt(strNumero);
		return numero;
	}

	private static void calcularNumeroMayor(Integer n1, Integer n2, Integer n3) {
		Integer numeroMayor = n1;
		if (n2 > numeroMayor) {
			numeroMayor = n2;
		}
		if (n3 > numeroMayor) {
			numeroMayor = n3;
		}
		System.out.println("\nEl número mayor es: " + numeroMayor);
	}

	private static void calcularNumeroMenor(Integer n1, Integer n2, Integer n3) {
		Integer numeroMenor = n1;
		if (n2 < numeroMenor) {
			numeroMenor = n2;
		}
		if (n3 < numeroMenor) {
			numeroMenor = n3;
		}
		System.out.println("El número menor es: " + numeroMenor);
		}
}
