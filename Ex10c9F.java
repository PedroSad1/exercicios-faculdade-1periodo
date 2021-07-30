package aed1;

public class Ex10c9F {

	public static void main(String[] args) {
		// Pedro Gabriel Sad Rabelo
		double num = 1, den = 2, serie = 0;
		for (int aux = 1; aux <= 100; aux++) {
			serie += Math.pow(num, 2) / Math.pow(den, 2);
			num++;
			den += 2;
		}
		System.out.println("Valor da série = " + serie);

	}

}
