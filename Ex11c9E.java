package aed1;

public class Ex11c9E {

	public static void main(String[] args) {
		// Pedro Gabriel Sad Rabelo
		double n1 = 1, n2 = 5, den = 2, serie = 0, seriee, potenciaDen = 1;
		for (int aux = 1; aux <= 100; aux++) {
			serie += (Math.pow(n1, 2) * Math.sqrt(n2)) / Math.pow(den, potenciaDen);
			den++;
			potenciaDen++;
			n2 += 2;
			n1++;
		}
		seriee = (serie * 2) / 3;
		System.out.println("Valor da série = " + seriee);

	}

}
