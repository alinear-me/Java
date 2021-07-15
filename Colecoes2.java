package poo.comeco;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecoes2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op;
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do 
		{
			System.out.println("\n(1) Deseja adicionar produtos ao estoque\n"+"(2) Deseja remover o produto?\n"+"\n(3) Atualizar\n(4) Mostrar o produto"
							+"\n(0) Encerrar o programa!");
			System.out.println("\n\t Digite sua opção: ");
			op = leia.nextInt();
			
			
			switch(op)
			{
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o produto para adicionar ao estorque: ");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
				
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto para remover do estoque: ");
				String produto1 = leia.nextLine();
				break;
				if(estoque.contains(produto1));
				{
					estoque.remove(produto1);
				}
				else
				{
					
				}
				
			}
		}	
		while(!=0)
		{
			
		}
			
			
		}
		while(!=0)
			{
			
			}
	}		
}	