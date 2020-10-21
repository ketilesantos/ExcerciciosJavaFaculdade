package exerciciosFacul;

public class Ex6ArrayMes {
	public static int meses[] = {31,28,31,30,31,30,31,31,30,31,30,31};

	public static void main(String[] args) {
		
		
		System.out.println(getMeses(12));
	}
	
	public static int getMeses(int mes) {
		return meses[mes-1];
	}
}
