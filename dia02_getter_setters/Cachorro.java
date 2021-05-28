public class Cachorro{
	
	/*CARACTERISTICAS*/
	private String nome;
	private char porte;
	private String temperamento;
	private String cor;
	private String raca;
	private int idade;
	private float peso;
	
	/*ações*/
	//getters e setters 
	String getNome(){
		return nome;
	}
	
	void setNome(String nome){
		this.nome = nome;
	}
	
	float getPeso(){
		return peso;
	}
	
	void setPeso( float peso) {
		this.peso = peso;
	}
	
	
	char getPorte(){
		return this.porte;
	}
	
	void setPorte(char porte){
		this.porte = porte;
	}
	
	String getTemperamento() {
		return this.temperamento;
	}
	
	void setTemperamento(String temperamento) {
		this.temperamento = temperamento;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//outras
	//comer(float qtd)
	
	//latir() AUAUAUA... auauau
	
	//correr(float km)
	
	
}