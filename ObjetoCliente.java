package poo.comeco;

public class ObjetoCliente {
	public static void main(String[] args) 
	{
		//instanciando um ojeto da classe automovel
		
		Cliente cliente1 = new Cliente("Abel Arantes","444.555.666-22","54","Professor");
		
		
		cliente1.imprimirInfo();
		System.out.println("Sr(a) cliente favor entrar em contato para retirada de prêmio ganho no sorteio realizado");
		
	}
}
