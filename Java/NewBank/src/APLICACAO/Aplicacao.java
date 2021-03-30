package APLICACAO;

import java.util.*;
import CLASSES.ContaEspecial;

public class Aplicacao {
	static Scanner leia = new Scanner(System.in);
	static int tipoConta, opcaoContas, opcaoOperacao;
	static short opcaoAtividade;
	static char opcaoContinuar = 'S';
	static boolean ativa = true;

	public static void pararAtividade() {

		System.out.println("Deseja continuar? [S/N]: ");
		opcaoContinuar = leia.next().toUpperCase().charAt(0);
		if (opcaoContinuar == 'N') {
			System.out.println("|============================================|");
			System.out.println("|   Obrigado por utilizar o BANCO GEN18 G-08 |");
			System.out.println("|============================================|");
			System.exit(0);
		}
	}
	public static short verificarAtividade(char opcaoContinuar, short opcaoAtividade, boolean ativa) {
		System.out.println("Digite 1 - Conta Ativa  ou  2 - Conta Inativa:");
		opcaoAtividade = leia.nextShort();
		if (opcaoAtividade == 1) {
			ativa = true;
			System.out.println("Conta ativada. Por favor, aguarde um momento");
		} else if (opcaoAtividade == 2) {
			ativa = false;
			System.out.println("|============================================|");
			System.out.println("|            CONTA NEW BANK INATIVA          |");
			System.out.println("|--------------------------------------------|");
			System.out.println("|Para abrir uma nova conta, acesse nosso App |");
			System.out.println("|Aguardamos seu retorno ansiosamente!        |");
			System.out.println("|============================================|");
			System.exit(0);
		}
		return opcaoAtividade;
	}
	public static void limparTela() {
		for (int i = 0; i < 15; i++) {
			System.out.println();
		}
	}
	public static String inserirCPF(String cpf) {
		System.out.print("Insira o número do CPF:");
		cpf = leia.next();
		limparTela();
		return cpf;
	}
	public static int mostrarMenu() {
		System.out.println("|============================================|");
		System.out.println("|             [ NEW BANK G-08 ]              |");
		System.out.println("|   ---> Aqui seu dinheiro têm VALOR! <---   |");
		System.out.println("|--------------------------------------------|");
		System.out.println("| [1] - VERIFICAR SALDO                      |");
		System.out.println("| [2] - CREDITAR VALOR                       |");
		System.out.println("| [3] - DEBITAR VALOR                        |");
		System.out.println("| [4] - OPERAÇÃO EXCLUSIVA                   |");
		System.out.println("| [5] - SAIR                                 |");
		System.out.println("|============================================|");
		System.out.println("|                                            |");
		System.out.print("|  DIGITE O CÓDIGO DA OPÇÃO SELECIONADA:     |");
		opcaoOperacao = leia.nextInt();
		limparTela();
		return opcaoOperacao;
	}
	public static int acessarConta(int numero) {
		System.out.println("|--------------------------------------------|");
		System.out.println("|             [ NEW BANK G-08 ]              |");
		System.out.println("|   ---> Aqui seu dinheiro têm VALOR! <---   |");
		System.out.println("|============================================|");
		System.out.print("Digite o numero da sua conta: ");
		return numero = leia.nextInt();
	}
	public static int mostrarContas() {

		System.out.println("|============================================|");
		System.out.println("|             [ NEW BANK G-08 ]              |");
		System.out.println("|   ---> Aqui seu dinheiro têm VALOR! <---   |");
		System.out.println("|--------------------------------------------|");
		System.out.println("| [1] - CONTA POUPANÇA                       |");
		System.out.println("| [2] - CONTA CORRENTE                       |");
		System.out.println("| [3] - CONTA ESPECIAL                       |");
		System.out.println("| [4] - CONTA EMPRESA                        |");
		System.out.println("| [5] - CONTA ESTUDANTIL                     |");
		System.out.println("| [6] - SAIR                                 |");
		System.out.println("|============================================|");
		System.out.println("|                                            |");
		System.out.print("|  DIGITE O CÓDIGO DA OPÇÃO SELECIONADA:     |");
		tipoConta = leia.nextInt();
		limparTela();
		return tipoConta;
	}

	public static void main(String[] args) {
		String cpf = "";
		int numero = 0;
		double valor = 0;
		do {
			opcaoContas = mostrarContas();
			limparTela();
			switch (tipoConta) {
			case 3: {
				limparTela();
				double limite = 1000;
				int i = 10;
				ContaEspecial contaEspecial = new ContaEspecial(numero, cpf, ativa, limite);
				System.out.println("|============================================|");
				System.out.println("|             { CONTA  ESPECIAL}             |");
				limparTela();
				acessarConta(numero);
				inserirCPF(cpf);
				verificarAtividade(opcaoContinuar, opcaoAtividade, ativa);
				opcaoOperacao = mostrarMenu();
				do {
					switch (opcaoOperacao) {

					case 1: {
						limparTela();
						contaEspecial.consultarSaldo();
					} break;
					case 2: {
						limparTela();
						System.out.print("Digite o valor da operação: R$ ");
						valor = leia.nextDouble();
						contaEspecial.creditar(valor);
					} break;
					case 3: {
						limparTela();
						System.out.print("Digite o valor da operação: R$ ");
						valor = leia.nextDouble();
						if (valor > contaEspecial.getSaldo()
								&& valor <= (contaEspecial.getLimite() + contaEspecial.getSaldo())) {
							contaEspecial.usarLimite(valor);
						} else if (valor <= contaEspecial.getSaldo()) {
							contaEspecial.debitar(valor);
							System.out.printf("Limite Dispnível: R$ %.2f ", contaEspecial.getLimite());
						}
					} break;
					case 4: {
						limparTela();
						ContaEspecial.informarLimite(4);
					} break;
					case 5: {
						limparTela();
						pararAtividade();
					} break;
					default: {
						limparTela();
						System.out.println("Opção inválida");
					} break;
					}
					
				} while (i == 0);
			}
			}
			
			
			
			
			
			
			
			
			
		} while (opcaoContas == 6);
	}
}
