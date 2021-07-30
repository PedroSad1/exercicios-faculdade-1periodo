package aed1;

import java.util.Scanner;

public class Ex17c12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numero[] = new int[10], numeroInv[] = new int[10], cont = 9;
		for (int aux = 0; aux < 10; aux++) {
			System.out.println("Informe um valor inteiro: ");
			numero[aux] = teclado.nextInt();
			numeroInv[cont] = numero[aux];
			cont--;
		}
		for (int aux = 0; aux < 10; aux++) {
			System.out.println(numeroInv[aux]);
		}
		teclado.close();
	}

}
