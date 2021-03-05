package LISTA05CLASSE;

public class Animal {
	//ATTRIBUTTES
	protected String nome;
	protected int idade;
	protected String som;
	
	
	//ENCAPSULAMENTO
	public Animal(String nome, int idade, String som) {
		this.nome = nome;
		this.idade = idade;
		this.som = som;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	
	public void setSom(String som) {
		this.som = som;
		
	}
	
	public String getSom () {
		
		return som;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//MÉTODOS
	public void correr() {
		System.out.println("O animal está correndo...");
	}
	
	public void som() {
		System.out.println("O animal está emitindo seu som característico!" + som);
	}
}
	
	