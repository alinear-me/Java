package poo.comeco;

public class Publico extends Telefone {
	
	public Publico()
	{
		super("Telefone público");
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
				System.out.println("\nEste número não liga para celular");
			}
			else
			{
				System.out.println("\nDiscando: "+numero);
			}
		}
	}
	


