package aed1;

import java.util.Scanner;

public class Ex5c10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double contA = 0, contB = 0, contC = 0, contD = 0, altura, peso, alturaH = 0, media;
		String sexo, nome;
		do {
			System.out.println("Digite seu nome(FIM para terminar o programa): ");
			nome = teclado.next();
			if (nome.equalsIgnoreCase("FIM")) {
				break;
			}
			System.out.println("Digite sua altura: ");
			altura = teclado.nextDouble();
			System.out.println("Digite seu peso: ");
			peso = teclado.nextDouble();
			System.out.println("Informe seu sexo (M para masculino e F para feminino): ");
			sexo = teclado.next();
			contA++;
			if (sexo.equalsIgnoreCase("F")) {
				contB++;
			}
			if (sexo.equalsIgnoreCase("M")) {
				alturaH += altura;
				contC++;
			}
			if (sexo.equalsIgnoreCase("F") && peso < 60) {
				contD++;
			}

		} while (!nome.equalsIgnoreCase("FIM"));
		media = alturaH / contC;
		System.out.println("Quantidade de pessoas pesquisadas = " + contA);
		System.out.println("Quantidade de mulheres que fizeram a pesquisa = " + contB);
		System.out.println("Altura média dos homens = " + media);
		System.out.println("Quantidade de mulheres com peso menor que 60 = " + contD);
		teclado.close();
	}

}
