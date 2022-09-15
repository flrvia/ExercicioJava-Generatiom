package POO;

public class Pessoa {

	private String nome;
	private String endereco;
	private String cpf;
	private int idade;
	private int telefone;
	
	
	public Pessoa(String n, String end, String cpf, int idade, int tel) {
		
		this.setNome(n);
		this.setEndereco(end);
		this.cpf = cpf;
		this.idade = idade;
		this.setTelefone(tel);
		
	}
	
	public void ValidarCpf() {
		if (getCpf().length()!=11) {
			System.out.println("\nCPF digitado é inválido!");
		}else {
			System.out.println("\nCPF digitado é válido!");
		}
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	
	
	
}
