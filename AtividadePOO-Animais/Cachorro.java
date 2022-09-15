package AtividadePOO;

public class Cachorro extends Animais {

	public Cachorro(String n, int idade) {
		super(n,idade);		
		
	}
	
	public void CachorroCorrer() {
		System.out.println("\nO "+getNome()+" vai correr agora!");
		System.out.println("\nau au au...");
	}
	
	public void EmitirSom() {
		System.out.println("\nO "+getNome()+" vai latir");	
		System.out.println("\nau au au\nau au au\nau au au");
	}
	
	public void imprimirCachorro() {
		System.out.println("\nO cachorro "+getNome()+" tem "+getIdade()+" anos.");
	}
}
