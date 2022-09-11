package familia58;

import java.util.Scanner;

//Crie um programa que leia um número do teclado até que encontre um
//número igual a zero. No final, mostre a soma dos números
//digitados.(DO...WHILE)

public class Exercicio5DoWhile {

	public static void main(String[] args) {
		
		int num, soma=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		
		do {
			if(num == 0) {
				System.out.println("\nSair do loop...");
			}else {
				if(num > 0) {
					soma += num;
					num++;
				}
				System.out.println("\nDigite outro número: ");
				num = sc.nextInt();
			}
			
		}while (num != 0);
		
		System.out.println("A soma dos números digitados é: "+soma);
	}

}
