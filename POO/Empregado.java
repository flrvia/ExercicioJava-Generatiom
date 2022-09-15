package POO;

import java.text.NumberFormat;

public class Empregado {

	//atribuindo atributos do empregado
	private String nome;
	private double salario;
	
	//parâmetros 
	
	public Empregado(String n, double s) {
		
		this.setNome(n);
		this.setSalario(s);
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void AumentarSalario(double percentual) {
		salario *= 1 + percentual/100;
	}
	//quando não é void tem que ter return
	public String formatartMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();//coloca a moeda do país
		nf.setMinimumFractionDigits(2);//este metodo indica quantas casas depois da virgula
		String formatoMoeda = nf.format(salario);//formatar o salário
		return formatoMoeda;
	}
	
	public void imprimir() {
		System.out.println("\nNome: "+nome+"\t\tSalário: "+this.formatartMoeda());
	}
	public void novoImprimir() {
		System.out.println("\nNome: "+nome+"\t\tNovo salário: "+this.formatartMoeda());
	}
	
	
}
