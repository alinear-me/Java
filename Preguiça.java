package poo.comeco;

public class Preguiça extends Animal {

	
	private String arvore;
	private String alimentacao;
	private String sono;
	
	public Preguiça(String nome, String idade,String som, String arvore, String alimentacao, String sono)
	{
		super(nome,idade,som);
		
		this.arvore = arvore;
		this.alimentacao = alimentacao;
		this.sono = sono;
	}

	public String getArvore() {
		return arvore;
	}

	public void setArvore(String arvore) {
		this.arvore = arvore;
	}

	public String getAlimentacao() {
		return alimentacao;
	}

	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}

	public String getSono() {
		return sono;
	}

	public void setSono(String sono) {
		this.sono = sono;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do Bixo-Preguiça: "+getNome());
		System.out.println("\nIdade do Bixo-Preguiça: "+getIdade());
		System.out.println("\nSom do animal: "+getSom());
		System.out.println("\nO animal sobe em árvores: "+arvore);
		System.out.println("\nAlimentação: "+alimentacao);
		System.out.println("\nHoras de sono: "+sono);
	}
	
	@Override
	public void comida()
	{
		System.out.println("\nComida favorita: Folhas");
	}
}
