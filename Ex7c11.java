package aed1;

import java.util.Scanner;

public class Ex7c11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int temperatura, temperaturaMenor = 0, temperaturaMaior = 0, mediaTemperatura = 0, temperaturaSoma = 0,
				contTemperaturaMaior = 0;
		for (int i = 0; i < 121; i++) {
			System.out.println("Informe a temperatura do dia de hoje: ");
			temperatura = teclado.nextInt();
			if (i == 0 || temperatura >= temperaturaMaior) {
				temperaturaMaior = temperatura;
				contTemperaturaMaior++;
			}
			if (i == 0 || temperatura < temperaturaMenor) {
				temperaturaMenor = temperatura;
			}
			temperaturaSoma += temperatura;
			mediaTemperatura = temperaturaSoma / 121;
		}
		System.out.println("Menor temperatura registrada: " + temperaturaMenor);
		System.out.println("Maior temperatura registrada: " + temperaturaMaior);
		System.out.println("Média das temperaturas registradas: " + mediaTemperatura);
		System.out.println("Quantidade de dias que ocorreu a maior temperatura: ​" + contTemperaturaMaior);
		teclado.close();

	}

}
