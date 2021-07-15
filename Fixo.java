package poo.comeco;

public class Fixo extends Telefone{

	
	public Fixo()
	{
		super("Telefone fixo");
	}
	
	@Override // sobresvrita do método abstrato da classe "Telefone"
	public void toca(int numToques) //3
	{
		for(int i=0;i<numToques;i++)
		{
			System.out.println("Plimplimplim...Plmplimplim...");
		}
	}
	
	@Override // sobrescrita do método abstrato da classe Telefone
	public void disca(String numero)
	{
		System.out.println("\nDiscando: "+numero);
	}
	
}
