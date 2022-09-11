package familia58;

//Informar todos os números de 1000 a 1999 que quando divididos por 11
//obtemos resto = 5.

public class Exercicio1For {

	public static void main(String[] args) {
		
		int x;
		
		for (x=1000;x<2000;x++) {
			if (x % 11 == 5) {
				System.out.println(x);
			}
		}
	}

}
