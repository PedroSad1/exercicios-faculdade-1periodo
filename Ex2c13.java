package aed1;

import java.util.Scanner;

public class Ex2c13 {
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 0;
		do {
			System.out.println("Informe o valor de X");
			x = teclado.nextDouble();
			System.out.println("f(x) = " + funcao(x));
		} while (x != -1);
	}

	static double funcao(double x) {
		double funcao = 0;
		if (x < 4) {
			funcao = (5 * x + 3) / Math.sqrt(16 - Math.pow(x, 2));
		} else {
			if (x == 4) {
				funcao = 0;
			} else {
				if (x > 4) {
					funcao = (5 * x + 3) / Math.sqrt(Math.pow(x, 2) - 16);
				}
			}
		}
		return funcao;
	}

}
