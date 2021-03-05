package CLASSES;

public class ContaEstudantil extends Conta{

	
		
	public ContaEstudantil(int numero, String cpf, boolean ativa) {
		super(numero, cpf, ativa);
		// TODO Auto-generated constructor stub
	}
	public ContaEstudantil(int numero, String cpf) {
		super(numero, cpf);
		// TODO Auto-generated constructor stub
	}
	public ContaEstudantil(int numero) {
		super(numero);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void debito (double valor) {
		if (this.saldo >= valor) {
		this.saldo = this.saldo - valor;
		}
	}
}