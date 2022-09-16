package AtividadePOO;

public class Preguica extends Animais{

	public Preguica(String n, int idade) {
		super(n,idade);		
	}
	
	public void PreguicaAnda() {
		System.out.println("\nA "+getNome()+" esta subindo na árvore bem devagarzinho...");
	}
	
	@Override
	public void EmitirSom(String som) {
		System.out.println("\nA "+getNome()+" vai emitir seu som preguiçoso");	
		System.out.println("\nAAAAAAAAAAAAAAH\nAAAAAAAAAAAAAAAH\nAAAAAAAAAAAAH");
	}
	
	@Override
	public void imprimirInfo(String nome, int idade) {
		System.out.println("\nA preguiça "+getNome()+" tem "+getIdade()+" anos.");
	}
	
}
