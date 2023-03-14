
public class Hanoi {
	
	public static void hanoi3() {
		hanoi(3, 1, 3, 2);
	}
	
	private static void hanoi(int numeroPinos, int inicio, int fim, int proximo) {
		if (numeroPinos > 0) {
			hanoi(numeroPinos - 1, inicio, proximo, fim);
			System.out.println("levar o disco de " + inicio + " para " + fim);

			hanoi(numeroPinos - 1, proximo, fim, inicio);
		}
	}
	
	public static void main(String[] args) {
	    hanoi3();
	}
}