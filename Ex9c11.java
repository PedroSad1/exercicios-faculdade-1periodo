package aed1;

import java.util.Scanner;

public class Ex9c11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String nome = "", nomeMaior = "", nomePrimeiroFuncionario = "", nomeUltimoFuncionario = "";
		int contSetor1 = 0, contSetor2 = 0, contSetor3 = 0, contSetor4 = 0, contAdm2010 = 0, nDezena, nSetor, nAdmissao,
				rf, contMaior = 0, nAdmissaoMaior = 0;
		while (nome != "FIM") {
			System.out.println("Digite seu nome(FIM para finalizar o programa): ");
			nome = teclado.next();
			if (nome.equalsIgnoreCase("FIM")) {
				break;
			}
			System.out.println("Informe seu Registro Funcioal: ");
			rf = teclado.nextInt();
			nDezena = rf / 10000;
			nSetor = rf / 1000 % 10;
			nAdmissao = rf % 1000;
			switch (nDezena) {
			case 10:
				if (nSetor == 2) {
					contAdm2010++;
				}
				break;
			case 11:
				break;
			case 12:
				break;
			case 13:
				break;
			case 14:
				break;
			default:
				System.out.println("REGISTRO INVÁLIDO");
				break;
			}
			switch (nSetor) {
			case 1:
				contSetor1++;
				break;
			case 2:
				contSetor2++;
				break;
			case 3:
				contSetor3++;
				break;
			case 4:
				contSetor4++;
				break;
			default:
				System.out.println("REGISTRO INVÁLIDO");
				break;
			}
			if (contMaior < contSetor1) {
				contMaior = contSetor1;
				nomeMaior = nome;
			}
			if (contMaior < contSetor2) {
				contMaior = contSetor2;
				nomeMaior = nome;
			}
			if (contMaior < contSetor3) {
				contMaior = contSetor3;
				nomeMaior = nome;
			}
			if (contMaior < contSetor4) {
				contMaior = contSetor4;
				nomeMaior = nome;
			}
			if (nDezena == 10 && nAdmissao == 1) {
				nomePrimeiroFuncionario = nome;
			}
			if (nAdmissao > nAdmissaoMaior && nDezena == 14) {
				nAdmissaoMaior = nAdmissao;
				nomeUltimoFuncionario = nome;
			}
		}
		System.out.println("Quantidade de funcionários no setor 1: " + contSetor1);
		System.out.println("Quantidade de funcionários no setor 2: " + contSetor2);
		System.out.println("Quantidade de funcionários no setor 3: " + contSetor3);
		System.out.println("Quantidade de funcionários no setor 4: " + contSetor4);
		System.out.println(
				"Quantidade de funcionários que foram admitidos em 2010 e trabalham na Administração: " + contAdm2010);
		System.out.println("Nome do setor que tem mais funcionários alocados: " + nomeMaior);
		System.out.println("Nome do primeiro funcionário admitido na empresa: " + nomePrimeiroFuncionario);
		System.out.println("Nome do último funcionário admitido na empresa: " + nomeUltimoFuncionario);
		teclado.close();

	}

}
