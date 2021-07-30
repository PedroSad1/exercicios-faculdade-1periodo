package aed1;

import java.util.Scanner;

public class Ex7c8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double idade, media = 0, cont = 0, soma = 0, cont1 = 0, cont2 = 0, idadeMaior = 0;
		String nome, nomeMaior = "";
		for (int aux = 1; aux <= 50; aux++) {
			System.out.println("Digite o nome do aluno: ");
			nome = teclado.next();
			System.out.println("Digite a idade do aluno: ");
			idade = teclado.nextDouble();
			soma += idade;
			cont++;
			media = soma / cont;
			if (idade <= 12) {
				cont1++;
			}
			if (idade > 30) {
				cont2++;
			}
			if (aux == 1 || idade > idadeMaior) {
				idadeMaior = idade;
				nomeMaior = nome;
			}
		}
		System.out.println("Alunos até 12 anos = " + cont1);
		System.out.println("Alunos acima de 30 anos = " + cont2);
		System.out.println("Media das idades = " + media);
		System.out.println("Aluno de maior idade = " + nomeMaior);
		teclado.close();
	}

}
