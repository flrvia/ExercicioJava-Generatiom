package AtividadePOO;

import java.util.Scanner;

public class AnimaisTeste {

	public static void main(String[] args) {
		
		int op=0;
		
		Scanner sc = new Scanner(System.in);

		Cavalo horse = new Cavalo("Pé de Pano",10);
		Cachorro dog = new Cachorro("Revoada", 15);
		Preguica p = new Preguica("Preguicinha",3);
		

		
	System.out.println("\nQual animal você deseja?");
	System.out.println("\n1. Cavalo");
	System.out.println("\n2. Cachorro");
	System.out.println("\n3. Preguiça");
	op = sc.nextInt();
	
		switch(op) {
		case 1: 
		horse.imprimirInfo(null, op);
		horse.CaveloCorrer();
		horse.EmitirSom(null);
		break;
		case 2: 
		dog.imprimirInfo(null, op);
		dog.CachorroCorrer();
		dog.EmitirSom(null);
		break;
		case 3: 
		p.imprimirInfo(null, op);
		p.PreguicaAnda();
		p.EmitirSom(null);
		break;
		default:System.out.println("Opção Inválida.");
		}
		
		
	}

}
