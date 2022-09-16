package AtividadePOO;

public class Cavalo extends Animais{
	
	
	public Cavalo(String n, int idade) {
		super(n,idade);		
	}
	
	public void CaveloCorrer() {
		System.out.println("\nO "+getNome()+" vai correr agora!");
		System.out.println("\nPocotó, pocotó, pocotó...");
	}

	@Override
	public void EmitirSom(String som) {
		System.out.println("\nO "+getNome()+" vai relinchar");	
		System.out.println("\niiirrrrí\niiirrrrí\niiirrrrí");
	}
	
	@Override
	public void imprimirInfo(String nome, int idade) {
		System.out.println("\nO cavalo "+getNome()+" tem "+getIdade()+" anos.");
	}
}
