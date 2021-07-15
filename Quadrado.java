package poo.comeco;

public class Quadrado extends BaseFigura implements Figuras {
//estou herdando de BaseFigura e implementando de Figuras
//isso se configura em uma múltipla herança
	
	public Quadrado(double lado,String nome)
	{
		super(lado,lado,nome);
		nomeClasse = "Quadrado";
	}
	
	@Override  //apenas uma identificação, vai ser sobrescrito da classe mãe
	public double getDiagonal()
	{
		return Math.sqrt(2)*lado1;
	}
	
	
	
}
