package poo.comeco;

public abstract class Animal {

	//atributos
	private String nome;
	private String idade;
	private String som;
	
	
	//construtor
	public Animal(String nome,String idade,String som)
	{
		super();
		this.idade = idade;
		this.nome = nome;
		this.som = som;
	}

	//métodos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	//deve ser implemnatdo nas subclasses
	abstract public void comida(); //será implementado nas subclasses
	
	
	
}
