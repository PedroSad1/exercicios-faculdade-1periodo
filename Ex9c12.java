package aed1;

import java.util.Scanner;

public class Ex9c12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soma = 0;
		int vet[] = new int[10];
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux < 10; aux++) {
			System.out.println("Informe um número inteiro: ");
			vet[aux] = teclado.nextInt();
			soma += vet[aux];
		}
		System.out.println("Números divisores da soma de todos os números lidos: ");
		for (int aux = 0; aux < 10; aux++) {
			if (soma % vet[aux] == 0) {
				System.out.println(vet[aux]);
			}
		}
		teclado.close();
	}

}
