package aed1;

public class Ex11c9F {

	public static void main(String[] args) {
		// Pedro Gabriel Sad Rabelo
		double n1 = 1, n2 = 4, den = 2, serie = 0, serief;
		for (int aux = 1; aux <= 100; aux++) {
			serie += (n1 * n2) / Math.pow(den, 2);
			den += 5;
			n1 += 2;
			n2 *= 2;
		}
		serief = 5 * Math.sqrt(serie);
		System.out.println("Valor da série = " + serief);

	}

}
