package CLASSES;

public class ContaEspecial extends Conta{ 	//Yuri Mina Rampazo
	//ATRIBUTO DA SUB 
	private double limite;
	//CONSTRUTOR - SOBRECARGA
	public ContaEspecial(int numero, String cpf,boolean ativa, double limite) {
		super(numero, cpf, ativa);
		this.limite = limite;
	}
	//ENCAPSULAMENTO
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = 1000.00;
	}
	
	//MÉTODO especial SITUAÇÃO ESPECIAL, CASO SEJA UTILIZADO O LIMIT
	public void usarLimite (double valor) {
				
		if (valor > super.getSaldo() && valor <= super.getSaldo() + limite) {
			System.out.println("Seu saldo acabou, a partir de agora você está utilizando o limite da conta especial.");
			double dif = 0.00;
			dif = valor - super.getSaldo();
			
			limite = limite - dif;
			super.credito(dif);
			
			System.out.printf("Saque de R$ %.2f. Retire seu dinheiro abaixo! \n", valor);
			System.out.printf("Saldo Disponível R$ %.2f \n", super.getSaldo());
			System.out.printf("Limite Disponível R$ %.2f \n", this.limite);
		} 
	
	}
	@Override
	public void debito (double valor) { 
		for (int i = 0; i <15; i++) {
			System.out.println();
		}
		if (this.saldo >= valor) {
		this.saldo = this.saldo - valor;
		System.out.printf("Saque de R$ %.2f. Retire seu dinheiro abaixo! \n", valor);
		System.out.println();
		System.out.printf("Saldo Disponível: R$ %.2f \n", this.saldo);
		System.out.println("Limite Disponível: "+ limite);
		}
		else if (valor > saldo) {
			for (int i = 0; i <15; i++) {
				System.out.println();
			}System.out.println("Saldo insuficiente. Operação inválida");
		}
	}
	public void credito(double valor) {
		for (int i = 0; i <15; i++) {
			System.out.println();
		}
		System.out.println("Limite Disponível: "+ limite);
		this.saldo = this.saldo + valor;
		System.out.printf("Depósito realizado no valor de: R$ %.2f ", valor);
		System.out.printf("Saldo Disponível: R$ %.2f \n",saldo);
		System.out.println();
		
	}
}