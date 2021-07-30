package aed1;

import java.util.Scanner;

public class Ex1c12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont = 0;
		int vet[] = new int[10];
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux < 10; aux++) {
			System.out.println("Informe um número inteiro: ");
			vet[aux] = teclado.nextInt();
		}
		for (int aux = 0; aux < 10; aux++) {
			if (vet[aux] % 5 == 0 && vet[aux] % 7 == 0) {
				cont++;
			}
		}
		System.out.println("Quantidade de divisores de 5 e 7 ao mesmo tempo: " + cont);
		teclado.close();
	}

}
