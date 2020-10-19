package exerciciosFacul;


public class Ex1Alfabeto {
	public static void main(String[] args) {
		char[] alfabeto = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I' };
		int posicao = 4;
		int indice = posicao - 1;
		System.out.println("Qual índice e valor da posição 4? " + "O valor da posição é " +  alfabeto[3] +
				" e seu índice é " + indice);
		System.out.println("Quantas posições tem o array? " + "O array tem "+alfabeto.length + " posições.");
		
	}
}