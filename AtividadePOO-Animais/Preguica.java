package AtividadePOO;

public class Preguica extends Animais{

	public Preguica(String n, int idade) {
		super(n,idade);		
	}
	
	public void PreguicaAnda() {
		System.out.println("\nA "+getNome()+" esta subindo na árvore bem devagarzinho...");
	}
	
	public void EmitirSom() {
		System.out.println("\nA "+getNome()+" vai emitir seu som preguiçoso");	
		System.out.println("\nAAAAAAAAAAAAAAH\nAAAAAAAAAAAAAAAH\nAAAAAAAAAAAAH");
	}
	
	public void imprimirPreguica() {
		System.out.println("\nA preguiça "+getNome()+" tem "+getIdade()+" anos.");
	}
	
}
