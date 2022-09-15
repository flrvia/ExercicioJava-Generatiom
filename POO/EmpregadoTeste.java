package POO;

public class EmpregadoTeste {

	public static void main(String[] args) {
		
		Empregado[] lista = new Empregado[3];
		
		lista[0] = new Empregado("Leticia Santos",25000);
		lista[1] = new Empregado("Hellen Digramont",15000);
		lista[2] = new Empregado("Nina Dados",51800);
		
		for(Empregado roda:lista) {// o roda é o loop
			
		roda.imprimir();
		}
		
		System.out.println("\n***********************************************************");
		for(Empregado roda:lista) {
			roda.AumentarSalario(20);
			roda.novoImprimir();
		}

	}

}
