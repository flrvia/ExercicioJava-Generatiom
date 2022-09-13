package POO;

public class Automovel2 {
	
	//declarando as variaveis
	private String nomeProprietario;
	private String modelo;
	private String placa;
	private int ano;
	
	
	public Automovel2(String nomeProprietario, String modelo, String placa, int ano) {
		this.nomeProprietario = nomeProprietario;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
	}

	//O set modifica e o get pega 
	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	//vai imprimir as informações do automovel
	public void ImprimirInfo() {
		System.out.println(nomeProprietario+" possui um veículo de modelo: "+modelo+" com placa "+placa+" e ano "+ano);
	}
	
}
