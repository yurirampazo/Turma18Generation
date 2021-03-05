package LISTA05CLASSE;

public class Preguica extends Animal{
	
	private String som = "Ahhhhh";
	
	//CONSTRUTORES
	public Preguica(String nome, int idade, String som) {
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
		
		public void subirArvore() {
			System.out.println("O animal est� subindo a �rvore..");
		}



		@Override
		public void som() {
			System.out.println("O animal est� emitindo seu som caracter�stico!" + this.getSom());
		}
}
