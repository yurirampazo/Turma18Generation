package CLASSES;


public class ContaEspecial extends Conta{
	private double limite;
	
	//CONSTRUTOR - SOBRECARGA
	public ContaEspecial(int numero, String cpf,boolean ativa, double limite) {
		super(numero, cpf);
		this.limite = limite;
	}
	//ENCAPSULAMENTO
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = 1000;
	}
		
	
	
	@Override	
	public void credito(double valor) {
		for (int i = 0; i <15; i++) {
			System.out.println();
		}
		System.out.printf("Dep�sito realizado no valor de: R$ %.2f ", valor);
		this.saldo = this.saldo + valor;
		System.out.printf("Saldo Dispon�vel: R$ %.2f \n", getSaldo());
		System.out.println();
		
	}
		
	@Override
	
	 // SITUA��O NORMAL EM QUE O SALDO � MAIOR QUE O VALOR DEBITADO!
	//SITUA��O ESPECIAL, CASO SEJA UTILIZADO O LIMIT
	public void debito (double valor) { 
		if (this.saldo >= valor) {
		this.saldo = this.saldo - valor;
		System.out.printf("Saque de R$ %.2f. Retire seu dinheiro abaixo! \n", valor);
		System.out.println();
		System.out.printf("Saldo R$ %.2f \n", this.getSaldo());
		}
		else if (valor > saldo && limite >= 0) {
		System.out.println("Seu saldo acabou, a partir de agora voc� est� utilizando o limite da conta especial.");
		this.saldo = limite;
		this.saldo = this.saldo - valor;
		System.out.printf("Saque de R$ %.2f. Retire seu dinheiro abaixo! \n", valor);
		System.out.printf("Saldo R$ %.2f \n", this.getSaldo());
		}
		else if (valor > saldo && valor > limite) {
			System.out.println("Voc� n�o pode realizar essa opera��o. Saldo insuficiente!");
			System.out.printf("Saldo R$ %.2f \n", this.getSaldo());	
		}		
	}
}