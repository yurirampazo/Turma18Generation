package LISTA04_POO;

public class Conta {
	/* YURI MINA RAMPAZO - GENERATION BRASIL - TURMA 18
	 * PROJETO: 
	 * 6) Crie uma classe conta bancaria e apresente os atributos e métodos
	 * referentes esta classe, em seguida crie um objeto conta bancaria, defina
	 * as instancias deste objeto e apresente as informações deste objeto no
	 * console.
	 * */
	int numero;											
	String cpf;										
	double saldo;									
	String tipo;
	String primeiroNome;
	
	//boolean ativa = true;	
	
	public void Dados() {
		System.out.println("--------------------------------------");
		System.out.println("         DADOS DA CONTA:            ");
		System.out.println("--------------------------------------");
		System.out.println("Número da conta: "+ numero);
		System.out.println("Nome: "+ primeiroNome);
		System.out.println("CPF do cliente: " + cpf);
		System.out.println("Tipo de Conta: " + tipo);
		System.out.println("Saldo: R$  " + saldo);
		System.out.println("Limite: R$ 1000,00");
		System.out.println("--------------------------------------");
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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
	
	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
		
	}

	public String getCpf() {
		return cpf;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = "Yuri";
	}
	
}