package poo.comeco;

public class Empregado1 extends Pessoa { //criando herança da classe Pessoa
	//isso quer dizer que o empregado1 irá herdar todas as criaççoes da classe
	
	//declarando os atributos da classe Empregado1
	private int codigoSetor;
	private float salarioBase;
	private float imposto;  //esses atributos são apenas da classe Empregado1, ou seja, não estão na classe Pessoa.
	
	// criação dos parâmetros do meu construtor. aqui iremos colocar os atributos herdados
	
	public Empregado1(String nome,String endereco,String cpf,int telefone,int idade,int codigoSetor,float salarioBase,float imposto)
	{
		super(nome,endereco,cpf,telefone,idade);  //quando eu uso a palavra reservada"super", 
												 //eu irei carregar os parâmetros da minha superclasse
		this.codigoSetor = codigoSetor;   //inicializando os atributos
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	public int getCodigoSetor() {
		return codigoSetor; 
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	
	
	//começo a criar os métodos específicos da minha classe
	
	
	public void imprimirInfo()  //vai imrpimir todas as informações  dentro do system
	{
		System.out.println("\nNome do empregado: "+getNome()+"\n"+"CPF: "+getCpf()+"\n"+"Idade: "+getIdade()+"\nTelefone: "+getTelefone()
							+"\n"+"endereço: "+getEndereco()+"\n"+"Código do Setor: "+codigoSetor+
							"anSalário Base: "+salarioBase+"\nValor em porcentagem (sem o %) de imposto a ser retido do salário: "+imposto);
	}
	
	public void calcularsalario()
	{
		double salarioTotal = salarioBase - (salarioBase * (imposto/100));
		System.out.println("\nO salário total a ser recebido pelo empregado"+getNome()
		+" é igual a: "+salarioTotal);
		
		
		
		
		
		
	}
	
}
