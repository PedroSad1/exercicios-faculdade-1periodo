package aed1;

import java.util.Arrays;
import java.util.Scanner;

public class Ex19c12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String bilhetes[] = new String[100], bilhete;
		for (int aux = 0; aux < 10; aux++) {
			System.out.println("Informe o número dos bilhetes comprados: ");
			bilhetes[aux] = teclado.nextLine();
		}
		System.out.println("Digite o bilhete vencedor do prêmio: ");
		bilhete = teclado.nextLine();
		int pos = Arrays.binarySearch(bilhetes, bilhete);
		if (pos < 0) {
			System.out.println("Você não tem o bilhete premiado");
		} else {
			System.out.println("O bilhete premiado é o bilhete número " + pos + 1);
		}
		teclado.close();
	}

}
