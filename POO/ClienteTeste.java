package POO;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Cliente c = new Cliente("Lidia Mariana da Silva",123456789,"Rua Brasil","lidia@gmail.com","Caderno Monster High",25.90);
		Cliente c1 = new Cliente("Maria Julia Santos",987654321,"Avenida Paulista","joaninha@gmail.com","Lápis De Cor 120 Cores Albrecht Dürer Estojo Madeira Faber-Castell",3.499);
		
		System.out.println("\n\t\t\t Dados do cliente para a compra");
		
		
		c.ImprimirInfo();
		
		c1.ImprimirInfo();
	}

}
