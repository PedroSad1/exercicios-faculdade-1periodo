package aed1;

import java.util.Scanner;

public class E01686A {

	public static void main(String[] args) {
		// Pedro Gabriel Sad Rabelo
		Scanner teclado = new Scanner(System.in);
		String nome = "", nomeMenor = "", sexo;
		int idade, contTotal = 0, contHomens = 0, qtPessoasSalarioMinimo = 0, zero = 0;
		double salario, peso, somaSalarioH = 0, mediaSalarioH = 0, pesoMenor = 0;
		while (nome != "FIM") {
			System.out.println("Informe seu nome: ");
			nome = teclado.nextLine();
			if (nome.equalsIgnoreCase("FIM")) {
				break;
			}
			System.out.println("Digite sua idade: ");
			idade = Integer.parseInt(teclado.nextLine());
			System.out.println("Informe seu sexo (M para masculino e F para feminino): ");
			sexo = teclado.next();
			System.out.println("Informe seu salário: ");
			salario = teclado.nextDouble();
			System.out.println("Informe seu peso (em KG): ");
			peso = teclado.nextDouble();
			teclado.nextLine();
			contTotal++;
			switch (sexo) {
			case "M":
				contHomens++;
				somaSalarioH += salario;
				break;
			case "m":
				contHomens++;
				somaSalarioH += salario;
				break;
			case "F":
				if (peso < pesoMenor || zero == 0) {
					zero++;
					pesoMenor = peso;
					nomeMenor = nome;
				}
				break;
			case "f":
				if (peso < pesoMenor || zero == 0) {
					zero++;
					pesoMenor = peso;
					nomeMenor = nome;
				}
				break;
			default:
				System.out.println(
						"Foi informado um caractér para SEXO diferente dos caractéres padrão, por favor informe seu sexo com M para masculino e F para feminino.");
				contTotal--;
				break;
			}
			mediaSalarioH = somaSalarioH / contHomens;
			if (idade >= 25 && idade <= 40 && salario < 940) {
				qtPessoasSalarioMinimo++;
			}

		}
		System.out.println("Quantidade de pessoas pesquisadas: " + contTotal);
		System.out.println("Salário médio dos homens: " + mediaSalarioH);
		System.out.println("Quantidade de pessoas com idade entre 25 e 40 anos cujo salário é inferior a R$940,00: "
				+ qtPessoasSalarioMinimo);
		System.out.println("Nome da mulher mais magra: " + nomeMenor);
		teclado.close();
	}
}
