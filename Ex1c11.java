package aed1;

import java.util.Scanner;

public class Ex1c11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 0, qtLoop = 0, funcao, cont = 0, media=0, soma = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a quantidade de loops");
		qtLoop = teclado.nextDouble();
		while (x < qtLoop) {
			x++;
			if (x % 2 != 0) {
				funcao = Math.pow(x, 2) + (4 * x - 2) / 5;
				System.out.println("f(x) = "+funcao);
				cont++;
				soma += funcao;
				media = soma / cont;
			}
		}
		System.out.println("Média = "+media);
		teclado.close();
	}

}
