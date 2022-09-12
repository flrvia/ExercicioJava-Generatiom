package familia58;

import java.util.Scanner;

/*
 Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.
*/

public class Exercicio2Vetor {

	public static void main(String[] args) {
		
		float[] vetor = new float[6];
		int contPar=0, somaPar = 0, contImpar=0,x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<6;x++) {
			System.out.println("Digite um número: ");
			vetor[x] = leia.nextInt();
			
			if (vetor[x] % 2 == 0) {
				contPar++;
				somaPar += vetor[x];
			}else {
				contImpar++;
			}
			
			
		}
		System.out.println("Pares digitados: ");
		for (x=0;x<6;x++) {
			if(vetor[x] % 2 == 0) {
				System.out.println(vetor[x]);
			}
		}	
			System.out.println("Ímpares digitados: ");
			for(x=0;x<6;x++) {
			if (vetor[x] % 2 != 0) {
				System.out.println(vetor[x]);
			}
		
		}
			System.out.println("\nFoi digitado "+contPar+" números pares.");
			System.out.println("\nA soma dos números pares digitado é: "+somaPar);
			System.out.println("\nFoi digitado "+contImpar+" números ímpares.");
	
			

	}
}