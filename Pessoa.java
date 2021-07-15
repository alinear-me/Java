package poo.comeco;

public class Pessoa { //Superclasse ou também conhecido como classe mãe
	//declaramos os atributos da classe Pessoa, atributos são as caracteristicas
	
	private String nome;
	private String endereco;
	private String cpf;
	private int telefone;
	private int idade;
	//quando declaro como private estou indicando que o meu atributo só será acessado pelos métodos da classe Pessoa
	//estou declarando o construtor que serve para inicialização dos atributos
	
	public Pessoa(String nome, String endereco,String cpf,int telefone,int idade)
	{
		super();
	
	this.nome = nome;
	this.endereco = endereco;
	this.cpf = cpf;
	this.telefone = telefone;
	this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}





	public int getTelefone() {
		return telefone;
	}





	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}





	public int getIdade() {
		return idade;
	}





	public void setIdade(int idade) {
		this.idade = idade;
	}

	// agora estamos criando os métodos específicos da classe Pessoa	
	
	public void validarCpf()
	{
		if(getCpf().length()!=11) //length ele conta a quantidade de caracteres
		{
			System.out.println("\n--CPF Inválido!");
		}
		else
		{
			System.out.println("\n-- CPF Válido!");
		}
	}
	

}
