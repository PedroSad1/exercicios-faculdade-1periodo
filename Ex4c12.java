package aed1;

import java.util.Scanner;

public class Ex4c12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vet[] = new int[10];
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux < 10; aux++) {
			System.out.println("Informe um número inteiro: ");
			vet[aux] = teclado.nextInt();
		}
		System.out.print("Números impressos: ");
		for (int aux = 0; aux < 10; aux++) {
			System.out.print(Math.pow(vet[aux], 2) + " ");
		}
		teclado.close();
	}

}
