package aed1;

import java.util.Scanner;

public class Ex8c10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int populacao, populacaoTotal = 0, contCidades = 0, mediaH = 0, somaH = 0, contCidM = 0, eleitores, homens,
				mulheres, populacaoMenor = 0;
		double percentEleitores;
		String nome = "", nomeMenor = "";
		do {
			System.out.println("Informe o nome da cidade:");
			nome = teclado.nextLine();
			teclado.nextLine();
			System.out.println("Informe a população da cidade: ");
			populacao = teclado.nextInt();
			System.out.println("Informe o número de eleitores: ");
			eleitores = teclado.nextInt();
			System.out.println("Informe o número de homens: ");
			homens = teclado.nextInt();
			System.out.println("Informe o número de mulheres: ");
			mulheres = teclado.nextInt();
			contCidades++;
			populacaoTotal += populacao;
			percentEleitores = (eleitores / populacao) * 100;
			if (mulheres > homens) {
				contCidM++;
			}
			somaH += homens;
			mediaH = somaH / contCidades;
			if (populacaoMenor < populacao) {
				populacaoMenor = populacao;
				nomeMenor = nome;
			}
		} while (!nome.equalsIgnoreCase("Zimbabue de Minas"));
		System.out.println("Total de cidades = ​" + contCidades);
		System.out.println("População total = " + populacaoTotal);
		System.out.println("Percentual de eleitores = " + percentEleitores + "%");
		System.out.println("Cidades com mais mulheres que homens = " + contCidM);
		System.out.println("Média de homens = " + mediaH);
		System.out.println("Cidade com menor população = " + nomeMenor);
		teclado.close();
	}

}
