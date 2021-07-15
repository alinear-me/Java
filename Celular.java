package poo.comeco;

public class Celular extends Telefone{

	public Celular()
	{
		super("Celular");  //vai puxar algo da classe mãe
	}
	
	
	
	@Override
	public void toca(int codigoToque) //método polimórfico da classe abstrata "Telefone".
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
			System.out.println("O número: "+numero+" é um celular...");
		
	}

	}
}