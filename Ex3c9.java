package aed1;

import java.util.Scanner;

public class Ex3c9 {

	public static void main(String[] args) {
		// Pedro Gabriel Sad Rabelo
		Scanner teclado = new Scanner(System.in);
		double num = 4, den = 3, serie = 0, termos;
		System.out.println("Digite o número de termos a serem gerados pelo programa: ");
		termos = teclado.nextDouble();
		for (int aux = 1; aux <= termos; aux++) {
			serie += (1 + Math.sqrt(num)) / den;
			den += 3;
			num += 4;

		}
		System.out.println("Valor da série = " + serie);
		teclado.close();
	}

}
