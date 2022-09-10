package familia58;

import java.util.Scanner;

//Ler 10 números e imprimir quantos são pares e quantos são ímpares.

public class Exercicio2For {

	public static void main(String[] args) {
		
		int par=0, impar=0, num, x;
		
		Scanner sc = new Scanner(System.in);

		
		for(x=1;x<=10;x++) {
			System.out.println("Insira um número: ");
			num = sc.nextInt();
			if (num % 2 == 0) {
				par++;
			}else {
				impar++;
			}
			
		} 
		System.out.println("\nNós temos: "+par+" números pares");
		System.out.println("\nNós temos: "+impar+" números impares");
		
	}

}
