package aed1;

import java.util.Scanner;

public class Ex5c12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maiorValor = 0;
		int vet[] = new int[10];
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux < 10; aux++) {
			System.out.println("Informe um número inteiro: ");
			vet[aux] = teclado.nextInt();
		}
		for (int aux = 0; aux < 10; aux++) {
			if (aux == 0 || vet[aux] > maiorValor) {
				maiorValor = vet[aux];
			}
		}
		System.out.println("Maior valor = " + maiorValor);
		teclado.close();
	}

}
