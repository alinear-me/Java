package poo.comeco;

public class Cavalo extends Animal {

	private String ra�a;
	private String pais;

	
	public Cavalo(String nome,String idade,String som,String ra�a,String pais)
	{
		super(nome,idade,som);
		
		this.ra�a = ra�a;
		this.pais = pais;
	}


	public String getRa�a() {
		return ra�a;
	}


	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do cavalo: "+getNome());
		System.out.println("\nIdade do cavalo: "+getIdade());
		System.out.println("\nSom do animal: "+getSom());
		System.out.println("\nRa�a do animal: "+ra�a);
		System.out.println("\nPa�s de origem: "+pais);
	}
	
	@Override
	public void comida()
	{
		System.out.println("\nComida favorita: Feno");
	}
}
