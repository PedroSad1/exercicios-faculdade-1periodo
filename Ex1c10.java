package aed1;

import java.util.Scanner;

public class Ex1c10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double valor, multa, soma = 0, media, cont = 0;
		do {
			System.out.println("Digite o valor financeiro: ");
			valor = teclado.nextDouble();
			if (valor == -1) {
				break;
			}
			multa = valor / 10;
			System.out.println("Multa = "+multa);
			cont++;
			soma += multa;
		} while (valor != -1);
		media = soma / cont;
		System.out.println("Média = "+media);
		teclado.close();
	}

}
