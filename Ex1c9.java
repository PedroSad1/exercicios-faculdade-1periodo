package aed1;

public class Ex1c9 {

	public static void main(String[] args) {
		// Pedro Gabriel Sad Rabelo
		double num1 = 37, num2 = 38, serie = 0;
		for (int aux = 1; aux <= 37; aux++) {
			serie += (num1 * num2) / aux;
			num1--;
			num2--;
		}
		System.out.println("Valor da série = " + serie);
		
	}

}
