package poo.comeco;

public class Cachorro extends Animal{
	
	private String ra�a;
	private String genero;
	private String corPelagem;
	private String correr;
	
	public Cachorro(String nome, String idade, String som,String ra�a,String genero,String corPelagem, String correr)
	{
		super(nome,idade,som);
		
		this.ra�a = ra�a;
		this.genero = genero;
		this.corPelagem = corPelagem;
		this.correr = correr;
	}

	public String getRa�a() {
		return ra�a;
	}

	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
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
	
	
	//m�todo espec�fico de implementa��o de informa��o
	public void imprimirInfo() //aqui ser�o impressa as informa��es na tela
	{
		System.out.println("\nNome do cachorro: "+getNome());
		System.out.println("\nIdade do cachorro: "+getIdade());
		System.out.println("\nSom do animal: "+getSom());
		System.out.println("\nRa�a do cachorro: "+ra�a);
		System.out.println("\nG�nero do animal: "+genero);
		System.out.println("\nCor da pelagem: "+corPelagem);
		System.out.println("\nDeve correr: "+correr);
	}

	@Override //assinatura 
	public void comida() //foi implementado 
	{
		System.out.println("\nComida favorita: Pedee Gree");
	}
	
}
