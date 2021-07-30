package aed1;

import java.util.Scanner;

public class Ex6c12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String vet[] = new String[12];
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux < 12; aux++) {
			System.out.println("Informe um mês do ano: ");
			vet[aux] = teclado.nextLine();
		}
		System.out.println("Meses: ");
		for (int aux = 11; aux >= 0; aux--) {
			System.out.print(vet[aux] + " ");
		}
		teclado.close();
	}

}
