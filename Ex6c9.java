package aed1;

public class Ex6c9 {

	public static void main(String[] args) {
		// Pedro Gabriel Sad Rabelo
		double den = 2, serie = 0, seriem;
		for (int aux = 1; aux <= 20; aux++) {
			serie += aux / Math.sqrt(den);
			den += 2;

		}
		seriem = serie + 10;
		System.out.println("Valor da série = " + seriem);

	}

}
