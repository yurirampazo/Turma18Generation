package CLASSES;

import APLICACAO.Aplicacao;

public class Conta {
	private int numero;
	private String cpf;
	private double saldo;
	private boolean ativa;
	private int contador = 0;

	// CONSTRUTORES
	public Conta(int numero, String cpf) {
		this.numero = numero;
		this.cpf = cpf;
	}

	public Conta(int numero) {
		this.numero = numero;
	}

	public Conta(int numero, String cpf, boolean ativa) {
		this.numero = numero;
		this.cpf = cpf;
		this.ativa = ativa;
	}

	// ENCAPSULAMENTO
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

	// SET SALDO REMOVIDO. MÁXIMA DO PROJETO
	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
	/* CONTADOR DE TRANSACAO */
	public void setContador(int contador) {
		this.contador = contador;	
	}
	
	public int getContador() {
		return this.contador;
	}

	// METODOS
	public void creditar(double valor) {
		if (valor > 0 ) {
		Aplicacao.limparTela();
			this.saldo = this.saldo + valor;
			System.out.println("|============================================|");
			System.out.println("|             DEPÓSITO REALIZADO.            |"); 
			System.out.println("|--------------------------------------------|");
			System.out.printf("        [ VALOR CREDITADO: R$ %.2f ]      ", valor);
			System.out.println("                                             ");
			this.setContador(this.getContador() + 1);	 /*CONTADOR*/
		}
		else if (valor <= 0) {		
			this.saldo += 0; 
			System.out.println("|--------------------------------------------|");
			System.out.println("|       VALOR INVÁLIDO PARA DEPÓSITO         |");
			System.out.println("|--------------------------------------------|");
		}		
	}

	public void debitar(double valor) {
		Aplicacao.limparTela();
		if (this.getSaldo() >= valor) {
			this.saldo = this.saldo - valor;
			this.setContador(this.getContador() + 1);	 /*CONTADOR*/	
		
		} else if (valor > saldo) {	
			System.out.println("|--------------------------------------------|");
			System.out.println("|              OPERAÇÃO INVÁLIDA:            |");
			System.out.println("|--------------------------------------------|");
			System.out.println("|              SALDO INSUFICIENTE            |");
			System.out.println("|--------------------------------------------|");
		
		} else if (valor <= 0) {		
			this.saldo += 0; 
			System.out.println("|--------------------------------------------|");
			System.out.println("|       VALOR INVÁLIDO PARA DEPÓSITO         |");
			System.out.println("|--------------------------------------------|");
		}		
	}
	

	public void consultarSaldo() {
		System.out.println("|============================================|");
		System.out.printf("       [ SALDO DISPONÍVEL:  R$  %.2f ] \n",this.getSaldo());
	}		 
}