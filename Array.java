import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public Array() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese el tamaño del array: ");
		int tam = sc.nextInt();

		int[] arr = new int[tam];

		/* El usuario llena el array */
		for (int k = 0; k < arr.length; k++) {
			System.out.print("Array[" + k + "]: ");
			arr[k] = sc.nextInt();
		}
	  /* Ordeno el array con el método Arrays.sort(arr) */
		Arrays.sort(arr);
		System.out.println("\nArray = " + Arrays.toString(arr));

		// Imprimo el array con el método stream(arr).forEach(System.out::println)
		// Arrays.stream(arr).forEach(System.out::print);

		// Imprimo el array con el método Arrays.asList
		Integer arch[] = {4, 9, 31, 45, 1};
		System.out.println("Array = " + Arrays.asList(arch));

		String[][] strArray = new String[][] {{"Josue", "Mary"}, {"Andri", "Bob Esponja"}};
		System.out.println("\n" + Arrays.deepToString(strArray));
	}

	public static void main(String[] args) {
		Array practicaNvim = new Array();
	}
	/* Métodos existentes en java para imprimir arreglos o matrices
		Arrays.toString = imprime arreglos o matrices de tipo primitivos [int,byte, short, long, float y double].
		Arrays.deepToString = si su matriz contiene otras matrices como elementos utlice ese método.
  
		Usa el bucle for para imprimir un array en Java
    Usando el método toString() para imprimir un array en Java
    Use el método stream().forEach() para imprimir un array en Java
    Usar el método asList() para imprimir el array multidimensional en Java
    Use el método deepToString() para imprimir un array multidimensional en Java
	*/ 
}

