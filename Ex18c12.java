package aed1;

import java.util.Scanner;
import java.util.Arrays;

public class Ex18c12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String nomes[] = new String[10], nome;
		for (int aux = 0; aux < 10; aux++) {
			System.out.println("Informe o nome das pessoas na fila: ");
			nomes[aux] = teclado.nextLine();
		}
		System.out.println("Digite um nome a procurar na fila: ");
		nome = teclado.nextLine();
		int pos = Arrays.binarySearch(nomes, nome);
		if (pos < 0) {
			System.out.println("Esta pessoa não está na fila");
		} else {
			System.out.println("Nome encontrado na posição: " + pos + 1);
		}
		teclado.close();
	}

}
