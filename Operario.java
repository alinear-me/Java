package poo.comeco;

public class Operario extends Pessoa   {  //vai herdar os atributos da classe Empregado1
	
	
	//declaração dos atributos da classe Operario
	private double valorProducao;
	private double comissao;
	
	
	//criar  o construtor da classe Operario
	public Operario(String nome,String endereco,String cpf,int telefone,int idade)
	{
		super(nome,endereco,cpf,telefone,idade); //passar os parâmetros para a super classe
		this.valorProducao = valorProducao; //inicializando os atributos
		this.comissao = comissao;
	}
	
	//declaração dos métodos getters ans setters
	
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
	
	
	//criar os métodos específicos da classe operária
	public void imprimirInfo()
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
