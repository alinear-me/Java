package poo.comeco;

public class ObjetoEmpregado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Empregado [] lista = new Empregado[4];
		
		lista[0] = new Empregado("Rafael",5000);
		lista[1] = new Empregado("Jooh",7000);
		lista[2] = new Empregado("Jackers",6000);
		lista[3] = new Empregado("Samuel",20000);
		
		for(Empregado roda:lista) //for each consegue rodar m�todos, atributos
		{
			roda.imprimir();
		}
		
		System.out.println("**************************************");
		
		for(Empregado roda:lista) //for each consegue rodar m�todos, atributos
		{
			roda.aumentarSalario(10);
			roda.imprimir();
		}
	}

}
