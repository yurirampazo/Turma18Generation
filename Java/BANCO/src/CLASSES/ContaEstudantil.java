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
}	


	public double usarEstudantil(double valor) {
		if (super.getSaldo() < valor && valor <= super.getSaldo() + limiteEstudantil) {
			double dif = 0;
			dif = valor - super.getSaldo();
			limiteEstudantil = limiteEstudantil - dif;
			super.credito(dif);
			System.out.printf("Saque de R$ %.2f. Retire seu dinheiro abaixo! \n", valor);
			System.out.printf("Saldo Disponível R$ %.2f \n", super.getSaldo());
			System.out.printf("Limite Disponível R$ %.2f \n", this.limiteEstudantil);
		}
	
		return limiteEstudantil;
		
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
				System.out.println("Limite Disponível: "+ limiteEstudantil);
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
