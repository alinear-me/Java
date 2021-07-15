package poo.comeco;

public class ObjetoAutomovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instanciando um ojeto da classe automovel
		
		Automovel auto1 = new Automovel("Felipe Pereira","Lamborguini","FLP02042000",2021);
		
		
		//TROCA DE MENSAGENS (chamada ao método imprimirInfo())
		
		auto1.imprimirInfo();
		System.out.println("*****Transferência de Proprietário*****");
		auto1.setNomeProprietario("Thiago Pedroso");
		auto1.imprimirInfo();
		
		Automovel auto2 = new Automovel("Barbara Amaral","Ferrari 458","BAB2003",2020);
		auto2.setPlaca("BAB0567");
		auto2.imprimirInfo(); 
	}

}
 
//1. ATRIBUTOS
//2. CONSTRUTORES
//3.METODOS
