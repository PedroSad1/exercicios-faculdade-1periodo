package aed1;

import java.util.Scanner;

public class Ex20c8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double imc, altura = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite sua altura");
		altura = teclado.nextDouble();
		for (int aux = 60; aux <= 100; aux++) {
			imc = aux / (altura*altura);
			System.out.println(imc);
			if (imc < 20) {
				System.out.println("Abaixo do peso");
			}
			if (imc >= 20 && imc <= 25) {
				System.out.println("Peso ideal");
			}
			if (imc > 25) {
				System.out.println("Acima do peso");
			}

		}
		teclado.close();
	}

}
