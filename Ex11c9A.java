package aed1;

public class Ex11c9A {

	public static void main(String[] args) {
		// Pedro Gabriel Sad Rabelo
		double n1 = 1, n2 = 1, den = 1, serie = 0, seriea;
		for (int aux = 1; aux <= 100; aux++) {
			serie += (n1 + n2) / Math.pow(den, 2);
			den *= 2;
			n1++;
			n2 += 7;
		}
		seriea = Math.cbrt(serie);
		System.out.println("Valor da série = " + seriea);

	}

}
