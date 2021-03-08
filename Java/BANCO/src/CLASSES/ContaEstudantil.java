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
		double saldo = super.getSaldo();
		if (saldo < valor && valor <= saldo + limiteEstudantil) {
			double dif = 0;
			dif = valor - saldo;
			limiteEstudantil = limiteEstudantil - dif;
			super.credito(dif);
			System.out.printf("Saque de R$ %.2f. Retire seu dinheiro abaixo! \n", valor);
			System.out.printf("Saldo Disponível R$ %.2f \n", saldo);
			System.out.printf("Limite Disponível R$ %.2f \n", this.limiteEstudantil);
		}
	
		return limiteEstudantil;
		
	}
}
