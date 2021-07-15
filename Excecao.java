package poo.comeco;

public class Excecao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase = null,novaFrase=null;
		
		try
		{
			novaFrase.toUpperCase();
		} 
		catch(NullPointerException e)//captura da possivel excessão
		{
			//tratamento da excessão
			System.out.println("\nA frase inicial está nula, para solucionar"
					+ "tal problema, foi atribuido um valor defaul...");
			frase = "Frase vazia";
			novaFrase = frase.toUpperCase();
		}
		
		System.out.println("\nFrase antiga: "+frase);
		System.out.println("\nFrase nova: "+novaFrase);
		
	}

}
