package poo.comeco;

public class Fornecedor extends Pessoa { //vai herdar da classe pessoa

	//declara��o dos atributos da classe Fornecedor
	private double valorCredito;
	private double valorDivida;
	
	
	//declara��o do m�todo especial Construtor
	
	public Fornecedor(String nome,String endereco,String cpf,int telefone,int idade,double valorCredito,double valorDivida)
	{
		super(nome,endereco,cpf,telefone,idade); //passar os par�metros para a super classe
		this.valorCredito = valorCredito; //inicializando os atributos
		this.valorDivida = valorDivida;
	}

	//criar os m�todos getters and setters 

	
	public double getValorCredito() {
		return valorCredito;
	}


	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}


	public double getValorDivida() {
		return valorDivida;
	}


	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	
	//criar os m�todos espec�ficos da classe Fornecedor
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do empregado: "+getNome()+"\n"+"CPF: "+getCpf()+"\n"+"Idade: "+getIdade()+"\nTelefone: "+getTelefone()
		+"\n"+"endere�o: "+getEndereco()+"\n"+"Valor de cr�dito do fornecedor: "+valorCredito+
		"\nValor da didida foi: "+valorDivida+"\nValor em porcentagem (sem o %) de imposto a ser retido do sal�rio: "+imposto);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
