package poo.comeco;

import java.text.NumberFormat;

public class Empregado {
		//cria��o dos Atributos
	private String nome;   //private � um modificador de acesso privado
	private double salario; //double � o dobro do float
	
	//construtor: vai construit a inicializa��o dos atributos
	public Empregado(String n,double s) //construtor
	{
		this.setNome(n); //inicializa��o do atributo nome  / o this � "eu mesmo"
		this.setSalario(s); //inicializa��o do atributo sal�rio
	}
	//defini��o dos m�todos

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;  //1o nome � o atributo e o 2o nome � o par�metro 
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	public void aumentarSalario(double percentual)
	{
		salario *= 1 + percentual/100;
	}
	
	public String formatarMoerda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance(); //vai pegar o sistema operacional e ver de qual pa�s �, e vai pegar a moeda.
		nf.setMinimumFractionDigits(2);  //quantas casas depois da v�rgula
		String formatoMoeda = nf.format(salario); //formata a sa�da do valor monet�rio
		return formatoMoeda;//retorna o sal�rio j� formatado
	}
	
	public void imprimir()
	{
		System.out.println(nome+"\t\t"+"Sal�rio: "+this.formatarMoerda());
	}
	
	
}
