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

	// M�TODO especial SITUA��O ESPECIAL, CASO SEJA UTILIZADO O LIMITE
	public double usarLimite(double valor) {
		Aplicacao.limparTela();
		if (super.getSaldo() < valor && valor <= super.getSaldo() + limite) {
			double dif = valor - super.getSaldo();
			limite -= dif;
			super.creditar(dif);
			super.debitar(valor);
			setContador(getContador() - 1);  // REAJUSTA O CONTADOR QUE SER� SOMADO DUAS VEZES COM O M�TODO USAR LIMITE QUE ACESSA 2X O CONTADOR	
			
		} else if ( valor > super.getSaldo() + limite) {
			System.out.println("|--------------------------------------------|");
			System.out.println("|              OPERA��O INV�LIDA:            |");
			System.out.println("|--------------------------------------------|");
			System.out.println("|              SALDO INSUFICIENTE            |");
			System.out.println("|--------------------------------------------|");
		}	
		return limite;
	}
	
	public static void informarLimite(int caseFour) {
		System.out.println("|============================================|");
		System.out.println("|   OPERA��O EXCLUSIVA PARA CONTA ESPECIAL   |");
		System.out.println("|--------------------------------------------|");
		System.out.println("|               LIMITE ESPECIAL:             |");
		System.out.println("| O New Bank proporciona aos clientes que    |");
		System.out.println("| adereiram  esse tipo de conta, um limite   |");
		System.out.println("| dispon�vel no valor de R$ 1000,00.         |");
		System.out.println("|--------------------------------------------|");
		System.out.println("| COMO UTILIZAR?                             |");
		System.out.println("| Basta realizar um saque ou d�bito com um   |");
		System.out.println("| valor maior que o valor do saldo em conta. |");
		System.out.println("| O limite n�o poder� ser utilizado caso o   |");
		System.out.println("| valor solicitado exceda o saldo somado ao  |");
		System.out.println("| pr�prio limite.                            |");
	}
	
	@Override 
	public void consultarSaldo() {
		System.out.println("|============================================|");
		System.out.printf("       [ SALDO DISPON�VEL:  R$  %.2f ]  ",super.getSaldo());
		System.out.println(" ");
		System.out.println("|--------------------------------------------|");
		System.out.printf("       [ LIMITE DISPON�VEL: R$ %.2f  ] ",this.getLimite());
		System.out.println(" ");
	}	
}