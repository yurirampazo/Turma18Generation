package CLASSES;

import APLICACAO.Aplicacao;

public class ContaEspecial extends Conta{
	// ATRIBUTO DA SUB
	private double limite;

	// CONSTRUTOR - SOBRECARGA
	public ContaEspecial(int numero, String cpf, boolean ativa, double limite) {
		super(numero, cpf, ativa);
		this.limite = limite;
	}

	// ENCAPSULAMENTO
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = 1000.00;
	}

	// MÉTODO especial SITUAÇÃO ESPECIAL, CASO SEJA UTILIZADO O LIMIT
	public void usarLimite(double valor) {
		Aplicacao.limparTela();
		if (super.getSaldo() < valor && valor <= super.getSaldo() + limite) {
			System.out.println("Seu saldo acabou, a partir de agora você está utilizando o limite da conta especial.");
			double dif = 0.00;
			dif = valor - super.getSaldo();

			limite -= dif;
			super.creditar(dif);

			System.out.printf("Saque de R$ %.2f. Retire seu dinheiro abaixo! \n", valor);
			System.out.printf("Saldo Disponível R$ %.2f \n", super.getSaldo());
			System.out.printf("Limite Disponível R$ %.2f \n", this.limite);
		}
	}
	
	public static void informarLimite(int caseFour) {
		System.out.println("|============================================|");
		System.out.println("|   OPERAÇÃO EXCLUSIVA PARA CONTA ESPECIAL   |");
		System.out.println("|--------------------------------------------|");
		System.out.println("|               LIMITE ESPECIAL:             |");
		System.out.println("| O New Bank proporciona aos clientes que    |");
		System.out.println("| adereiram  esse tipo de conta, possam usar |");
		System.out.println("| um limite especial de R$ 1000,00.          |");
		System.out.println("|--------------------------------------------|");
		System.out.println("| COMO UTILIZAR?                             |");
		System.out.println("| Basta realizar um saque ou débito com um   |");
		System.out.println("| valor maior que o valor do saldo em conta. |");
		System.out.println("| O limite não poderá ser utilizado caso o   |");
		System.out.println("| valor solicitado exceda o saldo somado ao  |");
		System.out.println("| próprio limite                             |");
		System.out.println("|============================================|");
	}
}
