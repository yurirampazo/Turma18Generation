package CLASSE;

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
		
	
	
	
	public void credito(double creditar) {
		if(creditar > 0) {
			this.saldo = this.getSaldo() + creditar;
			System.out.printf("R$ %.2f creditados na sua conta!\n", creditar);
			//System.out.printf("Saldo atual R$ %.2f\n", this.getSaldo());
			System.out.println();
			
		}else if(creditar == 0) {
			System.out.printf("O valor R$ %.2f depositado deve ser maior que R$ 0,00 \n", creditar);
			System.out.println("Transacao bloqueada");
			
		}else if(creditar < 0) {
			System.out.printf("O valor R$ %.2f depositado deve positivo \n", creditar);
			System.out.println("Transacao bloqueada");
		}
		
	
	}
	@Override
	 // SITUAÇÃO NORMAL EM QUE O SALDO É MAIOR QUE O VALOR DEBITADO!
	public void debito (double valor) { 
		if (this.saldo >= valor) {
		this.saldo = this.saldo - valor;
		System.out.printf("Saque de R$ %.2f. Retire seu dinheiro abaixo! \n", valor);
		System.out.println();
		System.out.printf("Saldo R$ %.2f \n", this.getSaldo());
		}
		else if (valor > saldo) {
			System.out.println("Saldo insuficiente. Procure um atendente ou faça um depósito na conta.");
			
			//System.out.println("Deseja utilizar o limite? ");
			
		}
	}
	
	//SITUAÇÃO ESPECIAL, CASO SEJA UTILIZADO O LIMITE
	
	public  void debito (double valor, double limite) {
		System.out.printf("Saldo atual R$ %.2f \n", this.getSaldo());
		System.out.println();
		
		if (valor < limite && saldo <= 0) {
			System.out.printf("Limite disponível: %.2f" , limite);
			this.saldo = this.limite;
			this.saldo = this.saldo - valor;
			System.out.printf("Saque realizado. Valor utilizado do limite: R$ %.2f", valor);
		}
		else if (valor > limite) {
			for (int i = 0; i <15; i++) {
				System.out.println();
			}
			this.limite = 0.00;
			this.saldo = 0.00;
			System.out.println("Saldo insuficiente. Procure um atendente ou faça um depósito na conta.");
		}
	
	}
}
