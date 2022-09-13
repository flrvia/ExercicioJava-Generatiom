package POO;

public class PacienteTeste {

	public static void main(String[] args) {
		
		Paciente pac = new Paciente("Amanda Lemos",18,"Unimed","Mamografia");
		Paciente pac1 = new Paciente("João Lemos",28,"Notredame Intermédica","Hemograma");
		Paciente pac2 = new Paciente("Gabriela Gonçalves",23,"SulAmérica","Papanicolau");
		
		System.out.println("\n\t\t\t Bem-vindo aos exames marcados de hoje ");
		pac.ImprimirInfo();
		pac1.setExame("Urina");
		pac1.ImprimirInfo();
		pac2.ImprimirInfo();
	}

}
