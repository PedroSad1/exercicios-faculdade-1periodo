package aed1;

public class Ex13c9 {

	public static void main(String[] args) {
		// Pedro Gabriel Sad Rabelo
		double den = 1, serie = 0, fatorial = 1, num1 = 0, somaden = 2;
		for (int aux = 1; aux <= 10; aux++) {
			num1++;
			for (int auxi = 1; auxi <= num1; auxi++) {
				fatorial *= auxi;
			}
			if (aux % 2 == 0) {
				serie -= fatorial / den;
			} else {
				serie += fatorial / den;
			}
			den += somaden;
			somaden *= 2;
			fatorial = 1;
		}
		System.out.println("Valor da série = " + serie);

	}

}
