package exerciciosFacul;

public class Ex8ArraysDeFloatsCont {

	private float[] constantes = { 100f, 10f, 1f, 0.1f, 0.01f, 0.001f };

	public static void main(String[] argumentos)

	{

		float[] constantes = { 100f, 10f, 1f, 0.1f, 0.01f, 0.001f };

		float[] duplicata = constantes;

		resetaArray(duplicata);

	}

	private static void resetaArray(float[] array)

	{

		for (int �ndice = 0; �ndice < array.length; �ndice++)

			array[�ndice] = 0f;

	}

	public float[] getConstantes() {
		return constantes;
	}

}
