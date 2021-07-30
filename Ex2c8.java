package aed1;

import java.util.Scanner;

public class Ex2c8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota, falta;
		Scanner teclado = new Scanner(System.in);

		for (int aux = 1; aux <= 50; aux++) {
			System.out.println("Digite o nùmero de faltas do aluno: ");
			falta = teclado.nextDouble();
			System.out.println("Digite a nota final do aluno: ");
			nota = teclado.nextDouble();
			if (nota >= 65 && falta <= 16) {
				System.out.println("ALUNO APROVADO");
			} else {
				if (nota < 0) {
					System.out.println("Digite uma nota maior que 0");
				} else {
					System.out.println("ALUNO REPROVADO");
				}

			}
			teclado.close();
		}

	}
}