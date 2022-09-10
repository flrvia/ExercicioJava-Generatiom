package familia58;

import java.util.Scanner;

//Faça um programa em que permita a entrada de um número qualquer e exiba se este
//número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
//ímpar exiba o número elevado ao quadrado.


public class Exercicio4 {

	public static void main(String[] args) {
		
		double numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite um número: ");
		numero = leia.nextDouble();
		
		if (numero % 2 == 0) { // "%" é o resto da divisão, então se for igual a zero, quer dizer que o número é par.
			numero = Math.sqrt(numero); // o sqrt é a raiz quadrada de um número
		}else {
			numero = Math.pow(numero, 2); // o pow é a potência de um número, o segundo valor é em qual valor o numero será elevado.
		}
		
		System.out.printf("\nResultado: %.1f",numero); // o "%.1f" é para arredondar o número, assim ficará somente com uma casa decimal
	}
		
}
