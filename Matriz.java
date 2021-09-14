import java.util.Scanner;
import java.util.Arrays;

public class Matriz {

	public Matriz() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Por favor, ingrese los datos para su Matriz:" + "\n" 
			+ "Ingrese el número de filas: ");
		int nFilas = sc.nextInt();
		System.out.print("Ingrese el número de columnas: ");
		int nCol = sc.nextInt();

		int[][] matriz = new int[nFilas][nCol];

		System.out.println("Rellene la Matriz:");
		for (int i = 0; i < nFilas; i++) {
			for (int j = 0; j < nCol; j++) {
				System.out.print("Matriz[" + i + "][" + j + "] = ");
				matriz[i][j] = sc.nextInt();
			}
		}
		System.out.println("");

		/* Le imprimo la matriz digita */
		for (int k = 0; k < nFilas; k++) {
			System.out.print("[");
			for (int l = 0; l < nCol; l++) {
				System.out.print(matriz[k][l] + " ");
			}
			System.out.print("]" + "\n");
		}
	}

	public static void main(String[] args) {
		Matriz frmWork = new Matriz();
	}
}
