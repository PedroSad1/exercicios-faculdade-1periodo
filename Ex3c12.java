package aed1;

import java.util.Scanner;

public class Ex3c12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vet[] = new int[10];
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux < 10; aux++) {
			System.out.println("Informe um n?mero inteiro: ");
			vet[aux] = teclado.nextInt();
		}
		System.out.print("N?meros impressos: ");
		for (int aux = 0; aux < 10; aux++) {
			if (34 % vet[aux] == 0) {
				System.out.print(vet[aux]+" ");
			}
		}
		teclado.close();
	}

}
