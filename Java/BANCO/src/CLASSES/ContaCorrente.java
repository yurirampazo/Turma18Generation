package CLASSES;

public class ContaCorrente extends Conta {
	private int contadorTalao;
	public ContaCorrente(int numero, String cpf, int contadorTalao) {
		super(numero, cpf);
		this.contadorTalao = contadorTalao;
		
	}

	public ContaCorrente(int numero) {
		super(numero);

	}

	public int getContadorTalao() {
		return contadorTalao;
	}

	public void setContadorTalao(int contadorTalao) {
		this.contadorTalao = contadorTalao;
	}
	
	//MÉTODO PARA PEDIR TALÃO
	public void pediTalao(double valorTalao) {
	
	}
}