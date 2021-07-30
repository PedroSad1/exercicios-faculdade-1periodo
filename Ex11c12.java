package aed1;

import java.util.Scanner;

public class Ex11c12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String nomeMaior = "";
		int maiorNota = 0;
		int nota[] = new int[8];
		String nome[] = new String[8];
		for (int aux = 0; aux < 8; aux++) {
			System.out.println("Informe o nome do aluno: ");
			nome[aux] = teclado.nextLine();
			System.out.println("Informe a nota do aluno: ");
			nota[aux] = teclado.nextInt();
			teclado.nextLine();
		}
		for (int aux = 0; aux < 8; aux++) {
			if (aux == 0 || nota[aux] > maiorNota) {
				maiorNota = nota[aux];
				nomeMaior = nome[aux];
			}
		}
		System.out.println("Aluno com maior nota: " + nomeMaior);
		teclado.close();
	}

}
