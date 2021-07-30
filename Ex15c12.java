package aed1;

import java.util.Scanner;

public class Ex15c12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numero[] = new int[10], cont = 0, soma = 0;
		double media = 0;
		for (int aux = 0; aux < 10; aux++) {
			System.out.println("Digite um número inteiro: ");
			numero[aux] = teclado.nextInt();
			if (numero[aux] % 2 == 0) {
				numero[cont] = numero[aux];
				cont++;
				soma += numero[aux];
				media = soma / cont;
			}
		}
		System.out.println("Números pares: ");
		for (int aux = 0; aux < cont; aux++) {
			System.out.print(numero[aux]+ " ");
		}
		System.out.println("\nMédia dos números pares: " + media);
		teclado.close();

	}

}
