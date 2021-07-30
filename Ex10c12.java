package aed1;

import java.util.Scanner;

public class Ex10c12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int soma = 0, cont = 0, media=0;
		int nota[] = new int[50];
		String nome[] = new String[50];
		for (int aux = 0; aux < 50; aux++) {
			System.out.println("Informe o nome do aluno: ");
			nome[aux] = teclado.nextLine();
			System.out.println("Informe a nota do aluno: ");
			nota[aux] = teclado.nextInt();
			teclado.nextLine();
			soma += nota[aux];
			cont++;
		}
		System.out.println("Alunos acima da média: ");
		for (int aux = 0; aux < 50; aux++) {
			media = soma / cont;
			if (nota[aux] > media) {
				System.out.println(nome[aux]);
			}
		}
		teclado.close();
	}
}