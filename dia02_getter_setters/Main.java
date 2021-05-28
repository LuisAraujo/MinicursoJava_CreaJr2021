
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//c1 armazena um objeto do tipo Cachorro
		//new Cachorro cria um objeto do tipo Cachorro
		Cachorro c1 = new Cachorro();	
		c1.setNome("Totó");
		c1.setRaca("Doberman");
		c1.setCor("Preto");
		c1.setPeso(30.0f);
		c1.setPorte('g');
		
		Cachorro c2 = new Cachorro();
		c2.setNome("Glauber");
		c2.setRaca("Puddle");
		c2.setCor("Branco como a neve");
		c2.setPeso(10.2f);
		c2.setPorte('m');
		
		System.out.println("Meu cachorro");
		
		System.out.println("Nome : "+ c1.getNome() );
		System.out.println("Raça : "+c1.getRaca() );
		System.out.println("Cor : "+c1.getCor());
		System.out.println("Peso : "+c1.getPeso() +" Kg");
		
		System.out.println("Meu cachorro");
		System.out.println("Nome : "+c2.getNome() );
		System.out.println("Raça : "+c2.getRaca() );
		System.out.println("Cor : "+c2.getCor());
		System.out.println("Peso : "+c2.getPeso() +" Kg");
				
	}

}
