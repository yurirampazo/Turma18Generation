package REVISAO;

public class Pessoa {
	// PASSO 1:  DEFINIR A CLASSE -  [PESSOA]
	
	// PASSO 2:  ATRIBUTOS -  NO BRASIL COM SEGURANÇAAA --> DICA: Usar private!!! Depois INSTANCIAR
	
	// PASSO 3: CONSTRUTORES - COMO A CLASSE ABRE- CIRAÇÃO - [PEDREIRO ZÉ]
		//PASSO3.1: (OPCIONAL) - SOBRECARGA DE CONSTRUTOR [PEDREIRO - MALAQUIAS - ZÉ]
	
	// PASSO 4: ENCAPSULAMENTO -  GETTERS AND SETTERS - SEGURANÇA - [Vigia]
	
	// PASSO 5: MÉTODOS - [[VAI FAZER TALVEZ] [CASA OU TERRERNO  COM ACABAMENTO]
		// PASSO 5.1 (OPCIONAL) SOBRECARGA DE MÉTODOS: 
	
	//PASSO 6 EM DIANTE - Não é obrigatório mas pode acontecer:
	/*ACABAMENTO
	 * Override
	 * Polimorfismo
	 * Collection
	 * Interface
	 */
	//MÉTODO É RELACIONADO A INTERAÇÃO
	//ATRIBUTO É ESTÁTICO
	private String nome;
	private int anoNascimento;
	private boolean vivo;	
	private char genero;				
	
	//CONSTRUTOR tem o MESMO NOME DA CLASSE
	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}

	public Pessoa(String nome, int anoNascimento, char genero) {  //Quando nome de var for igual de atributo usa -se o this.
		super();
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.genero = genero;
	}

		//MÉTODO EM ENCAPSULAMENTO!!!!!!
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}
	//METODO
	public int idade() {
		return 2021 - anoNascimento;
	}
	
	//METODO SOBRECARGA
	public int idade(int anoAtual) {
		return anoAtual - anoNascimento;
	}
}