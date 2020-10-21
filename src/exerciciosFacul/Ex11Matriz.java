package exerciciosFacul;

import java.util.Arrays;
import java.util.Scanner;

public class Ex11Matriz {
	public static void main(String[] args) {
		
		double[][] matriz = new double[2][2];
		calculaMatriz(matriz);
		
	}
	
	static double calculaMatriz(double [][] array) {
		Scanner entrada = new Scanner(System.in);
		double det = 0;
		for(int i = 0; i<array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.println("Informe: ");
				array[i][j] = entrada.nextDouble();
				det = array[j][j];
				
			}
		}
		 System.out.println(det);
		entrada.close();
		return det;
	}
	
	
}
