package aed1;

import java.util.Scanner;

public class Ex6c8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, cont = 0, soma = 0;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 1; aux <= 10; aux++) {
			System.out.println("Digite um número: ");
			numero = teclado.nextInt();
			if (numero % 2 == 0) {
				System.out.println("O NUMERO É PAR");
			}
			if (numero % 4 == 0) {
				soma += numero;
			}
			if (numero % 3 == 0) {
				cont++;
				System.out.println("O NUMERO É IMPAR");
			}
		}
		System.out.println("Soma dos números divisíveis por 4 = " + soma);
		System.out.println("Quantidade de números divisíveis por 3 = " + cont);
		teclado.close();
	}

}
