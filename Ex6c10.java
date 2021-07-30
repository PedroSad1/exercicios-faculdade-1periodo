package aed1;

import java.util.Scanner;

public class Ex6c10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double a, b, c, x, y, d = 1;
		System.out.println("Digite o valor de A: ");
		a = teclado.nextDouble();
		System.out.println("Digite o valor de B: ");
		b = teclado.nextDouble();
		System.out.println("Digite o valor de C: ");
		c = teclado.nextDouble();
		do {
			System.out.println("Informe o valor de X: ");
			x = teclado.nextDouble();
			System.out.println("Informe o valor de Y: ");
			y = teclado.nextDouble();
			d = ((a * x) + (b * y) + c) / Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
			if (d == 0) {
				System.out.println("As coordenadas " + x + " e " + y + " coincidem com a reta.");
			}
			System.out.println("Distância: " + d);
		} while (d != 0);
		teclado.close();

	}

}
