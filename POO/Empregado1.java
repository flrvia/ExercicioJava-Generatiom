package POO;

import java.text.NumberFormat;

public class Empregado1 extends Pessoa{

	private int codigoSetor;
	private double salarioBase;
	private float imposto;	
	private double salarioTotal;
	
	
	public Empregado1(String n, int idade, String cpf, int tel, String end,  
			int codSetor, float salBase, int imposto) {
		super(n,end,cpf,idade,tel);
		this.setCodigoSetor(codSetor);
		this.setSalarioBase(salBase);
		this.imposto = imposto;
	}
	

	public double getSalarioTotal() {
		return salarioTotal;
	}


	public void setSalarioTotal(double salarioTotal) {
		this.salarioTotal = salarioTotal;
	}


	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}


	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	
	
	public void CalcularSalario() {
		salarioTotal = salarioBase - (salarioBase * (imposto/100));
		
		}
	
	public String formatartMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salarioBase);
		return formatoMoeda;
	}
	
	public String formatartMoeda2() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salarioTotal);
		return formatoMoeda;
	}

	
	public void imprimirInfo() {
		System.out.println("\nNome: "+getNome()+"\nIdade: "+getIdade()+"\nTelefone: "+getTelefone()+"\nCPF: "+getCpf()+"\nEndereço: "+getEndereco()+
				"\nCódigo do setor: "+codigoSetor+"\nSalário base: "+this.formatartMoeda()+"\nImposto a ser retido do salário base: "+imposto+"%");
	}
	
	public void imprimirNovo() {
		System.out.println("\nO salário total a ser recebido para o(a) "+getNome()+" será: "+this.formatartMoeda2());
	}
	
	
}
