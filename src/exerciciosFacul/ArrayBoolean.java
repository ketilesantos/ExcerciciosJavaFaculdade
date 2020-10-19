package exerciciosFacul;
import java.util.Scanner;

/*Escreva uma aplicação em Java que declare e inicialize um vetor de booleanos 
 * (lendo-os do teclado, onde 0 é falso e qualquer outro valor é true), 
 * e depois calcule quantos elementos são iguais a true.*/

public class ArrayBoolean {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Boolean[] vetor = new Boolean[3];

		for (int i = 0; i <vetor.length; i++) {
			System.out.print("\nInforme o " + (i + 1) + " valor: ");
			vetor[i] = entrada.nextBoolean();
		
			
		}
		entrada.close();
	}
}
