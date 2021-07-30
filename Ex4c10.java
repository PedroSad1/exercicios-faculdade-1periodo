package aed1;

import java.util.Scanner;

public class Ex4c10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double bdi, custoParcial, custoTotal = 0, precoFinal, quantidade, precoUn, bdiTaxa;
		String nome;
		System.out.println("Informe o BDI: ");
		bdi = teclado.nextDouble();
		do {
			System.out.println("Digite o nome do material: ");
			nome = teclado.next();
			if (nome.equalsIgnoreCase("FIM")) {
				break;
			}
			System.out.println("Informe a quantidade de material utilizada: ");
			quantidade = teclado.nextDouble();
			System.out.println("Digite o preço unitário deste material: ");
			precoUn = teclado.nextDouble();
			custoParcial = quantidade * precoUn;
			System.out.println("Custo parcial do material: " + custoParcial);
			custoTotal += custoParcial;
			System.out.println("Custo total do material: " + custoTotal);
			bdiTaxa = custoTotal * (bdi / 100);
			System.out.println("BDI: " + bdiTaxa);
			precoFinal = custoTotal + bdiTaxa;
			System.out.println("Preço final: " + precoFinal);
		} while (!nome.equalsIgnoreCase("FIM"));
		teclado.close();
	}

}
