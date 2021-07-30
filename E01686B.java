package aed1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class E01686B {

	public static void main(String[] args) {
		// Pedro Gabriel Sad Rabelo
		Scanner teclado = new Scanner(System.in);
		ArrayList<String> livros = new ArrayList<String>();
		String nome[] = new String[100];
		int codigo[] = new int[100];
		for (int i = 0; i < nome.length; i++) {
			System.out.println("Informe o nome do livro: ");
			nome[i] = teclado.nextLine();
			System.out.println("Informe o código do livro: ");
			codigo[i] = teclado.nextInt();
			teclado.nextLine();
			if (codigo[i] >= 1001 && codigo[i] <= 1100) {
				livros.add(nome[i]);
			}
		}
		Collections.sort(livros);
		System.out.println(livros);
		teclado.close();
	}

}
