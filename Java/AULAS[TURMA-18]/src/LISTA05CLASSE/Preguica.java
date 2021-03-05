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

	
	//MÉTODO
		
		public void subirArvore() {
			System.out.println("O animal está subindo a árvore..");
		}



		@Override
		public void som() {
			System.out.println("O animal está emitindo seu som característico!" + this.getSom());
		}
}
