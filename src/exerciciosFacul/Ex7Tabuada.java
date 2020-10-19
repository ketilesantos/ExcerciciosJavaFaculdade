package exerciciosFacul;

public class Ex7Tabuada {
	public static void main(String[] args) {
		int[][] tabuada  = new int[10][10];
		
		
		for (int i = 0; i < tabuada.length; i++) {
			System.out.println("Tabuada do " + i + ":");
			for (int j = 0; j < tabuada.length; j++) {
				int valor = i + j;
				System.out.printf("[%d] + [%d] = %d\n", i, j , valor );
			}
			System.out.println("---------------");
		}
	}
}
