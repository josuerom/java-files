import java.util.Arrays;

/*
 * @see programa que encuentre el número mayor de un arreglo de números aleatorios.
 * @author Josué Romero Jarava
 * @date 5/09/2021  3:42p.m  COL
*/
public class Aleatorio {

	public Aleatorio() {
		int numMayor = 0, orden = 0;
		int array[] = new int[10];

		for (int i = 0; i < array.length; i++) {
		   // genero números aleatorios entre 0 y 50.
				array[i] = (int)(Math.random() * 50 - 0);
		}
		System.out.println("Arreglo Aleatorio = " + Arrays.toString(array));

		/* Método burbuja de ordenamiento */
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length-1; j++) {
				if (array[j] > array[j+1]) {
					orden = array[j];
					array[j] = array[j+1];
					array[j+1] = orden;
				}
			}
		}
		System.out.println("Arreglo Ordenado = " + Arrays.toString(array));

		for (int i = 0; i < array.length; i++) {
			if (array[i] > numMayor) {
				numMayor = array[i];
			}
		}
		System.out.println("El número mayor es: " + numMayor);
	}

	public static void main(String[] args) {
		Aleatorio ejercicio20 = new Aleatorio();
	}
}
