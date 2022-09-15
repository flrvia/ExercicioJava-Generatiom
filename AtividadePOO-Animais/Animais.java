package AtividadePOO;

public class Animais {

	private String nome;
	private int idade;
	
	public Animais(String n, int idade) {
		this.setNome(n);
		this.idade = idade;
	}

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
