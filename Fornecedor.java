package poo.comeco;

public class Fornecedor extends Pessoa { //vai herdar da classe pessoa

	//declaração dos atributos da classe Fornecedor
	private double valorCredito;
	private double valorDivida;
	
	
	//declaração do método especial Construtor
	
	public Fornecedor(String nome,String endereco,String cpf,int telefone,int idade,double valorCredito,double valorDivida)
	{
		super(nome,endereco,cpf,telefone,idade); //passar os parâmetros para a super classe
		this.valorCredito = valorCredito; //inicializando os atributos
		this.valorDivida = valorDivida;
	}

	//criar os métodos getters and setters 

	
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
	
	
	//criar os métodos específicos da classe Fornecedor
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do empregado: "+getNome()+"\n"+"CPF: "+getCpf()+"\n"+"Idade: "+getIdade()+"\nTelefone: "+getTelefone()
		+"\n"+"endereço: "+getEndereco()+"\n"+"Valor de crédito do fornecedor: "+valorCredito+
		"\nValor da didida foi: "+valorDivida+"\nValor em porcentagem (sem o %) de imposto a ser retido do salário: "+imposto);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
