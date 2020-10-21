package exerciciosFacul;

public class Ex17QuadradoMagico {
	static int matriz[][] = new int[3][3];

	public static void main(String[] args) {

		matriz[0][0] = 2;
		matriz[0][1] = 9;
		matriz[0][2] = 4;
		matriz[1][0] = 7;
		matriz[1][1] = 5;
		matriz[1][2] = 3;
		matriz[2][0] = 6;
		matriz[2][1] = 1;
		matriz[2][2] = 8;

		boolean verifica = eQuadrado(matriz);
		System.out.println("Quadrado Magico: " + verifica);
	}

	private static boolean eQuadrado(int[][] matriz) {
		boolean ehQuadradoMagico = true;
		int primeiraLinha = 0;
		int primeiraColuna = 0;

		for (int i = 0; i < matriz.length; i++) {
			int totalLinha = 0;
			int totalColuna = 0;
			for (int j = 0; j < 3; j++) {
				if (i == 0) {
					primeiraLinha += matriz[i][j];
					primeiraColuna += matriz[j][i];
				}
				totalLinha += matriz[i][j];
				totalColuna += matriz[j][i];
			}
			if (totalLinha != primeiraLinha || totalLinha != totalColuna || totalColuna != primeiraColuna
					|| primeiraColuna != primeiraLinha) {
				ehQuadradoMagico = false;
			}
		}
		return ehQuadradoMagico;
	}
}
