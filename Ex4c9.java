package aed1;

import java.util.Scanner;

public class Ex4c9 {

	public static void main(String[] args) {
		// Pedro Gabriel Sad Rabelo
		Scanner teclado = new Scanner(System.in);
		double termos, num1 = 1, num2 = 2, den1 = 3, den2 = 4, serie = 0, num, den, serie1;
		System.out.println("Digite o número de termos a serem gerados pelo programa: ");
		termos = teclado.nextDouble();
		for (int aux = 1; aux <= termos; aux++) {
			num = num1 * num2;
			den = den1 * den2;
			serie += num / den;
			num1 += 4;
			num2 += 4;
			den1 += 4;
			den2 += 4;
		}
		serie1 = Math.sqrt(serie);
		System.out.println("Valor da série = " + serie1);
		teclado.close();

	}

}
