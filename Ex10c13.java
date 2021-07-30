package aed1;

import java.util.Scanner;

public class Ex10c13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String nome;
		System.out.println("Digite seu nome completo: ");
		nome = teclado.nextLine();
		for (int i = 0; i < nome.length(); i++) {
			String caracter = nome.substring(i, i + 1);
			System.out.println(caracter.toUpperCase());
		}
		teclado.close();
	}

}
