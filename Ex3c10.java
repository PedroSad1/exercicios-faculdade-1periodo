package aed1;

import java.util.Scanner;

public class Ex3c10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double angulo, pi = 3.1416, raio, setor;
		System.out.println("Digite o valor do ângulo do setor circular: ");
		angulo = teclado.nextDouble();
		do {
			System.out.println("Informe o raio do setor circular: ");
			raio = teclado.nextDouble();
			if (raio == -1) {
				break;
			}
			setor = (angulo * pi * Math.pow(raio, 2)) / 360;
			System.out.printf("Setor = %.4f\n", setor);

		} while (raio != -1);
		teclado.close();
	}

}
