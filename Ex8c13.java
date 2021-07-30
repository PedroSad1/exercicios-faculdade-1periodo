package aed1;

import java.util.Scanner;

public class Ex8c13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String nome;
		System.out.println("Digite o nome completo do autor: ");
		nome = teclado.nextLine();
		String nomesplit[] = nome.split(" ");
		String ultimoNome = nomesplit[nomesplit.length - 1];
		System.out.print(ultimoNome.toUpperCase() + ",");
		for (int i = 0; i < nomesplit.length; i++) {
			String primeiraLetra = nomesplit[i].substring(0, 1);
			System.out.print(" " + primeiraLetra.toUpperCase() + ".");
		}
		teclado.close();
	}

}
