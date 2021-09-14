public class Multiply {

	public static void main(String[] args) {
		Multiply practice = new Multiply();
		practice.multiplication(50, -50);
	}

	public void multiplication(int x, int y) {
		boolean positive = Math.abs(y) == y;
		int resultado = 0;

		for (int i = 0; i < Math.abs(y); i++) {
			if (positive) {
				resultado += resultado + x;
			} else {
				resultado += resultado - x;
			}
		}
		System.out.println("Multiplication is = " + resultado);
	}
}
