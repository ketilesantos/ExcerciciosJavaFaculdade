package exerciciosFacul;

import java.util.Arrays;

/*Qual ser� o conte�do dos arrays declarados na aplica��o abaixo ao t�rmino da execu��o do m�todo main?*/
public class ArrayDeFloats {
	public static void main(String[] argumentos) {
		float[] constantes = { 100f, 10f, 1f, 0.1f, 0.01f, 0.001f };
		float[] duplicata = constantes;
		resetaArray(duplicata);

		System.out.println(Arrays.toString(constantes));
		System.out.println(Arrays.toString(duplicata));

	}

	private static void resetaArray(float[] array) {
		for (int �ndice = 0; �ndice < array.length; �ndice++)
			array[�ndice] = 0f;
	}
	
}