package exerciciosFacul;

import java.util.Arrays;

public class Ex2Arrays1 {
	public static void main(String[] argumentos) {

		double[] valores = { 1, 2, 3, 4, 5, 6 };

		double[] primeiraCópia = valores;

		double[] segundaCópia = valores;

		primeiraCópia[1] = 1;

		segundaCópia[2] = valores[0] + primeiraCópia[1];

		primeiraCópia[3] = valores[1] + segundaCópia[2];

		valores[4] = primeiraCópia[2] + segundaCópia[3];

		valores[5] = segundaCópia[3] + primeiraCópia[4];

		System.out.println(Arrays.toString(valores));
		System.out.println(Arrays.toString(primeiraCópia));
		System.out.println(Arrays.toString(segundaCópia));
		
	}
}