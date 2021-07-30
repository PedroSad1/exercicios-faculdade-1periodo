package aed1;

import java.util.Scanner;

public class Ex2c14 {
	public static Scanner teclado = new Scanner(System.in);
	static double lado, altura, base, raio;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int codigo;
		System.out.println(
				"Digite o c�digo de uma figura geom�trica(1-quadrado, 2-ret�ngulo, 3-tri�ngulo ret�ngulo, 4-c�rculo): ");
		codigo = teclado.nextInt();
		switch (codigo) {
		case 1:
			System.out.println("Informe o valor do lado: ");
			lado = teclado.nextDouble();
			System.out.println("�rea = " + AreaQuadrado(lado));
			break;
		case 2:
			System.out.println("Informe o valor do lado: ");
			lado = teclado.nextDouble();
			System.out.println("Informe o valor da altura: ");
			altura = teclado.nextDouble();
			System.out.println("�rea = " + AreaRetangulo(lado, altura));
			break;
		case 3:
			System.out.println("Informe o valor da base: ");
			base = teclado.nextDouble();
			System.out.println("Informe o valor da altura: ");
			altura = teclado.nextDouble();
			System.out.println("�rea = " + AreaTrianguloRetangulo(base, altura));
			break;
		case 4:
			System.out.println("Informe o valor do raio: ");
			raio = teclado.nextDouble();
			System.out.println("�rea = " + AreaCirculo(raio));
			break;

		}
	}

	public static double AreaQuadrado(double lado) {
		double area;
		area = Math.pow(lado, 2);
		return area;
	}

	public static double AreaRetangulo(double lado, double altura) {
		double area;
		area = lado * altura;
		return area;
	}

	public static double AreaTrianguloRetangulo(double base, double altura) {
		double area;
		area = (base * altura) / 2;
		return area;
	}

	public static double AreaCirculo(double raio) {
		double area, pi = 3.141592653589793;
		area = pi * Math.pow(raio, 2);
		return area;
	}

}
