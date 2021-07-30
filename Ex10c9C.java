package aed1;

public class Ex10c9C {

	public static void main(String[] args) {
		// Pedro Gabriel Sad Rabelo
		double num = 1, den = 2, serie = 0, seriec;
		for (int aux = 1; aux <= 100; aux++) {
			serie += num / den;
			num += 2;
			den += 2;

		}
		seriec = Math.pow(serie, 2) / 3;
		System.out.println("Valor da série = " + seriec);

	}

}
