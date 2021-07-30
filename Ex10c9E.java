package aed1;

public class Ex10c9E {

	public static void main(String[] args) {
		// Pedro Gabriel Sad Rabelo
		double num = 1, den1 = 3, den2 = 2, serie = 0;
		for (int aux = 1; aux <= 100; aux++) {
			serie += num / (den1 * den2);
			num++;
			den2 += 2;
		}
		System.out.println("Valor da série = " + serie);

	}

}
