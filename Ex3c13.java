package aed1;

import java.util.Scanner;

public class Ex3c13 {
	public static Scanner teclado = new Scanner(System.in);
	public static String numero;
	public static int posicao;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Informe o número a ser decomposto: ");
		numero = teclado.nextLine();
		System.out.println("Informe a posição do numeral a ser retirado: ");
		posicao = teclado.nextInt();
		numero = reversaoStr(numero);
		System.out.println("Retorno = " + metodoDecomposicao(numero));

	}

	static String metodoDecomposicao(String numeral) {
		numeral = numero.substring(posicao - 1, posicao);
		return numeral;
	}

	public static String reversaoStr(String str) {
		return new StringBuilder(str).reverse().toString();
	}

}
