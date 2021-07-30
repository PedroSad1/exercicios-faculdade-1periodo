package aed1;

import java.util.Scanner;

public class Ex4c11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String nome, nomeMaior = "", sexo;
		int idade, idadeMaior = 0, valor, valorTotal = 0, pontos, cont = 0, contMulheres7pts = 0, contHomens = 0,
				idadeMedia = 0, percentualHomens = 0;
		for (int i = 0; i < 230; i++) {
			System.out.println("Digite do cidadão que foi multado: ");
			nome = teclado.next();
			System.out.println("Digite a idade: ");
			idade = teclado.nextInt();
			System.out.println("Informe o sexo do cidadão(ã) com M para masculino e F para feminino: ");
			sexo = teclado.next();
			System.out.println("Informe a quantidade de pontos perdidos na carteira: ");
			pontos = teclado.nextInt();
			System.out.println("Digite o valor da multa: ");
			valor = teclado.nextInt();
			cont++;
			idadeMedia = idade / cont;
			valorTotal += valor;
			switch (sexo) {
			case "M":
				contHomens++;
				break;
			case "F":
				break;
			case "m":
				contHomens++;
				break;
			case "f":
				break;
			default:
				System.out.println("Foi digitado o sexo com carácter diferente de M ou F, digite novamente: ");
				sexo = teclado.next();
				break;
			}
			percentualHomens = contHomens / cont;
			if (sexo.equalsIgnoreCase("f") && pontos == 7) {
				contMulheres7pts++;
			}
			if (i == 0 || idade > idadeMaior) {
				idadeMaior = idade;
				nomeMaior = nome;
			}

		}
		System.out.println("Idade média dos condutores: " + idadeMedia);
		System.out.println("Valor total das multas aplicadas: " + valorTotal);
		System.out.println("Percentual de homens multados: " + percentualHomens);
		System.out.println("Quantidade de mulheres que perderam 7 pontos na carteira: " + contMulheres7pts);
		System.out.println("Nome da pessoa mais velha" + nomeMaior);
		System.out.println("Idade da pessoa mais velha" + idadeMaior);
		teclado.close();
	}

}
