package aed1;

import java.util.Scanner;

public class Ex5c9 {

	public static void main(String[] args) {
		// Pedro Gabriel Sad Rabelo
		Scanner teclado = new Scanner(System.in);
		double termos, n1 = 0, n2 = 3, den = 7, serie = 0, serieh;
		System.out.println("Digite o número de termos a serem gerados pelo programa: ");
		termos = teclado.nextDouble();
		for (int aux = 1; aux <= termos; aux++) {
			serie += (n1 + n2) / den;
			n1 += 2;
			n2 += 3;
			den += 6;

		}
		serieh = serie * 5;
		System.out.println("Valor da série = " + serieh);
		teclado.close();
	}

}
