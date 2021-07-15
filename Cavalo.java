package poo.comeco;

public class Cavalo extends Animal {

	private String raça;
	private String pais;

	
	public Cavalo(String nome,String idade,String som,String raça,String pais)
	{
		super(nome,idade,som);
		
		this.raça = raça;
		this.pais = pais;
	}


	public String getRaça() {
		return raça;
	}


	public void setRaça(String raça) {
		this.raça = raça;
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
		System.out.println("\nRaça do animal: "+raça);
		System.out.println("\nPaís de origem: "+pais);
	}
	
	@Override
	public void comida()
	{
		System.out.println("\nComida favorita: Feno");
	}
}
