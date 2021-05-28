import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//vetor de dog
		Cachorro[] arrC = new Cachorro[10];
		ArrayList<Cachorro> arrlC = new ArrayList<Cachorro>();
		
		Scanner sc = new Scanner( System.in );
		
		System.out.println("Olá, informe os dados do seu Doguinho!");
		
		int opc = 1;
		int index = 0;
		
		while( opc == 1) {
					
			Cachorro c1 = new Cachorro();
			
			System.out.println("Nome:");
			//nextLine retorna o que o usuário digita. Armazei em nome
			String nome = sc.nextLine();
			//passei por parametro o nome (que possui o valor do nome do dog)
			c1.setNome(nome);
			
			sc = new Scanner( System.in );
			System.out.println("Raça:");
			String raca = sc.nextLine();
			c1.setRaca(raca);
			
			sc = new Scanner( System.in );
			System.out.println("Cor:");
			String cor = sc.nextLine();
			c1.setCor( cor );
			
			sc = new Scanner( System.in );
			System.out.println("Peso (kg):");
			float peso = sc.nextFloat();
			c1.setPeso( peso );
			
			sc = new Scanner( System.in );
			System.out.println("Porte (p, m, g):");
			String porte = sc.nextLine();
			c1.setPorte( porte.charAt(0) );
			
			//o vetor de cachorro terá na posicao
			//index o objeto que está em c1.
			arrC[index] = c1;
			//0, 1, 2 , 3...
			index = index + 1;
			
			
			//usando arraylist
			arrlC.add( c1 );

			sc = new Scanner( System.in );
			System.out.println("Deseja continua? 0 (nao) e 1 (sim)");
			opc = sc.nextInt();
		
		}
		
		
		System.out.println("Meu cachorro\n");
		
		//Exibindo o Array
		for(int i = 0; i < arrC.length; i++) {
			
			if(arrC[i] == null)
				break;
			
			System.out.println("Nome : "+ arrC[i].getNome() );
			System.out.println("Raça : "+arrC[i].getRaca() );
			System.out.println("Cor : "+arrC[i].getCor());
			System.out.println("Porte : "+ arrC[i].getPorte() );
			System.out.println("Peso : "+arrC[i].getPeso() +" Kg");
		}
	
		
		//Exibindo o ArrayList
		for(int i = 0; i < arrlC.size(); i++) {
			
			if(arrC[i] == null)
				break;
			
			System.out.println("Nome : "+ arrlC.get(i).getNome() );
			System.out.println("Raça : "+arrlC.get(i).getRaca() );
			System.out.println("Cor : "+arrlC.get(i).getCor());
			System.out.println("Porte : "+ arrlC.get(i).getPorte() );
			System.out.println("Peso : "+arrlC.get(i).getPeso() +" Kg");
		}
	
				
	}

}
