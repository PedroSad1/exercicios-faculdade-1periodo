package aed1;

import java.util.Scanner;

public class Ex2c10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double valor, soma = 0, media, cont = 0, cont1 = 0;
		do {
			System.out.println("Digite o valor recebido: ");
			valor = teclado.nextDouble();
			if (valor == 0) {
				break;
			}
			cont++;
			soma += valor;
			if (valor > 1000) {
				cont1++;
			}
		} while (valor != 0);
		media = soma / cont;
		System.out.printf("Média dos valores recebidos = %1.2f\n", media);
		System.out.printf("Valor total recebido = %1.2f\n", soma);
		System.out.printf("Quantidade de valores acima de R$1000.00 = %1.2f\n", cont1);
		teclado.close();
	}

}
