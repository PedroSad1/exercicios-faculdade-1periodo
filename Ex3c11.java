package aed1;

import java.util.Scanner;

public class Ex3c11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int dia = 0, pontos, valor, valorTotal = 0, cont = 0;
		String placa;
		while (dia != 99) {
			System.out.println("Informe o dia em que a multa foi aplicada: ");
			dia = teclado.nextInt();
			if (dia == 99) {
				break;
			}
			System.out.println("Informe a placa do carro multado: ");
			placa = teclado.next();
			System.out.println("Informe o número de pontos (3,5 ou 8): ");
			pontos = teclado.nextInt();
			System.out.println("Informe o valor da multa: ");
			valor = teclado.nextInt();
			switch (pontos) {
			case 3:
				valor = 42;
				break;
			case 5:
				valor = 108;
				break;
			case 8:
				valor = 479;
				break;
			default:
				System.out.println("Foi digitada uma pontuação diferente dos valores padrão, digite novamente:");
				pontos = teclado.nextInt();
				break;
			}
			if (dia <= 15) {
				cont++;
			}
			valorTotal += valor;
			System.out.println("Placa multada: " + placa);
			System.out.println("Valor da multa: " + valor);
		}
		System.out.println("Quantidade de multas de pontuação 8 da primeira quinzena do mês: " + cont);
		System.out.println("Valor total arrecadado com as multas: " + valorTotal);
		teclado.close();
	}

}
