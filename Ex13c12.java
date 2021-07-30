package aed1;

import java.util.Arrays;
import java.util.Scanner;

public class Ex13c12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String Meses[] = new String[12];
		 Scanner teclado = new Scanner(System.in);
		 for (int aux=0; aux<12; aux++) {
			 System.out.println("Digite os meses do ano em ordem cronológica:");
			 Meses[aux]=teclado.nextLine();
		 }
		 Arrays.sort(Meses);
		 for(String mes : Meses) {
			 System.out.println(mes);
		 }
		 teclado.close();
	}

}
