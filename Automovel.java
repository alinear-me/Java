package poo.comeco;

public class Automovel {
	//declara��o dos atributos da classe
	private String nomeProprietario; 
	private String modelo;
	private String placa;
	private int ano;     				//private s�o os atributos. nenhuma outra classe ter� acesso � ela. 
										// caractersticas da classe
	
	//m�todo construtor:
	public Automovel (String nomeProprietario,String modelo,String placa,int ano) 
	{   
		this.nomeProprietario = nomeProprietario;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
	
	}
	
	
	public Automovel(String modelo)  //public s�o os m�todos
	{
		this.modelo = modelo;
	}
	
	//declara��o dps demais m�todos da classe
	public void imprimirInfo()
	{
		System.out.println(nomeProprietario+" possui uma(a) "+modelo+ " com placa "+placa+" e ano "+ano);
	}

	public String getNomeProprietario() { //nome do atributo
		return nomeProprietario; //nome do par�metro
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
	
	
	

 