package exerciciosFacul;


public class Ex1Alfabeto {
	public static void main(String[] args) {
		char[] alfabeto = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I' };
		int posicao = 4;
		int indice = posicao - 1;
		System.out.println("Qual �ndice e valor da posi��o 4? " + "O valor da posi��o � " +  alfabeto[3] +
				" e seu �ndice � " + indice);
		System.out.println("Quantas posi��es tem o array? " + "O array tem "+alfabeto.length + " posi��es.");
		
	}
}