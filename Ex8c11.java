package aed1;

import java.util.Scanner;

public class Ex8c11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String nome = "", funcao, funcaoMaior = "", nomeMaior = "";
		int horaSalarial, qtHoras, valorReceber = 0, premio = 0, horasTotal = 0, cont = 0, mediaHoras = 0,
				valorReceberMaior = 0, contMenor = 0, contMedio = 0, contMaior = 0, valorTotal = 0;
		System.out.println("Informe o valor da hora salarial: ");
		horaSalarial = teclado.nextInt();
		while (nome != "FIM") {
			System.out.println("Digite seu nome (FIM para finalizar o programa)");
			nome = teclado.next();
			if (nome.equalsIgnoreCase("FIM")) {
				break;
			}
			System.out.println("Informe sua função na empresa: ");
			funcao = teclado.next();
			System.out.println("Informe a quantidade de horas trabalhadas: ");
			qtHoras = teclado.nextInt();
			horasTotal += qtHoras;
			cont++;
			mediaHoras = horasTotal / cont;
			if (qtHoras <= 100) {
				premio = 1000;
				contMenor++;
			} else {
				if (qtHoras > 100 && qtHoras <= 500) {
					premio = 10 * qtHoras;
					contMedio++;
				} else {
					if (qtHoras > 500) {
						qtHoras /= 10;
						contMaior++;
						premio = 100 * qtHoras;
					}
				}
				valorReceber = (qtHoras * horaSalarial) + premio;
				System.out.println("Valor a receber: " + valorReceber);
				if (valorReceber > valorReceberMaior) {
					valorReceberMaior = valorReceber;
					nomeMaior = nome;
					funcaoMaior = funcao;
				}
			}
			valorTotal += valorReceber;

		}
		System.out.println("Média de horas trabalhadas por pessoa no projeto: " + mediaHoras);
		System.out.println("Nome da pessoa que recebeu o maior salário: " + nomeMaior + "\nFunção: " + funcaoMaior);
		System.out.println("Pessoas que trabalharam 100 horas ou menos :" + contMenor);
		System.out.println("Pessoas que trabalharam entre 100 e 500 horas :" + contMedio);
		System.out.println("Pessoas que trabalharam mais de 500 horas :" + contMaior);
		System.out.println("Valor total da folha de pagamento" + valorTotal);
		teclado.close();
	}
}
