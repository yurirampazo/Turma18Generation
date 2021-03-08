package CLASSES;

public class ContaEmpresa extends Conta{ 	//Lucas Zamora
	//ATRIBUTO DA SUB 
	private double emprestimoEmpresa;
	//CONSTRUTOR - SOBRECARGA
	public ContaEmpresa(int numero, String cpf,boolean ativa, double emprestimoEmpresa) {
		super(numero, cpf, ativa);
		this.emprestimoEmpresa = emprestimoEmpresa;
	}
	//ENCAPSULAMENTO
	public double getEmprestimoEmpresa() {
		return emprestimoEmpresa;
	}


	public void setEmprestimoEmpresa(double emprestimoEmpresa) {
		this.emprestimoEmpresa = emprestimoEmpresa;
	}
	
	//MÉTODO especial SITUAÇÃO ESPECIAL, CASO SEJA UTILIZADO O LIMIT
	public void pedirEmprestimo (double valor) {
				
		if (valor <= super.getSaldo() + emprestimoEmpresa) {
			System.out.println("Seu saldo acabou, a partir de agora você está utilizando o limite da conta empresa.");
			double dif = 0.00;
			dif = valor - super.getSaldo();
			
			emprestimoEmpresa = emprestimoEmpresa - dif;
			super.credito(dif);
			
			System.out.printf("Saque de R$ %.2f. Retire seu dinheiro abaixo! \n", valor);
			System.out.printf("Saldo Disponível R$ %.2f \n", super.getSaldo());
			System.out.printf("Limite para empréstimo: R$ %.2f \n", this.emprestimoEmpresa);
		} 
	
	}
	


	@Override
	public void debito (double valor) { 
		for (int i = 0; i <15; i++) {
			System.out.println();
		}
		if (this.getSaldo() >= valor) {
		this.saldo = this.saldo - valor;
		System.out.printf("Saque de R$ %.2f. Retire seu dinheiro abaixo! \n", valor);
		System.out.println();
		System.out.printf("Saldo Disponível: R$ %.2f \n", this.saldo);
		
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
		
		this.saldo = this.saldo + valor;
		System.out.printf("Depósito realizado no valor de: R$ %.2f ", valor);
		System.out.printf("Saldo Disponível: R$ %.2f \n",saldo);
		System.out.println();
		
	}
}