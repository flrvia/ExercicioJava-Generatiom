package familia58;

import java.util.Scanner;

// Faça um programa que receba três inteiros e diga qual deles é o maior.

public class Exercicio1 {

	public static void main(String[] args) {
		
			int n1, n2, n3, maior;
			
			Scanner leia = new Scanner(System.in);
			
			System.out.println("\nDigite o primeiro número: ");
			n1 = leia.nextInt();
			System.out.println("\nDigite o segundo número: ");
			n2 = leia.nextInt();
			System.out.println("\nDigite o terceiro número: ");
			n3 = leia.nextInt();
			
			if(n1 >= n2) {
				maior = n1;
			}else {
				maior = n2;
			}
			
			if(maior <= n3) {
				maior = n3;
			}
			
			
			System.out.println("\nO maior número é: "+maior);
	}

}


