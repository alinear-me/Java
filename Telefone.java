package poo.comeco;

public abstract class Telefone { //� uma classe abstrata
	
	private String tipo; //atributo tipo
	
	
	
	abstract public void disca(String numero); //m�todo abstrato disca e toca
	abstract public void toca(int numToques);
	
	
	//construtor
	public Telefone(String tipo)
	{
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	

}
