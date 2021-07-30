package aed1;

public class Ex8c9 {

	public static void main(String[] args) {
		// Pedro Gabriel Sad Rabelo
		double n1 = 3, n2 = 5, den = 5, serie = 0, serieo;
		for (int aux = 1; aux <= 20; aux++) {
			serie += (n1 * Math.sqrt(n2)) / den;
			n1 += 2;
			n2 += 4;
			den *= 5;

		}
		serieo = Math.pow(serie, 2);
		System.out.println("Valor da série = " + serieo);

	}

}
