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
				
		if (valor > super.getSaldo() && valor <= (super.getSaldo() + limite)) {
			System.out.println("Seu saldo acabou, a partir de agora você está utilizando o limite da conta especial.");
			double dif = 0.00;
			dif = valor - super.getSaldo();
			
			limite = limite - dif;
			super.credito(dif);
			
			System.out.printf("Saque de R$ %.2f. Retire seu dinheiro abaixo! \n", valor);
			System.out.printf("Saldo R$ %.2f \n", super.getSaldo());
			System.out.printf("Limite R$ %.2f \n", this.limite);
		} 
	}
}