package exerciciosFacul;

import java.util.Arrays;

/*Qual será o conteúdo dos arrays declarados na aplicação abaixo ao término da execução do método main?*/
public class ArrayDeFloats {
	public static void main(String[] argumentos) {
		float[] constantes = { 100f, 10f, 1f, 0.1f, 0.01f, 0.001f };
		float[] duplicata = constantes;
		resetaArray(duplicata);

		System.out.println(Arrays.toString(constantes));
		System.out.println(Arrays.toString(duplicata));

	}

	private static void resetaArray(float[] array) {
		for (int índice = 0; índice < array.length; índice++)
			array[índice] = 0f;
	}
	
}