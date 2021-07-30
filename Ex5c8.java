package aed1;

import java.util.Scanner;

public class Ex5c8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int voto,cont1=0,cont2=0,cont3=0;
		Scanner teclado = new Scanner(System.in);
		for (int aux=1;aux<=100;aux++) {
			System.out.println("Digite seu voto(1 para Fulano, 2 para Beltrano ou 3 para Ciclano: ");
			voto = teclado.nextInt();
			switch (voto) {
			case 1:
				cont1++;
				break;
			case 2:
				cont2++;
				break;
			case 3:
				cont3++;
				break;
			default:
				System.out.println("Vote apenas com 1,2 ou 3");
				break;
			}
			if (cont1 == cont2 || cont2 == cont3 || cont3==cont1) {
				System.out.println("Não pode haver empate");
			}
			
				
		}System.out.println("Votos para Fulano = "+cont1);
		System.out.println("Votos para Beltrano = "+cont2);
		System.out.println("Votos para Ciclano = "+cont3);
		teclado.close();
	}

}
