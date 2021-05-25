
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//c1 armazena um objeto do tipo Cachorro
		//new Cachorro cria um objeto do tipo Cachorro
		Cachorro c1 = new Cachorro();
		c1.setNome("Totó");
		
		/*c1.raca = "Doberman";
		c1.cor = "Preto";
		c1.peso = 30.0f;
		c1.porte = 'g';*/
		
		Cachorro c2 = new Cachorro();
		c2.setNome("Glauber");
		/*c2.raca = "Puddle";
		c2.cor = "Branco como a neve";
		c2.peso = 10.2f;
		c2.porte = 'm';*/
		
		System.out.println("Meu cachorro");
		System.out.println("Nome : "+c1.getNome() );
		/*System.out.println("Raça : "+c1.raca);
		System.out.println("Cor : "+c1.cor);
		System.out.println("Peso : "+c1.peso+" Kg");
		*/
		
		System.out.println("Meu cachorro");
		System.out.println("Nome : "+c2.getNome() );
		/*System.out.println("Raça : "+c2.raca);
		System.out.println("Cor : "+c2.cor);
		System.out.println("Peso : "+c2.peso+" Kg");
		*/
				
	}

}
