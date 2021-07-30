package aed1;

import java.util.Scanner;

public class Ex4c13 {
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 0, min = 1, max = 100, numeroAleatorio = roundRandom(min, max), cont = 0;
		while (numero != numeroAleatorio) {
			System.out.println("Informe um número: ");
			numero = teclado.nextInt();
			if (numero > numeroAleatorio) {
				System.out.println("O número informado é maior que o número gerado pelo computador.");
			} else {
				if (numero < numeroAleatorio) {
					System.out.println("O número informado é menor que o número gerado pelo computador.");
				}
			}
			cont++;
		}
		System.out.println(
				"Parabéns! Você acertou o número gerado pelo computador. Foram necessárias " + cont + " tentativas.");
	}

	public static int roundRandom(int min, int max) {
		int randomInt;
		randomInt = (int) Math.floor(Math.random() * (max - min + 1) + min);
		return randomInt;
	}
}
