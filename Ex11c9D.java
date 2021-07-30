package aed1;

public class Ex11c9D {

	public static void main(String[] args) {
		// Pedro Gabriel Sad Rabelo
		double num = 1, den = 1, serie = 0;
		for (int aux = 1; aux <= 100; aux++) {
			serie += Math.pow(num, 3) / den;
			den *= 10;
			num++;
		}
		System.out.println("Valor da série = " + serie);

	}

}
