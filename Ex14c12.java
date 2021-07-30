package aed1;

import java.util.Scanner;

public class Ex14c12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int populacao[] = new int[100], temp;
		String nome[] = new String[100], estado[] = new String[100], tempNome, tempEstado;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux < 10; aux++) {
			System.out.println("Informe o nome da cidade: ");
			nome[aux] = teclado.nextLine();
			System.out.println("Informe o estado ao qual a cidade pertence: ");
			estado[aux] = teclado.nextLine();
			System.out.println("Informe a população da cidade: ");
			populacao[aux] = teclado.nextInt();
		}
		for (int aux = 0; aux < 99; aux++) {
			for (int x = 0; x < 99; x++) {
				if (populacao[x] < populacao[x + 1]) {
					temp = populacao[x];
					populacao[x] = populacao[x + 1];
					populacao[x + 1] = temp;
					tempNome = nome[x];
					nome[x] = nome[x + 1];
					nome[x + 1] = tempNome;
					tempEstado = estado[x];
					estado[x] = estado[x + 1];
					estado[x + 1] = tempEstado;
				}
			}
		}
		for (int aux = 0; aux < 10; aux++) {
			System.out.println(nome[aux]);
			System.out.println(estado[aux] + "\n");
		}
		teclado.close();
	}

}
