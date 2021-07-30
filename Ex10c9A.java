package aed1;

public class Ex10c9A {

	public static void main(String[] args) {
		// Pedro Gabriel Sad Rabelo
		double num = 1, den = 2, serie = 0;
		for (int aux = 1; aux <= 100; aux++) {
			serie += num / Math.sqrt(den);
			den += 2;
			num++;

		}
		System.out.println("Valor da série = " + serie);

	}

}
