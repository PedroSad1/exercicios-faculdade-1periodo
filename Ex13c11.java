package aed1;

import java.util.Scanner;

public class Ex13c11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double qtTermos, cont = 0, serie = 0, numerador, denominador = 1, n1 = 1, potencia1 = 1;
		System.out.println("Informe quantos termos terá a série: ");
		qtTermos = teclado.nextInt();
		while (qtTermos > cont) {
			cont++;
			n1 += 9;
			potencia1 += 2;
			numerador = cont * Math.pow(n1, potencia1);
			serie += 71 + Math.cbrt(numerador / denominador);
			denominador *= 7;
		}
		System.out.println(serie);
		teclado.close();
	}

}
