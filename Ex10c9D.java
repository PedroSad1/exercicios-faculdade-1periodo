package aed1;

public class Ex10c9D {

	public static void main(String[] args) {
		// Pedro Gabriel Sad Rabelo
		double n1 = 1, n2 = 0, den = 1, serie = 0, somaden = 3;
		for (int aux = 1; aux <= 100; aux++) {
			serie += (n1 + n2) / den;
			den += somaden;
			somaden += 2;
			n1++;
			n2++;

		}
		System.out.println("Valor da série = " + serie);

	}

}
