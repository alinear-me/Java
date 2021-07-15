package poo.comeco;

public class Aviao {
  
	/*2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
	*/
	private String companhia;
	private String classe;
	private String estadosbr;
	
	
	public Aviao(String companhia, String classe, String estadosbr)
	{
		this.companhia = companhia;
		this.classe = classe;
		this.estadosbr = estadosbr;
	}
	
	public Aviao (String classe)
	{
		this.classe = classe;
	}
	
	public void imprimirInfo()
	{
		System.out.println("A companhia aérea "+companhia+" está com promoções em suas classes:  "
				+ ""+classe+" para os seguintes estados brasileiros: "+estadosbr);
	}

	public String getCompanhia() {
		return companhia;
	}

	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getEstadosbr() {
		return estadosbr;
	}

	public void setEstadosbr(String estadosbr) {
		this.estadosbr = estadosbr;
	}
	
	
	
	
}
