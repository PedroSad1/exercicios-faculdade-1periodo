package aed1;

import java.util.Scanner;

public class Ex9c9 {

	public static void main(String[] args) {
		// Pedro Gabriel Sad Rabelo
		Scanner teclado = new Scanner(System.in);
		double termos, num = 9, den1 = 1, serie = 0, seriek, den = 10, den2 = 1, den3 = 1, denominador;
		System.out.println("Digite o número de termos a serem gerados pelo programa: ");
		termos = teclado.nextDouble();
		for (int aux = 1; aux <= termos; aux++) {
			denominador = (den * Math.sqrt(den3));
			serie += num / denominador;
			num *= 3;
			den2 = den1 * den1;
			den3 = den2 * den2;
			den1++;
			den++;

		}
		seriek = 100 - Math.pow(serie, 3);
		System.out.println("Valor da série = " + seriek);
		teclado.close();

	}

}
