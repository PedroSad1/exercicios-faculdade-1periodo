package aed1;

import java.util.Scanner;

public class Ex10c11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int repet;
		System.out.println("Digite o n�mero de repeti��es: ");
		repet = teclado.nextInt();
		for (int i = 0; i <= repet; i++) {
			System.out.println();
			for (int aux = 0; aux < i; aux++) {
				System.out.print(" EMGE");
			}
		}
		teclado.close();
	}

}
