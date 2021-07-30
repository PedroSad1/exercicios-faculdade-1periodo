package aed1;

import java.util.Scanner;

public class Ex4c8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double idade, cont = 0, cont1 = 0;
		Scanner teclado = new Scanner(System.in);

		for (int aux = 1; aux <= 50; aux++) {
			System.out.println("Informe seu nome: ");
			System.out.println("Informe sua idade: ");
			idade = teclado.nextDouble();
			if (idade > 18) {
				cont++;

			} else {
				cont1++;
			}
		}
		System.out.println("Alunos até 18 anos: " + cont1 + "\nAlunos com mais de 18 anos: " + cont);
		teclado.close();
	}

}
