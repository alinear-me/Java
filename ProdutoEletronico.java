package poo.comeco;

public class ProdutoEletronico {
	
	/*3) Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.
	*/
	private String marca;
	private String aparelho;
	private String modelo;	
	private String acessorios;	
		
	public ProdutoEletronico (String marca, String aparelho, String modelo,String acessorios)
	{
		this.marca = marca;
		this.aparelho = aparelho;
		this.modelo = modelo;
		this.acessorios = acessorios;
	}
	
	public ProdutoEletronico (String aparelho)
	{
		this.aparelho = aparelho;
	}
	
	public void imprimirInfo()
	{
		System.out.println("Lançamento exclusivo da "+marca+" o novo "
		+aparelho+"\naparece com design inovador, o modelo "+modelo+".\n Ele vem incluso: "+acessorios);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getAparelho() {
		return aparelho;
	}

	public void setAparelho(String aparelho) {
		this.aparelho = aparelho;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAcessorios() {
		return acessorios;
	}

	public void setAcessorios(String acessorios) {
		this.acessorios = acessorios;
	}
	 	
	}

