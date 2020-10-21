package exerciciosFacul;

import java.util.Arrays;
import java.util.Scanner;

public class Ex12Array {
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);

		int[] valoresArray = new int[10];

		boolean[] verificaValoresArray = new boolean[10];

		for (int i = 0; i < verificaValoresArray.length; i++) {

			verificaValoresArray[i] = true;
		}

		System.out.println("Deseja informar um valor? S/N");

		String imputUsuario  = entrada.next();

		if (imputUsuario.equals("S")) {

			for (int i = 0; i < valoresArray.length; i++) {

				System.out.println("Qual o valor do indice " + (i+1) + "?");

				int recebeValor = entrada.nextInt();

				if (verificaValoresArray[i] == true) {

					valoresArray[i] = recebeValor;

					if (valoresArray[i] != 0) {

						verificaValoresArray[i] = false;

					} else {

						System.out.println("O campo inválido! Ele já foi modificado uma vez.");

					}
				}
			}
		}

		System.out.println(Arrays.toString(valoresArray));
		System.out.println(Arrays.toString(verificaValoresArray));
		
		entrada.close();
	}

}