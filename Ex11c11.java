package aed1;

import java.util.Scanner;

public class Ex11c11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numero;
		System.out.println("Digite o número de repetições: ");
		numero = teclado.nextInt();
		for (int i = 0; i <= numero; i++) {
			System.out.println();
			for (int aux = 0; aux < i; aux++) {
				System.out.print(i);
			}
		}
		teclado.close();
	}

}
