package POO;

/*Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class Cliente {

	private String nome;
	private int CPF;
	private String endereco;
	private String email;
	private String produto;
	private double valorProduto;
	
	public Cliente(String nome, int CPF, String endereco, String email, String produto, double valorProduto) {
		this.nome = nome;
		this.CPF = CPF;
		this.endereco = endereco;
		this.email = email;
		this.produto = produto;
		this.valorProduto = valorProduto;
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int CPF) {
		this.CPF = CPF;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}
	
	public void ImprimirInfo() {
		System.out.println("\nNome do Cliente: "+nome+"\nCPF: "+CPF+"\nEndereço: "+endereco+"\nE-mail: "+email+"\nProduto que o cliente comprou: "+produto+"\nValor do produto: "+valorProduto+" reais");
	}
}
