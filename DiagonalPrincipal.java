import java.util.Arrays;

public class DiagonalPrincipal {
	private int[][] matriz;

	public static void main(String [] args) {
		DiagonalPrincipal objeto = new DiagonalPrincipal();
		objeto.matrizDiagonal();
		objeto.imprimirMatriz();
	}

	public void matrizDiagonal() {
		matriz = new int[4][4];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == j) {
					matriz[i][j] = 1;
				}
			}
		}
	}

	public void imprimirMatriz() {
		System.out.println("La matriz con la diagonal principal es:");
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(Arrays.toString(matriz[i]));
		}
	}
}
