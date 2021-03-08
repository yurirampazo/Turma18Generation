package CLASSES;

public class ContaEstudantil extends Conta {//Diego
	private double limiteEstudantil= 5000.00;
	
	public ContaEstudantil ( int numero, String cpf,boolean ativa,	 double limiteEstudantil) {
		super(numero,cpf);
		this.limiteEstudantil = limiteEstudantil;
	}

	public double getLimiteEstudantil() {
		return limiteEstudantil;
	}

	public void setLimiteEstudantil(double limiteEstudantil) {
		this.limiteEstudantil = limiteEstudantil;
}	/*
	public void  usarEstudantil () {
		double valor = 0.00;
		super.getSaldo();
		if(super.getSaldo() != super.getSaldo()) {
			for(int i = 0;i<10;i++)
			{
				valor = super.getSaldo()+limiteEstudantil;
				super.credito(valor);
			}*/
		
	public void usarLimite (double valor) {
		
		if (valor > super.getSaldo() && valor <= super.getSaldo() + limiteEstudantil) {
			System.out.println("Seu saldo acabou, a partir de agora você está utilizando o limite da conta especial.");
			double dif = 0.00;
			dif = valor - super.getSaldo();
			
			limiteEstudantil = limiteEstudantil - dif;
			super.credito(dif);
			
			System.out.printf("Saque de R$ %.2f. Retire seu dinheiro abaixo! \n", valor);
			System.out.printf("Saldo Disponível R$ %.2f \n", super.getSaldo());
			System.out.printf("Limite Disponível R$ %.2f \n", this.limiteEstudantil);
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
				System.out.println("Limite Disponível: "+ limiteEstudantil);
				}
				else if (valor > saldo) {
					for (int i = 0; i <15; i++) {
						System.out.println();
					}System.out.println("Saldo insuficiente. Operação inválida");
				}
			}
			public void usarEstudantil(double valor) {
				if (limiteEstudantil >= valor) {
					limiteEstudantil = limiteEstudantil - valor;
					saldo = saldo + valor;
					System.out.printf("Empréstimo no valor de %.2f realizado com sucesso!\n", valor);
				}
				else {
					System.out.printf("Você não possui limite de empréstimo suficiente para realizar a movimentação.\n");
				}
			//	public amostra();
				//return limiteEstudantil;
				
			}
}
