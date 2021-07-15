package poo.comeco;

public class Operario extends Pessoa   {  //vai herdar os atributos da classe Empregado1
	
	
	//declara��o dos atributos da classe Operario
	private double valorProducao;
	private double comissao;
	
	
	//criar  o construtor da classe Operario
	public Operario(String nome,String endereco,String cpf,int telefone,int idade)
	{
		super(nome,endereco,cpf,telefone,idade); //passar os par�metros para a super classe
		this.valorProducao = valorProducao; //inicializando os atributos
		this.comissao = comissao;
	}
	
	//declara��o dos m�todos getters ans setters
	
	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	
	//criar os m�todos espec�ficos da classe oper�ria
	public void imprimirInfo()
	{
		System.out.println("\nNome do empregado: "+getNome()+"\n"+"CPF: "+getCpf()+"\n"+"Idade: "+getIdade()+"\nTelefone: "+getTelefone()
		+"\n"+"endere�o: "+getEndereco()+"\n"+"C�digo do Setor: "+codigoSetor+
		"anSal�rio Base: "+salarioBase+"\nValor em porcentagem (sem o %) de imposto a ser retido do sal�rio: "+imposto);
}

public void calcularsalario()
{
double salarioTotal = salarioBase - (salarioBase * (imposto/100));
System.out.println("\nO sal�rio total a ser recebido pelo empregado"+getNome()
+" � igual a: "+salarioTotal);
	

}
