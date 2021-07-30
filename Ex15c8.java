package aed1;

public class Ex15c8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double media = 0, cont = 0, soma = 0;
		for (int aux = 1000; aux <= 2000; aux++) {
			if (aux % 2 != 0) {
				soma += aux;
				cont++;
			}
		}
		media = soma / cont;
		System.out.println(media);
	}

}
