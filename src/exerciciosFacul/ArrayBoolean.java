package exerciciosFacul;
import java.util.Arrays;
import java.util.Scanner;

/*Escreva uma aplicação em Java que declare e inicialize um vetor de booleanos 
 * (lendo-os do teclado, onde 0 é falso e qualquer outro valor é true), 
 * e depois calcule quantos elementos são iguais a true.*/

public class ArrayBoolean {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Boolean[] vetor = new Boolean[3];
		double valores;
		int tot = 0;
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("\nInforme o " + (i + 1) + " valor: ");
			valores = entrada.nextDouble();
			if (valores != 0) {
				vetor[i] = true;
				tot += sumTrue(1);
			} else {
				vetor[i] = false;
			}
		}
		System.out.println("------------------------------");
		System.out.println("Valores do vetor" +  Arrays.toString(vetor));
		System.out.println("Total de valores TRUE: " + tot);
		entrada.close();
	}

	public static int sumTrue(int valores) {
		return valores;
	}

}
