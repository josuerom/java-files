import java.util.Scanner;

public class OopMatriz {
	private Scanner sc;
	private int[][] matriz;

	public static void main(String[] args) {
  	OopMatriz objeto = new OopMatriz();
	  objeto.cargarMatriz();
	  objeto.imprimirMatriz();
	}

	public void cargarMatriz() {
		sc = new Scanner(System.in);
		matriz = new int[3][3];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Matriz[" + i + "][" + j + "]: ");
				matriz[i][j] = sc.nextInt();
			}
		}
	}

	public void imprimirMatriz() {
		System.out.println("\nLa matriz digitada es:");
		for (int i = 0; i < 3; i++) {
			System.out.print("[");
			for(int j = 0; j < 3; j++) {
				if (j < 2) {
					System.out.print(matriz[i][j] + ", ");
				}
				if (j == 2) {
					System.out.print(matriz[i][j] + "]");
				}
			}
			// salto de línea para que la matriz salga en 2D
			System.out.println();
		}
	}
}
