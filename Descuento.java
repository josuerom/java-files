import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Descuento {

	public Descuento() throws IOException  {
		int cantidadPiezas, precioPiezas, totalInicial = 0, totalFinal = 0;
		float descuento = 0.20f;
		System.out.print("Cuántas piezas fuerón vendidas? = ");
		cantidadPiezas = leerNumero();
		System.out.print("Cuál fue el precio por piezas? = ");
		precioPiezas = leerNumero();

		totalInicial = cantidadPiezas * precioPiezas;	

		if (cantidadPiezas >= 100) {
			totalFinal = (int)(totalInicial * descuento);
			System.out.println("Como comprarón 100 o más piezas ganarón un descuento del 20%, deben pagar = $" + totalFinal);
		} else {
			System.out.println("Como comprarón menos de 100 piezas no reciben descuento, deben pagar = $" + totalInicial);
		}
	}

	public static void main(String[] args) throws IOException  {
		Descuento ejercicio18 = new Descuento();
	}

	private static Integer leerNumero() throws IOException {
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(entrada);
		String strNumero = buffer.readLine();
		Integer numero = Integer.parseInt(strNumero);
		return numero;
	}
}
