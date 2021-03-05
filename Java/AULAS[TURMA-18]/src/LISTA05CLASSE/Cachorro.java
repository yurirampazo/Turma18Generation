package LISTA05CLASSE;

public class Cachorro extends Animal{
	
	//ATRIBUTO
	private String som = "Auu Auu";
	
	//CONSTRUTORES
	public Cachorro(String nome, int idade, String som) {
		super(nome, idade, som);
	
	}
		
	
	public String getSom() {
		return som;
	}


	public void setSom(String som) {
		this.som = som;
	}


	//MÉTODO
	@Override
	public void correr() {
		System.out.println("O animal está correndo...");
	}
	@Override
	public void som() {
		System.out.println("O animal está emitindo seu som característico!" + this.getSom());
	}
}
