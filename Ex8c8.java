package aed1;

import java.util.Scanner;

public class Ex8c8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota, falta, cont = 0, cont1 = 0, media = 0, soma = 0;
		Scanner teclado = new Scanner(System.in);

		for (int aux = 1; aux <= 50; aux++) {
			System.out.println("Digite o nùmero de faltas do aluno: ");
			falta = teclado.nextDouble();
			System.out.println("Digite a nota final do aluno: ");
			nota = teclado.nextDouble();
			if (nota >= 65 && falta <= 16) {
				System.out.println("ALUNO APROVADO");
				cont++;
				soma += nota;
				media = soma / cont;
			} else {
				if (nota < 0) {
					System.out.println("Digite uma nota maior que 0");
				} else {
					if (falta > 16) {
						cont1++;
					}
					System.out.println("ALUNO REPROVADO");

				}

			}
		}
		System.out.println("Média das notas dos aprovados = " + media);
		System.out.println("Quantidade de alunos com mais de 16 faltas = " + cont1);
		teclado.close();
	}

}
