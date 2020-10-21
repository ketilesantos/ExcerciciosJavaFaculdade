package exerciciosFacul;

public class Ex10BooleanArray {
	public static void main(String[] argumentos) {

		float[] constantes = { 100f, 10f, 1f, 0.1f, 0.01f, 0.001f };

		float[] duplicata = constantes;

		resetaArray(duplicata);
		System.out.println(existe(duplicata, 0f));
	}

	private static void resetaArray(float[] array) {

		for (int índice = 0; índice < array.length; índice++)

			array[índice] = 0f;
	}
	
	private static boolean existe(float[] arrayDup, float num) {
		boolean retorno = false;
		for(int i = 0; i <arrayDup.length;i++) {
			if(arrayDup[i] == num) {
				retorno = true;
			}
		}
		return retorno;
	}
}
