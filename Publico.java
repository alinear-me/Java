package poo.comeco;

public class Publico extends Telefone {
	
	public Publico()
	{
		super("Telefone p�blico");
	}
	
	@Override //sobrescrita
	public void toca (int numToque)
	{
		for(int i=0;i<numToque;i++)
		{
			System.out.println("Toque...Toque...Toque");
		}
	}	
		@Override 
		public void disca(String numero)
		{
			if(numero.charAt(0)=='9'  || numero.charAt(0) == '8')
			{
				System.out.println("\nEste n�mero n�o liga para celular");
			}
			else
			{
				System.out.println("\nDiscando: "+numero);
			}
		}
	}
	


