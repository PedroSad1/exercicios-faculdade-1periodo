package aed1;

import java.util.Scanner;

public class Ex11c13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String nome;
		System.out.println("Digite seu nome completo: ");
		nome = teclado.nextLine();
		String nomesplit[] = nome.split(" ");
		String penultimoNome = nomesplit[nomesplit.length - 2];
		System.out.println("Nome de família: ");
		System.out.print(penultimoNome.toUpperCase());
		teclado.close();
	}

}
