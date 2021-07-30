package aed1;

public class Ex10c9B {

	public static void main(String[] args) {
		// Pedro Gabriel Sad Rabelo
		double num = 2, den = 3, serie = 0, serieb;
		for (int aux = 1; aux <= 100; aux++) {
			serie += num / den;
			num += 2;
			den += 3;

		}
		serieb = 1 + Math.sqrt(serie);
		System.out.println("Valor da série = " + serieb);

	}

}
