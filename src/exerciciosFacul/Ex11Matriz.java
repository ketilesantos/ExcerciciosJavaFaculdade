package exerciciosFacul;
import java.util.Arrays;
import java.util.Scanner;

public class Ex11Matriz {
	private static double[][] matriz = new double[2][2];
	public static void main(String[] args) {

		double determinante = calculaMatriz(matriz);
		
		System.out.println("O calculo do determinante é: " + determinante);
		
		for(double[] mat: matriz ) {
			System.out.println("Impressão da matriz: " + Arrays.toString(mat));
		}
	}
	
	private static double calculaMatriz(double [][] array) {
		Scanner entrada = new Scanner(System.in);
		double variavel1 = 0;
		double variavel12 = 0;
		double variavel2 = 0;
		double variavel21 = 0;
		double det = 0;
		for(int i = 0; i<array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print("Informe: ");
				array[i][j] = entrada.nextDouble();
				if(i ==0 && j==0){
                    variavel1=array[i][j];
                }

                if(i ==1 && j==1){
                    variavel12=array[i][j];
                }
                
                if(i ==0 && j==1){
                    variavel2=array[i][j];
                }

                if(i ==1 && j==0){
                    variavel21=array[i][j];
                }
			}
		}
	    det = (variavel1 *variavel12) - (variavel2 * variavel21);
		entrada.close();
		return det;
	}
	
	
}
