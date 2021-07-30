package aed1;

import java.util.Scanner;

public class Ex2c11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome, nomeMenor = "";
		double valorAplicado, mediaBronze = 0, somaBronze = 0, contBronze = 0, somaTotal = 0, valorAplicadoMenor = 0,
				contPrata = 0, contOuro = 0;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux < 2; aux++) {
			System.out.println("Informe seu nome: ");
			nome = teclado.nextLine();
			teclado.nextLine();
			System.out.println("Informe o valor aplicado: ");
			valorAplicado = teclado.nextDouble();
			if (valorAplicado <= 1000) {
				System.out.println("Sua classificação é: Bronze");
				somaBronze += valorAplicado;
				contBronze++;
				mediaBronze = somaBronze / contBronze;
			}
			if (valorAplicado > 1000 && valorAplicado <= 5000) {
				System.out.println("Sua classificação é: Prata");
				contPrata++;
			}
			if (valorAplicado > 5000) {
				System.out.println("Sua classificação é: Ouro");
				contOuro++;
			}
			somaTotal += valorAplicado;
			if (aux == 0 || valorAplicado < valorAplicadoMenor) {
				valorAplicadoMenor = valorAplicado;
				nomeMenor = nome;
			}
		}
		System.out.println("Total de Bronze = " + contBronze);
		System.out.println("Total de Prata = " + contPrata);
		System.out.println("Total de Ouro = " + contOuro);
		System.out.println("Media de clientes Bronze = " + mediaBronze);
		System.out.printf("Volume total das aplicações = %.2f\n", somaTotal);
		System.out.println("Nome do aplicador de menor aplicação = " + nomeMenor);
		teclado.close();

	}

}
