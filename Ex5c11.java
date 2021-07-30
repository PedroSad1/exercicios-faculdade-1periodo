package aed1;

import java.util.Scanner;

public class Ex5c11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String nome = "";
		int codigo, valor = 0, valorTotal = 0, contIngles = 0, mensalMedia = 0, cont = 0;
		while (nome != "FIM") {
			System.out.println("Informe o nome do aluno: ");
			nome = teclado.next();
			if (nome.equalsIgnoreCase("fim")) {
				break;
			}
			System.out.println(
					"Informe o código do curso contratado (1 para Inglês, 2 para Francês e 3 para Espanhol): ");
			codigo = teclado.nextInt();
			System.out.println("Nome do aluno: " + nome);
			switch (codigo) {
			case 1:
				valor = 100;
				break;
			case 2:
				valor = 150;
				break;
			case 3:
				valor = 120;
				break;
			default:
				System.out.println("Foi digitado um código diferente dos valores padrão, digite novamente:");
				codigo = teclado.nextInt();
				break;
			}
			System.out.println("Valor da mensalidade: " + valor);
			if (codigo == 1) {
				contIngles++;
			}
			cont++;
			valorTotal += valor;
			mensalMedia = valorTotal / cont;
		}
		System.out.println("Quantidade de alunos matriculados nas turmas de Inglês: " + contIngles);
		System.out.println("Mensalidade média da escola: " + mensalMedia);
		teclado.close();
	}

}
