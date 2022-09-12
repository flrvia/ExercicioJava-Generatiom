package familia58;

import java.util.Scanner;

//Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.


public class Exercicio3Matriz {

	public static void main(String[] args) {
		
		float [][] matriz = new float[3][3];
		int x, y, cont=0;
		
		Scanner leia = new Scanner(System.in);
		
		
		for(x=0;x<3;x++) {
			for(y=0;y<3;y++) {
				System.out.println("Digite um valor para a matriz: ");
				matriz[x][y] = leia.nextFloat();
			}
		}
		for(x=0;x<3;x++) {
			for(y=0;y<3;y++) {
				if(matriz[x][y]>10) {
					cont++;
				}
			}
		}
		
		System.out.println("\n Existem na matriz "+cont+" números maiores que 10");
	}

}
