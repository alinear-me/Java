package poo.comeco;

public class Celular extends Telefone{

	public Celular()
	{
		super("Celular");  //vai puxar algo da classe m�e
	}
	
	
	
	@Override
	public void toca(int codigoToque) //m�todo polim�rfico da classe abstrata "Telefone".
	{
		switch(codigoToque)
		{
		case 1: 
			System.out.println("Trimm.... Trimmm");
			break;
		case 2:
			System.out.println("Bibibi....bibibi...");
			break;
			default:
				System.out.println("Tandan...Tandan");
		}
	}

	@Override
	public void disca(String numero) {
		{
			System.out.println("O n�mero: "+numero+" � um celular...");
		
	}

	}
}