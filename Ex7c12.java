package aed1;

import java.util.Scanner;

public class Ex7c12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int nota[] = new int[50];
		String nome[] = new String[50];
		for (int aux = 0; aux < 50; aux++) {
			System.out.println("Informe o nome do aluno: ");
			nome[aux] = teclado.nextLine();
			System.out.println("Informe a nota do aluno: ");
			nota[aux] = teclado.nextInt();
			teclado.nextLine();
		}
		for (int aux = 0; aux < 50; aux++) {
			System.out.printf("\nNome: %s\nConceito: ",nome[aux]);			
			if(nota[aux]<=30) {
				System.out.println("D");
			}
			if(nota[aux]>30 && nota[aux]<=60) {
				System.out.println("C");
			}
			if(nota[aux]>60 && nota[aux]<=80) {
				System.out.println("B");
			}
			if(nota[aux]>80) {
				System.out.println("A");
			}
		}
		teclado.close();
	}
}
