package poo.comeco;

public class Automovel {
	//declaração dos atributos da classe
	private String nomeProprietario; 
	private String modelo;
	private String placa;
	private int ano;     				//private são os atributos. nenhuma outra classe terá acesso à ela. 
										// caractersticas da classe
	
	//método construtor:
	public Automovel (String nomeProprietario,String modelo,String placa,int ano) 
	{   
		this.nomeProprietario = nomeProprietario;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
	
	}
	
	
	public Automovel(String modelo)  //public são os métodos
	{
		this.modelo = modelo;
	}
	
	//declaração dps demais métodos da classe
	public void imprimirInfo()
	{
		System.out.println(nomeProprietario+" possui uma(a) "+modelo+ " com placa "+placa+" e ano "+ano);
	}

	public String getNomeProprietario() { //nome do atributo
		return nomeProprietario; //nome do parâmetro
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

		
	}
	
	
	

 