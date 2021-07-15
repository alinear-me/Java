package poo.comeco;

import java.text.NumberFormat;

public class Empregado {
		//criação dos Atributos
	private String nome;   //private é um modificador de acesso privado
	private double salario; //double é o dobro do float
	
	//construtor: vai construit a inicialização dos atributos
	public Empregado(String n,double s) //construtor
	{
		this.setNome(n); //inicialização do atributo nome  / o this é "eu mesmo"
		this.setSalario(s); //inicialização do atributo salário
	}
	//definição dos métodos

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;  //1o nome é o atributo e o 2o nome é o parâmetro 
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
		NumberFormat nf = NumberFormat.getCurrencyInstance(); //vai pegar o sistema operacional e ver de qual país é, e vai pegar a moeda.
		nf.setMinimumFractionDigits(2);  //quantas casas depois da vírgula
		String formatoMoeda = nf.format(salario); //formata a saída do valor monetário
		return formatoMoeda;//retorna o salário já formatado
	}
	
	public void imprimir()
	{
		System.out.println(nome+"\t\t"+"Salário: "+this.formatarMoerda());
	}
	
	
}
