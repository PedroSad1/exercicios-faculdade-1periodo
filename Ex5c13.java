package aed1;

import java.util.Scanner;
import static java.lang.Math.sin;

public class Ex5c13 {
	public static Scanner teclado = new Scanner(System.in);
	public static int angulo;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Informe um ângulo: ");
		angulo = teclado.nextInt();
		System.out.println("Seno: " + calSen(angulo));
		System.out.println("Cosseno: " + calCos(angulo));
		System.out.println("Tangente: " + calTg(angulo));
		System.out.println("Secante: " + calSec(angulo));
		System.out.println("Cossecante: " + calCossec(angulo));
		System.out.println("Cotangente: " + calCotg(angulo));

	}

	public static float calSen(float n) {
		float precisao = (float) 0.0001, denominador, senx, valSen;

		// Convertendo graus para radianos
		n = n * (float) (3.142 / 180.0);

		float x1 = n;

		senx = n;

		// valor real do seno
		valSen = (float) sin(n);
		int i = 1;
		do {
			denominador = 2 * i * (2 * i + 1);
			x1 = -x1 * n * n / denominador;
			senx += x1;
			i = i + 1;
		} while (precisao <= valSen - senx);
		return senx;
	}

	public static float calCos(int angulo) {
		float cosQuadrado, cos;
		cosQuadrado = 1 - (float) Math.pow(calSen(angulo), 2);
		cos = (float) Math.sqrt(cosQuadrado);
		return cos;
	}

	public static float calTg(int angulo) {
		float tg;
		tg = calSen(angulo) / calCos(angulo);
		return tg;
	}

	public static float calSec(int angulo) {
		float sec;
		sec = 1 / calCos(angulo);
		return sec;

	}

	public static float calCossec(int angulo) {
		float cossec;
		cossec = 1 / calSen(angulo);
		return cossec;
	}

	public static float calCotg(int angulo) {
		float cotg;
		cotg = calCos(angulo) / calSen(angulo);
		return cotg;
	}
}
