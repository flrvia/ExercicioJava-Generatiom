package familia58;

import java.util.Scanner;

// Faça um programa que entre com três números e coloque em ordem crescente.

public class Exercicio2 {

	public static void main(String[] args) {
		
		int n1, n2, n3; //declarando variáveis
	
		Scanner leia = new Scanner(System.in); //ler a variável que for inserida pelo usuário
		
		System.out.println("\nDigite o primeiro número: ");
		n1 = leia.nextInt();
		System.out.println("\nDigite o segundo número: ");
		n2 = leia.nextInt();
		System.out.println("\nDigite o terceiro número: ");
		n3 = leia.nextInt();
		
		
		//Os if's são feitos para que verfique cada probabilidade.
		
		if (n1<=n2 && n2<=n3) { 
			System.out.println("\nA ordem crescente dos número inseridos é: "+n1+", "+n2+", "+n3);
		}else if (n1<=n3 && n3<=n2) {
			System.out.println("\nA ordem crescente dos número inseridos é: "+n1+", "+n3+", "+n2);
		}else if (n2<=n1 && n1<=n3) {
			System.out.println("\nA ordem crescente dos número inseridos é: "+n2+", "+n1+", "+n3);
		}else if (n2<=n3 && n3<=n1) {
			System.out.println("\nA ordem crescente dos número inseridos é: "+n2+", "+n3+", "+n1);
		}else if (n3<=n1 && n1<=n2) {
			System.out.println("\nA ordem crescente dos número inseridos é: "+n3+", "+n1+", "+n2);
		}else {
			System.out.println("\nA ordem crescente dos número inseridos é: "+n3+", "+n2+", "+n1);
		}
	}

}
