package poo.comeco;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro billy = new Cachorro("Billy","4","au au au","vira-lata","macho","branco","sim");
		Cavalo cavalo = new Cavalo("P�-de-pano","7","relinchar","Shire","Inglaterra");
		Pregui�a pregui�a = new Pregui�a("Pregui�a","6","balido","sim","herb�voro","18 horas por dia");
		
			
	
		billy.imprimirInfo();
		billy.comida();
		cavalo.imprimirInfo();
		cavalo.comida();
		pregui�a.imprimirInfo();
		pregui�a.comida();

	}

}
