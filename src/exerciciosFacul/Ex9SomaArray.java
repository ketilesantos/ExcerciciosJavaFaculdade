package exerciciosFacul;

import java.util.Arrays;

public class Ex9SomaArray {

	public static void main(String[] argumentos){

		float[] constantes = { 100f, 10f, 1f, 0.1f, 0.01f, 0.001f };
		float[] duplicata = constantes;

		resetaArray(duplicata);
		soma( duplicata, 25);
		
		System.out.println(Arrays.toString(duplicata));
	}

	private static void resetaArray(float[] array){

		for (int índice = 0; índice < array.length; índice++)

			array[índice] = 0f;
	}
	
	private static float soma(float[] some, float total) {
	
		for (int i = 0; i <some.length;i++) {
			some[i]+=total;
		}
		return total;
	}
}
