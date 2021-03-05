package TESTE;

public class Coordenador extends Pessoa{
	private String cursoCoordenador;

	public Coordenador(String nome, int matricula, String cursoCoordenador) {
		super(nome, matricula);  //atribuição de parametros da herança da superclasse
		this.cursoCoordenador = cursoCoordenador;
	}

	public String getCursoCoordenador() {
		return cursoCoordenador;
	}

	public void setCursoCoordenador(String cursoCoordenador) {
		this.cursoCoordenador = cursoCoordenador;
	}
	
	

}
