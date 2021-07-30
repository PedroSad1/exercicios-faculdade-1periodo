package aed1;

import java.util.Scanner;

public class Ex7c13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String nome;
		System.out.println("Digite seu nome completo: ");
		nome = teclado.nextLine();
		String nomesplit[] = nome.split(" ");
		System.out.println("Nome de família: ");
		System.out.print(nomesplit[nomesplit.length - 1]);
		teclado.close();
	}

}
