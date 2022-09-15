package POO;

public class Empregado1Test {

	public static void main(String[] args) {
		
		Empregado1 func = new Empregado1("Menezes Almeida Silva", 29,"12345678912",958214652,"Rua Gazela Dias",
				12,3000,15);
		
		System.out.println("\n\t\t\t Informações sobre o funcionário: ");
		func.imprimirInfo();
		
		func.CalcularSalario();
		
		func.imprimirNovo();
	}

}
