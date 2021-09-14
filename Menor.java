import java.util.Arrays;

/*
 * @see programa que encuentre el número menor de un arreglo de números aleatorios.
 * @author Josué Romero Jarava
 * @date 5/09/2021  3:42p.m  COL
*/
public class Menor {

	public Menor() {
		int numMenor = 0;
		int array[] = new int[13];

		for (int i = 0; i < array.length; i++) {
		   // genero números aleatorios entre 1 y 100.
				array[i] = (int)(Math.random() * 100 + 1);
		}
		System.out.println("Arreglo Aleatorio = " + Arrays.toString(array));

		for (int j = 0; j < array.length; j++) {
			if (j == 0) {
				numMenor = array[0];
			}
			if (numMenor <= array[j]) {
				numMenor = array[j];
			}
		}
		System.out.println("El número menor es: " + numMenor);
	}

	public static void main(String[] args) {
		Menor ejercicio21 = new Menor();
	}
}
