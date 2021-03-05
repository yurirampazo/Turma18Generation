package CLASSES;

public class ContaCorrente extends Conta {
	private int contadorTalao;
	public ContaCorrente(int numero, String cpf) {
		super(numero, cpf);
		// TODO Auto-generated constructor stub
	}

	public ContaCorrente(int numero) {
		super(numero);
		// TODO Auto-generated constructor stub
	}

	public int getContadorTalao() {
		return contadorTalao;
	}

	public void setContadorTalao(int contadorTalao) {
		this.contadorTalao = contadorTalao;
	}
}