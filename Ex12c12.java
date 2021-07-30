package aed1;

import java.util.Scanner;

public class Ex12c12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int maiorNota = 0;
		int nota[] = new int[8];
		String nome[] = new String[8];
		String nomeMaior[] = new String[8];
		for (int aux = 0; aux < 8; aux++) {
			System.out.println("Informe o nome do aluno: ");
			nome[aux] = teclado.nextLine();
			System.out.println("Informe a nota do aluno: ");
			nota[aux] = teclado.nextInt();
			teclado.nextLine();
		}
		maiorNota = nota[0];
		nomeMaior[0] = nome[0];
		for (int aux = 1; aux < 8; aux++) {
			if (nota[aux] >= maiorNota) {
				maiorNota = nota[aux];
				nomeMaior[aux] = nome[aux];
				System.out.println("Aluno(s) com maior nota: ");
				System.out.println(nomeMaior[aux]);
			}
		}
		teclado.close();
	}
}
