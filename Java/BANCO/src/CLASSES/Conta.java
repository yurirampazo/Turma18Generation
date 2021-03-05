package CLASSES;

public class Conta {
	//atributos da classe Conta, dentro do pacote CLASSES: 
	private int numero;											//metodos debito e credito
	private String cpf;											//responsabilidade de casse
	private double saldo;										//nao pode usar o set no saldo		
	private boolean ativa;								// atributos que nao forem declarados como public
														//são public
	
	//se for tirar money da conta use debito, se for colocar usar o metodo credito
	
	public Conta(int numero, String cpf) { 		//CONSTRUTOR TEM O MESMO NOME DA CLASSE SÓ QUE COM PARENTESIS!!!!!
		this.numero = numero;
		this.cpf = cpf;
	}
	
	public Conta(int numero) {  	// SOBRECARAGA, CONSEGUE FAZER OUTRO METODO COM O MESMO NOME POREM TIPO DIFERENTE.
		this.numero = numero; 
	}
	
	public Conta(int numero, String cpf, boolean ativa) {  //SOBRECARGA DE CONTRUTOR++ É O QUE VAI TRABALHAR AS ENTRADAS!
		this.numero = numero;
		this.cpf = cpf;
		this.ativa = ativa;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	//SET SALDO REMOVIDO. MÁXIMA DO PROJETO
	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
	//METODOS
	public void credito(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void debito (double valor) {
		if (this.saldo >= valor) {
		this.saldo = this.saldo - valor;
		}
	}
}