package poo.comeco;

public class TesteTelefone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Celular celular = new Celular();
		Fixo fixo = new Fixo();
		Publico publico = new Publico();
		
		Telefone telefone = null;
		
		int n = (int) (Math.random()*3.0);
		
		System.out.println("\nNúmero escolhido foi: "+n);
		
		switch(n)
		{
		case 0: telefone = celular;break;
		case 1: telefone = fixo;break;
		case 2: telefone = publico;break;
		default: System.out.println("\nOcorreu um erro inesperado!!!");
			
		}
		
		if(telefone !=null)
		{
			telefone.toca(2);
			telefone.disca("7468217189");
		}

	}

}
