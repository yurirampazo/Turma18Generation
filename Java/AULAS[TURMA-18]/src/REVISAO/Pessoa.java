package REVISAO;

public class Pessoa {
	// PASSO 1:  DEFINIR A CLASSE -  [PESSOA]
	
	// PASSO 2:  ATRIBUTOS -  NO BRASIL COM SEGURAN�AAA --> DICA: Usar private!!! Depois INSTANCIAR
	
	// PASSO 3: CONSTRUTORES - COMO A CLASSE ABRE- CIRA��O - [PEDREIRO Z�]
		//PASSO3.1: (OPCIONAL) - SOBRECARGA DE CONSTRUTOR [PEDREIRO - MALAQUIAS - Z�]
	
	// PASSO 4: ENCAPSULAMENTO -  GETTERS AND SETTERS - SEGURAN�A - [Vigia]
	
	// PASSO 5: M�TODOS - [[VAI FAZER TALVEZ] [CASA OU TERRERNO  COM ACABAMENTO]
		// PASSO 5.1 (OPCIONAL) SOBRECARGA DE M�TODOS: 
	
	//PASSO 6 EM DIANTE - N�o � obrigat�rio mas pode acontecer:
	/*ACABAMENTO
	 * Override
	 * Polimorfismo
	 * Collection
	 * Interface
	 */
	//M�TODO � RELACIONADO A INTERA��O
	//ATRIBUTO � EST�TICO
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

		//M�TODO EM ENCAPSULAMENTO!!!!!!
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