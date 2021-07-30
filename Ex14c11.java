package aed1;

public class Ex14c11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numerador=1,denominador=1,cont=0,serie=0;
		while(serie < 3.14169998427532) {
			
			denominador += 2;
			serie -= 4*(numerador/denominador);
			if(serie >3.1416 && serie<3.1417) {
				break;
			}
			cont++;
			
		}
		System.out.println(cont);
	}

}
