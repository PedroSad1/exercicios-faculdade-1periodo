package aed1;

import java.util.Scanner;

public class Ex1c13 {
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1 = 0, x2 = 0, y1 = 0, y2 = 0;
		System.out.println("Informe o valor de X1");
		x1 = teclado.nextDouble();
		System.out.println("Informe o valor de Y1:");
		y1 = teclado.nextDouble();
		System.out.println("Informe o valor de X2");
		x2 = teclado.nextDouble();
		System.out.println("Informe o valor de Y2:");
		y2 = teclado.nextDouble();
		System.out.println("Distância = " + distancia(x1, x2, y1, y2));

	}

	static double distancia(double x1, double x2, double y1, double y2) {
		double distancia = 0;
		distancia = Math.sqrt((Math.pow(x1, 2) - (2 * x1 * x2) + Math.pow(x2, 2))
				+ (Math.pow(y1, 2) - (2 * y1 * y2) + Math.pow(y2, 2)));
		return distancia;

	}
}
