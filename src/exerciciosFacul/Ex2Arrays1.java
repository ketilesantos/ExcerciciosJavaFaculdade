package exerciciosFacul;

import java.util.Arrays;

public class Ex2Arrays1 {
	public static void main(String[] argumentos) {

		double[] valores = { 1, 2, 3, 4, 5, 6 };

		double[] primeiraC�pia = valores;

		double[] segundaC�pia = valores;

		primeiraC�pia[1] = 1;

		segundaC�pia[2] = valores[0] + primeiraC�pia[1];

		primeiraC�pia[3] = valores[1] + segundaC�pia[2];

		valores[4] = primeiraC�pia[2] + segundaC�pia[3];

		valores[5] = segundaC�pia[3] + primeiraC�pia[4];

		System.out.println(Arrays.toString(valores));
		System.out.println(Arrays.toString(primeiraC�pia));
		System.out.println(Arrays.toString(segundaC�pia));
		
	}
}