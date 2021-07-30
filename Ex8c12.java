package aed1;

import java.util.Scanner;

public class Ex8c12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int soma, auxi = 10;
		int vet[] = new int[20];
		for (int aux = 0; aux < 20; aux++) {
			System.out.println("Informe um número inteiro: ");
			vet[aux] = teclado.nextInt();
		}
		for (int aux = 0; aux < 10; aux++) {
			soma = vet[aux] + vet[auxi];
			auxi++;
			System.out.println("Soma: " + soma);
		}
		teclado.close();

	}

}
