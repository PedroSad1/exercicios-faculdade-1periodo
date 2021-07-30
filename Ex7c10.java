package aed1;

import java.util.Scanner;

public class Ex7c10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double populacao, anos = 0, meses = 0, dias = 0, contaminados = 1;
		System.out.println("Informe a população do local: ");
		populacao = teclado.nextInt();
		do {
			contaminados += contaminados*0.003;
			dias++;
			System.out.println(contaminados);
			if (dias == 30) {
				meses++;
				dias = 0;
			}
			if (meses == 12) {
				anos++;
				meses = 0;
			}
			if(populacao <= contaminados) {
				contaminados = 1000;
				break;
			}
			
		} while (populacao > contaminados);
		System.out.println("Anos: " + anos);
		System.out.println("Meses: " + meses);
		System.out.println("Dias: " + dias);
		teclado.close();
	}

}
