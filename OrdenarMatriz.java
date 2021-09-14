/*import java.io.IOExeption;
import java.io.InputStreamReader;
import java.io.BufferedReader;*/
import java.util.Scanner;
import java.util.Arrays;

public class OrdenarMatriz {

	public OrdenarMatriz() {
		Scanner sc = new Scanner(System.in);
		int nFilas, nCol, nMayor = 0;
	
		System.out.println("Por favor, ingrese los datos solicitados para la matriz.");
		System.out.print("Ingrese la cantidad de filas: ");
		nFilas = sc.nextInt();
		System.out.print("Ingrese la cantidad de columnas: ");
		nCol = sc.nextInt();

		int matriz[][] = new int[nFilas][nCol];

		System.out.println("");
		for (int i = 0; i < nFilas; i++) {
			for (int j = 0; j < nCol; j++) {
				System.out.print("Matriz[" + i + "][" + j + "]: ");
				matriz[i][j] = sc.nextInt(); 
			}
		}

		/* Ordenar la matriz por método burbuja */
		for (int i = 0; i < (nFilas); i++) {
			for (int j = 0; j < (nCol); j++) {
				for (int k = 0; k < (nFilas); k++) {
					for (int l = 0; l < (nCol); l++) {
						if (matriz[i][j] > matriz[k][l]) {// 9 > 5
							nMayor = matriz[i][j]; //nMayor = 9
							matriz[i][j] = matriz[k][l]; // 9 pos++
							matriz[k][l] = nMayor;
						}
					}
				}
			}
		}
		/* Le comparto la matriz ordenada al usuario */
		//System.out.println("\nMatriz Ordenada = " + Arrays.deepToString(matriz));
		System.out.println("\nMatriz en 2D.");
		for(int h = 0; h < nFilas; h++) {
			for(int j = 0; j < nCol; j++)
				System.out.print(matriz[h][j] + " ");
				System.out.println();
		}
	}

	public static void main(String[] args) {
		OrdenarMatriz practica = new OrdenarMatriz();
	}

	/*private static int leerNumero() throws IOExeption {
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(entrada);
		String strNumero = buffer.readLine();
		int numero = Integer.parseInt(strNumero);
		return numero;
	}*/
}
