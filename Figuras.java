package poo.comeco;

public interface Figuras {

	public String nomeInterface = "Figuras";
	//criamos dois m�todos abstratos (getNome e setNome)
	abstract public String getNome();
	abstract public void setNome(String nome);
	
	public double getArea();
	public double getPerimetro();
	double getDiagonal();
	
}
