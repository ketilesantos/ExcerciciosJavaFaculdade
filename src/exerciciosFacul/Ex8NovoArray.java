package exerciciosFacul;

import java.util.Arrays;

public class Ex8NovoArray {
	public static void main(String[] args) {

		Ex8ArraysDeFloatsCont array = new Ex8ArraysDeFloatsCont();

		float[] novoArrayFalse = new float[10];

		float[] novoArrayTrue = new float[] { 100f, 10f, 1f, 0.1f, 0.01f, 0.001f };

		System.out.println(eIgual(array, novoArrayFalse));
		System.out.print(eIgual(array, novoArrayTrue));

	}

	public static boolean eIgual(Ex8ArraysDeFloatsCont array, float[] novoArray) {

		if (array.getConstantes().length == novoArray.length && Arrays.equals(array.getConstantes(), novoArray)) {

			return true;

		}

		return false;

	}
}
