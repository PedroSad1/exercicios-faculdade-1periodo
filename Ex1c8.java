package aed1;

import java.util.Scanner;

public class Ex1c8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double area, pi = 3.1416, raio;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 1; aux <= 10; aux++) {
			System.out.println("Informe o raio do círculo: ");
			raio = teclado.nextDouble();
			area = pi * Math.pow(raio, 2);
			System.out.println("Área: " + area);
		}
		teclado.close();

	}

}
