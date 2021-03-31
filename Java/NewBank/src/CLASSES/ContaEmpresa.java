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
		this.emprestimoEmpresa = 10000.00;
	}
	
	public double pedirEmprestimo (double valor) {
		// double saldo = super.getSaldo();
		if (valor <= this.emprestimoEmpresa) {
			this.emprestimoEmpresa -= valor;
			super.creditar(valor);
		} else if (valor > this.emprestimoEmpresa ) {
			System.out.println("|--------------------------------------------|");
			System.out.println("|              OPERAÇÃO INVÁLIDA:            |");
			System.out.println("|--------------------------------------------|");
			System.out.println("|        LIMITE EMPRESARIAL INSUFICIENTE     |");
			System.out.println("|--------------------------------------------|");
			
		}
		return emprestimoEmpresa;
	}
	@Override
	public void consultarSaldo() {
		System.out.println("|============================================|");
		System.out.printf("       [ SALDO DISPONÍVEL:  R$  %.2f ]  ",super.getSaldo());
		System.out.println(" ");
		System.out.println("|--------------------------------------------|");
		System.out.printf("   [ LIMITE EMPRESARIAL DISPONÍVEL: R$ %.2f ] ",this.emprestimoEmpresa);
		System.out.println(" ");
	}	
}