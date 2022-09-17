package AtividadePOO;

/*Implemente um programa que crie os 3 tipos de animais definidos no exercício anterior
	 e invoque o método que emite o som de cada um de forma 
	  polimórfica, isto é, independente do tipo de animal.*/
	
public abstract class Animais {

	private String nome;
	private int idade;
	
	
	public Animais(String n, int idade) {
		this.setNome(n);
		this.idade = idade;
	}

	abstract public void EmitirSom(String som);
	abstract public void imprimirInfo(String nome, int idade);
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
