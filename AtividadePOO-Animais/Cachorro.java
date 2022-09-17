package AtividadePOO;

public class Cachorro extends Animais {

	
	public Cachorro(String n, int idade) {
		super(n,idade);
	}
	
	public void CachorroCorrer() {
		System.out.println("\nO "+getNome()+" vai correr agora!");
		System.out.println("\nau au au...");
	}
	
	@Override
	public void EmitirSom(String som) {
		System.out.println("\nO "+getNome()+" vai latir");	
		System.out.println("\nau au au\nau au au\nau au au");
	}
	
	@Override
	public void imprimirInfo(String nome, int idade) {
		System.out.println("\nO cachorro "+getNome()+" tem "+getIdade()+" anos.");
	}
}
