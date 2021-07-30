package aed1;

import java.util.Scanner;

public class Ex9c8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade, mediaH = 0, somaH = 0, somaM = 0, contH = 0, contM = 0, qt, mediaM = 0;
		String sexo;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a quantidade de pessoas a serem incluídas no programa");
		qt = teclado.nextInt();
		for (int aux = 1; aux <= qt; aux++) {
			System.out.println("Digite seu nome: ");
			System.out.println("Digite seu sexo (M para masculino e F para feminino): ");
			sexo = teclado.next();
			System.out.println("Digite sua idade: ");
			idade = teclado.nextInt();
			switch (sexo) {
			case "M":
				contH++;
				somaH += idade;
				mediaH = somaH / contH;
				break;
			case "F":
				contM++;
				somaM += idade;
				mediaM = somaM / contM;
			}

		}
		System.out.println("Média das idades dos homens = " + mediaH);
		System.out.println("Média das idades das mulheres = " + mediaM);
		teclado.close();
	}

}
