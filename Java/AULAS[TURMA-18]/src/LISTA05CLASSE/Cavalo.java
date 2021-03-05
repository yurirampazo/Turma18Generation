package LISTA05CLASSE;

public class Cavalo extends Animal{
	//ATRIBUTOS
	private String som = "Hiiii Hiiii Hiii";
	
	//CONSTRUTORES
	public Cavalo(String nome, int idade, String som) {
		super(nome, idade, som);
	
	}
	//ENCAPSULAMENTO

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}
	
	//M�TODO
	@Override
	public void correr() {
		System.out.println("O animal est� correndo...");
	}
	@Override
	public void som() {
		System.out.println("O animal est� emitindo seu som caracter�stico!" + this.getSom());
	}
	
}