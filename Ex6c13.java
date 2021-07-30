package aed1;

import java.util.Scanner;

public class Ex6c13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int cont = 0;
		String nomeFamilia, nome;
		System.out.println("Digite o nome da família: ");
		nomeFamilia = teclado.nextLine();
		for (int i = 0; i < 100; i++) {
			System.out.println("Digite seu nome completo: ");
			nome = teclado.nextLine();
			String nomesplit[] = nome.split(" ");
			if (nomeFamilia.equalsIgnoreCase(nomesplit[nomesplit.length - 1])) {
				cont++;
			}
		}
		System.out.println(cont + " das 100 pessoas possuem o último nome " + nomeFamilia);
		teclado.close();
	}

}
