package poo.comeco;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro billy = new Cachorro("Billy","4","au au au","vira-lata","macho","branco","sim");
		Cavalo cavalo = new Cavalo("Pé-de-pano","7","relinchar","Shire","Inglaterra");
		Preguiça preguiça = new Preguiça("Preguiça","6","balido","sim","herbívoro","18 horas por dia");
		
			
	
		billy.imprimirInfo();
		billy.comida();
		cavalo.imprimirInfo();
		cavalo.comida();
		preguiça.imprimirInfo();
		preguiça.comida();

	}

}
