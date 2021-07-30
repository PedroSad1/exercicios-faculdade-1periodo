package aed1;

public class Ex12c9 {

	public static void main(String[] args) {
		// Pedro Gabriel Sad Rabelo
		double serie = 0, num = 1, den = 1, seriepi, auxi = 2;
		for (int aux = 1; aux <= 10000; aux++) {
			if (auxi % 2 == 0) {
				serie += num / den;
			} else {
				serie -= num / den;
			}
			den += 2;
			auxi++;
		}
		seriepi = serie * 4;
		System.out.println("Valor da série = " + seriepi);

	}

}
