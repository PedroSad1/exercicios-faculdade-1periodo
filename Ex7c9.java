package aed1;

public class Ex7c9 {

	public static void main(String[] args) {
		// Pedro Gabriel Sad Rabelo
		double n1 = 0, n2 = 3, den = 7, serie = 0;
		for (int aux = 1; aux <= 6; aux++) {
			serie += (n1 + n2) / den;
			n1 += 2;
			n2 += 3;
			den += 6;

		}
		System.out.println("Valor da série = " + serie);

	}

}
