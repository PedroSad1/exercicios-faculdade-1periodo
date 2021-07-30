package aed1;

import java.util.Scanner;

public class Ex6c11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numeroCanal, contCanal4 = 0, contCanal7 = 0, contCanal12 = 0, contTotal = 0, percent4, percent7, percent12,
				contMaior = 0, media;
		for (int i = 0; i < 100; i++) {
			System.out.println(
					"Informe o canal(4,7 ou 12) que estava sendo assistido na TV durante a pesquisa (Digite qualquer valor diferente para quando a televisão estiver desligada ou em outro canal): ");
			numeroCanal = teclado.nextInt();
			switch (numeroCanal) {
			case 4:
				contCanal4++;
				contTotal++;
				break;
			case 7:
				contCanal7++;
				contTotal++;
				break;
			case 12:
				contCanal12++;
				contTotal++;
				break;
			default:
				break;
			}

		}
		percent4 = contCanal4 / contTotal;
		percent7 = contCanal7 / contTotal;
		percent12 = contCanal12 / contTotal;
		if (contCanal4 > contMaior)
			contMaior = contCanal4;
		else if (contCanal7 > contMaior)
			contMaior = contCanal7;
		else if (contCanal12 > contMaior)
			contMaior = contCanal12;

		System.out.println("Audiência total de cada canal pesquisado: " + contTotal);
		System.out.println("A porcentagem de audiência do canal 4: " + percent4);
		System.out.println("A porcentagem de audiência do canal 7: " + percent7);
		System.out.println("A porcentagem de audiência do canal 12: " + percent12);
		if (contMaior == contCanal4)
			System.out.println("O canal 4 é o mais assistido.");
		else if (contMaior == contCanal7)
			System.out.println("O canal 7 é o mais assistido. ");
		else if (contMaior == contCanal12)
			System.out.println("O canal 12 é o mais assistido.");
		media = (contCanal4 + contCanal7 + contCanal12) / contTotal;
		System.out.println("Média de pessoas que estavam assistindo TV: " + media);
		teclado.close();
	}

}
