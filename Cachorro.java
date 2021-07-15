package poo.comeco;

public class Cachorro extends Animal{
	
	private String raça;
	private String genero;
	private String corPelagem;
	private String correr;
	
	public Cachorro(String nome, String idade, String som,String raça,String genero,String corPelagem, String correr)
	{
		super(nome,idade,som);
		
		this.raça = raça;
		this.genero = genero;
		this.corPelagem = corPelagem;
		this.correr = correr;
	}

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCorPelagem() {
		return corPelagem;
	}

	public void setCorPelagem(String corPelagem) {
		this.corPelagem = corPelagem;
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	
	//método específico de implementação de informação
	public void imprimirInfo() //aqui serão impressa as informações na tela
	{
		System.out.println("\nNome do cachorro: "+getNome());
		System.out.println("\nIdade do cachorro: "+getIdade());
		System.out.println("\nSom do animal: "+getSom());
		System.out.println("\nRaça do cachorro: "+raça);
		System.out.println("\nGênero do animal: "+genero);
		System.out.println("\nCor da pelagem: "+corPelagem);
		System.out.println("\nDeve correr: "+correr);
	}

	@Override //assinatura 
	public void comida() //foi implementado 
	{
		System.out.println("\nComida favorita: Pedee Gree");
	}
	
}
