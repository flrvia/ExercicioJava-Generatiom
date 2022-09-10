package familia58;

import java.util.Scanner;

// Escrever um programa que receba vários números inteiros no teclado. E no
//final imprimir a média dos números múltiplos de 3. Para sair digitar
//0(zero).

public class Exercicio6DoWhile {

	public static void main(String[] args) {
		
		int numeros,contMult3=0,somaMult3=0;
		float media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um número: ");
		numeros = leia.nextInt();//0
		
		do {
			
			if(numeros == 0) {
				System.out.println("\nSair do loop!!!");
			}else {
				
				if(numeros % 3 == 0) {
					somaMult3 += numeros;
					contMult3++;
				}
				System.out.println("\nEntre com um número: ");
				numeros = leia.nextInt();
			}
			
		}while(numeros != 0);
		
		if(contMult3 == 0) {
			System.out.println("\nNão podemos dividir por ZERO!!!");
		}else {
			
			media = somaMult3 / contMult3;
			System.out.printf("\nMédia dos números múltiplos de 3: %.1f",media);
		}
		

	}

}
