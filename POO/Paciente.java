package POO;

/*
 Crie uma classe paciente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
*/

public class Paciente {

	private String nome;
	private int idade;
	private String convenio;
	private String exame;
	
	
	public Paciente(String nome, int idade, String convenio, String exame) {
		this.nome = nome;
		this.idade = idade;
		this.convenio = convenio;
		this.exame = exame;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getConvenio() {
		return convenio;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}

	public String getExame() {
		return exame;
	}

	public void setExame(String exame) {
		this.exame = exame;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void ImprimirInfo() {
		System.out.println("\nO exame de "+exame+" está marcado para o(a) paciente "+nome+" de "+idade+" anos.\nConvênio: "+convenio);
	}
	
}
