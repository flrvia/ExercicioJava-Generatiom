package POO;

public class Automovel {

	public static void main(String[] args) {
		
		//Instanciar a classe Automovel2, fazer a comunicação
		
		Automovel2 auto = new Automovel2("\nFlávia Santana","Toro","DEV2022",2022);
		Automovel2 auto2 = new Automovel2("\nRafaela Silveira","Strada","CAM2022",2022);
		
		auto.ImprimirInfo();
		System.out.println("\n***************Transferência de proprietária***************");
		auto.setNomeProprietario("Juliana");
		auto.ImprimirInfo();
		System.out.println("\n");
		auto2.setPlaca("CAM2E22");
		auto2.ImprimirInfo();
	}

}
