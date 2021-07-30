package aed1;

public class Ex11c9B {

	public static void main(String[] args) {
		// Pedro Gabriel Sad Rabelo
		double num = 1, den = 7, serie = 0, serieb;
		for (int aux = 1; aux <= 100; aux++) {
			serie += num / Math.sqrt(den);
			num += 3;
			den += 3;
		}
		serieb = 1.666666666666667 * serie;
		System.out.println("Valor da série = " + serieb);

	}

}
