package aed1;

import java.util.Scanner;

public class Ex16c12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numero[] = new int[10];
		double multiplicador;
		for (int aux = 0; aux < 10; aux++) {
			System.out.println("Informe um n�mero inteiro: ");
			numero[aux] = teclado.nextInt();
		}
		System.out.println("Informe um n�mero real para multiplicar os outros n�meros informados: ");
		multiplicador = teclado.nextDouble();
		for (int aux = 0; aux < 10; aux++) {
			System.out.println("Resultado: " + numero[aux] * multiplicador);
		}
		teclado.close();
	}

}
