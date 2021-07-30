package aed1;

import java.util.Scanner;

public class E01686C {

	public static void main(String[] args) {
		// Pedro Gabriel Sad Rabelo
		Scanner teclado = new Scanner(System.in);
		String nome;
		System.out.println("Informe seu nome completo: ");
		nome = teclado.nextLine();
		String nomesplit[] = nome.split(" ");
		System.out.println(conversaoNome(nome) + ", " + nomesplit[0]);
		teclado.close();
	}

	public static String conversaoNome(String nome) {
		String nomesplit[] = nome.split(" ");
		String ultimoNome = nomesplit[nomesplit.length - 1];
		String ultimoNomeCaps = ultimoNome.toUpperCase();
		return ultimoNomeCaps;
	}

}
