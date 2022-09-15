package AtividadePOO;

public class AnimaisTeste {

	public static void main(String[] args) {
		
		Cavalo horse = new Cavalo("Pé de Pano",10);
		Cachorro dog = new Cachorro("Revoada", 15);
		Preguica p = new Preguica("Preguicinha",3);
		
		horse.imprimirCavalo();
		horse.CaveloCorrer();
		horse.EmitirSom();
		
		System.out.println("\n.........................................................................");
		
		dog.imprimirCachorro();
		dog.CachorroCorrer();
		dog.EmitirSom();
		
		System.out.println("\n.........................................................................");
		
		p.imprimirPreguica();
		p.PreguicaAnda();
		p.EmitirSom();
	}

}
