package CLASSES;

public class ContaEmpresa extends Conta {
	
	private double emprestimoEmpresa;

	public ContaEmpresa(int numero, String cpf, boolean ativa, double emprestimoEmpresa) {
		super(numero, cpf, ativa);
		this.emprestimoEmpresa = emprestimoEmpresa;
	}


	public double getEmprestimoEmpresa() {
		return emprestimoEmpresa;
	}
	
	public void setEmprestimoEmpresa(double emprestimoEmpresa) {
		this.emprestimoEmpresa = emprestimoEmpresa;
	}
	
	public void pedirEmprestimo(double valor) {
		// double saldo = super.getSaldo();
		if (valor <= super.getSaldo() + emprestimoEmpresa) {
			System.out.println("Seu saldo acabou, a partir de agora voc� est� utilizando o limite da conta empresa.");
			double dif = 0.00;
			dif = valor - super.getSaldo();

			emprestimoEmpresa = emprestimoEmpresa - dif;
			super.creditar(dif);

			System.out.printf("Saque de R$ %.2f. Retire seu dinheiro abaixo! \n", valor);
			System.out.printf("Saldo Dispon�vel R$ %.2f \n", super.getSaldo());
			System.out.printf("Limite para empr�stimo: R$ %.2f \n", this.emprestimoEmpresa);
		}
	}
}