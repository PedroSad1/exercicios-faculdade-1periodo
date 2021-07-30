package aed1;

public class Ex2c9 {

	public static void main(String[] args) {
		// Pedro Gabriel Sad Rabelo
		double num = 0, den1 = 1, den2 = 0, den, serie = 0;
		for (int aux = 1; aux <= 100; aux++) {
			num = aux;
			den2 = aux - 1;
			den = (Math.pow(den1, 2) + den2);
			serie += num / den;
			den1++;

		}
		System.out.println("Valor da série = " + serie);
	}

}
