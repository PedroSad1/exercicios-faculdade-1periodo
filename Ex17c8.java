package aed1;

import java.util.Scanner;

public class Ex17c8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numero, resultado;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número de 1 a 9: ");
		numero = teclado.nextDouble();
		for (int aux = 1; aux <= 9; aux++) {
			resultado = aux * numero;
			System.out.println(numero + " * " + aux + " = " + resultado);
		}
		teclado.close();
	}

}
