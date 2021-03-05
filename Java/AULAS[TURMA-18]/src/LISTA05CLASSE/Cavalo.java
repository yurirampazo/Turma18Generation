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