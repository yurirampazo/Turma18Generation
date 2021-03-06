package APLICACAO;



import java.util.Scanner;

import CLASSES.ContaEspecial;
import CLASSES.ContaPoupanca;


public class Teste {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String cpf= "";
		int numero = 0, diaAniversarioPoupanca = 0;
		double valor[] = new double [9];
		final double limite = 1000; //Conta especial
		char opcaoPagamento,opcaoContinuar = 'S', opcaoContaAtivaNaoAtiva;
		boolean ativa = true;
		 
		ContaPoupanca contaPoupanca = new ContaPoupanca(numero,cpf,ativa, diaAniversarioPoupanca);
		//ContaCorrente contaCorrente = new ContaCorrente((numero,cpf,ativa,contadorTalao);
		ContaEspecial contaEspecial = new ContaEspecial(numero,cpf,ativa,limite);
		//ContaEmpresa contaEmpresa = new ContaEmpresa(numero,cpf,ativa,emprestimoEmpresa);
		//ContaEstudantil contaEstudantil = new ContaEstudantil(numero,cpf,ativa,limiteEstudantil);
	
		//ATT:  ASSIM QUE AS CLASSES ESTIVEREM PRONTAS UNIMOS ELAS AO PROJETO.
		//TELA 1 PARA TODAS SEGUE O MESMO PADRÃO, FAVOR ACRESCENTAR A APLICAÇÃO DE SUAS RESPECTIVAS CLASSES. MUITO OBRIGADO!
		
		do {
			System.out.println("|============================================|");
			System.out.println("|              [ BANCO G-08 ]                |");
			System.out.println("|   ---> Aqui seu dinheiro têm VALOR! <---   |");
			System.out.println("|--------------------------------------------|");
			System.out.println("| [1] - CONTA POUPANÇA                       |");
			System.out.println("| [2] - CONTA CORRENTE                       |");
			System.out.println("| [3] - CONTA ESPECIAL                       |");
			System.out.println("| [4] - CONTA EMPRESA                        |");
			System.out.println("| [5] - CONTA ESTUDANTIL                     |");
			System.out.println("|============================================|");
			System.out.println("|                                            |");
			System.out.print  ("|  DIGITE O CÓDIGO DA OPÇÃO SELECIONADA:     |");
		
			int tipoConta = leia.nextInt();
			// SELEÇÃO DO TIPO DE CONTA
			switch (tipoConta) {
			case 1: {
				System.out.println("|============================================|");
				System.out.println("|              [ BANCO G-08 ]                |");
				System.out.println("|   ---> Aqui seu dinheiro têm VALOR! <---   |");
				System.out.println("|--------------------------------------------|");
				System.out.println("|             { CONTA POUPANÇA }             |");
				System.out.println("|============================================|");
				System.out.print("Digite o numero da sua conta: ");
				numero = leia.nextInt();
				
				System.out.print("Insira o número do CPF:");  										
		    	cpf = leia.next();
				
				
				System.out.println("Digite 1 - Conta Ativa  ou  2 - Conta Inativa:");  												
				opcaoContaAtivaNaoAtiva = leia.next().charAt(0);
				if (opcaoContaAtivaNaoAtiva == '1') {
					
					ativa = true;
					System.out.println("Conta ativada.");
					} 
					else {
					ativa = false;
					System.out.println("Conta DESATIVADA!!!");
					break;
					}
				
				
			}break;
			
			case 2 : {
				
				System.out.println("|============================================|");
				System.out.println("|              [ BANCO G-08 ]                |");
				System.out.println("|   ---> Aqui seu dinheiro têm VALOR! <---   |");
				System.out.println("|--------------------------------------------|");
				System.out.println("|             { CONTA CORRENTE }             |");
				System.out.println("|============================================|");
				System.out.print("Digite o numero da sua conta: ");
				numero = leia.nextInt();
				
				System.out.print("Insira o número do CPF:");  										
		    	cpf = leia.next();
				
				
				System.out.println("Digite 1 - Conta Ativa  ou  2 - Conta Inativa:");  												
				opcaoContaAtivaNaoAtiva = leia.next().charAt(0);
				if (opcaoContaAtivaNaoAtiva == '1') {
					
					ativa = true;
					System.out.println("Conta ativada.");
					} 
					else {
					ativa = false;
					System.out.println("Conta DESATIVADA!!!");
					break;
					}
				
			} break;
						
			case 3: {
				
				//CASO SEJA CONTA ESPECIAL	
				for (int i = 0; i < 15; i++) {
					System.out.println();
				}
				
					System.out.println("|============================================|");
					System.out.println("|              [ BANCO G-08 ]                |");
					System.out.println("|   ---> Aqui seu dinheiro têm VALOR! <---   |");
					System.out.println("|--------------------------------------------|");
					System.out.println("|             { CONTA ESPECIAL }             |");
					System.out.println("|============================================|");
					System.out.print("Digite o numero da sua conta: ");
					numero = leia.nextInt();
					
					System.out.print("Insira o número do CPF:");  										
			    	cpf = leia.next();
					
					
					System.out.println("Digite 1 - Conta Ativa  ou  2 - Conta Inativa:");  												
					opcaoContaAtivaNaoAtiva = leia.next().charAt(0);
					if (opcaoContaAtivaNaoAtiva == '1') {
						
						ativa = true;
						System.out.println("Conta ativada.");
						} 
						else {
						ativa = false;
						System.out.println("Conta DESATIVADA!!!");
						break;
						}
					
					//CALCULO DO SALDO
					
						for (int i = 0; i <= 10; i++) {	
						System.out.print("Digite o valor da operação: R$ ");
						valor[i] = leia.nextDouble();
						System.out.print("Débito ou crédito? [D/C]: ");
						opcaoPagamento = leia.next().toUpperCase().charAt(0);
						if (opcaoPagamento == 'D') {
							contaEspecial.debito(valor[i]);
						}
						else if (opcaoPagamento == 'C') {
							contaEspecial.credito(valor[i]);
						}	else {
							System.out.println("Opção inválida!");
						}
						contaEspecial.usarLimite(valor[i]);
						
						System.out.println((i + 1)+ "º Movimento. Deseja continuar? [S/N]: ");
						opcaoContinuar = leia.next().toUpperCase().charAt(0);
						}
						if(opcaoContinuar == 'N') {
							System.out.println("|============================================|");
							System.out.println("|       Obrigado por utilizar o banco G-08   |");
							System.out.println("|============================================|");
							break;
						}
							
					}
										
					System.out.println("|   Limite de transações diárias atingido.   |");
					System.out.println("|============================================|");
					System.out.println("|       Obrigado por utilizar o banco G-08   |");
					System.out.println("|============================================|");
					break;
			case 4 : {
				
				System.out.println("|============================================|");
				System.out.println("|              [ BANCO G-08 ]                |");
				System.out.println("|   ---> Aqui seu dinheiro têm VALOR! <---   |");
				System.out.println("|--------------------------------------------|");
				System.out.println("|             { CONTA EMPRESA }    	         |");
				System.out.println("|============================================|");
				System.out.print("Digite o numero da sua conta: ");
				numero = leia.nextInt();
				
				System.out.print("Insira o número do CPF:");  										
		    	cpf = leia.next();
				
				
				System.out.println("Digite 1 - Conta Ativa  ou  2 - Conta Inativa:");  												
				opcaoContaAtivaNaoAtiva = leia.next().charAt(0);
				if (opcaoContaAtivaNaoAtiva == '1') {
					
					ativa = true;
					System.out.println("Conta ativada.");
					} 
					else {
					ativa = false;
					System.out.println("Conta DESATIVADA!!!");
					break;
					}
				
			} break;
			
			case 5: {
				
				System.out.println("|============================================|");
				System.out.println("|              [ BANCO G-08 ]                |");
				System.out.println("|   ---> Aqui seu dinheiro têm VALOR! <---   |");
				System.out.println("|--------------------------------------------|");
				System.out.println("|            { CONTA ESTUDANTIL }            |");
				System.out.println("|============================================|");
				System.out.print("Digite o numero da sua conta: ");
				numero = leia.nextInt();
				
				System.out.print("Insira o número do CPF:");  										
		    	cpf = leia.next();
				
				
				System.out.println("Digite 1 - Conta Ativa  ou  2 - Conta Inativa:");  												
				opcaoContaAtivaNaoAtiva = leia.next().charAt(0);
				if (opcaoContaAtivaNaoAtiva == '1') {
					
					ativa = true;
					System.out.println("Conta ativada.");
					} 
					else {
					ativa = false;
					System.out.println("Conta DESATIVADA!!!");
					break;
					}
				
			} break;
			
			default: {

				System.out.println("Opção inválida!");
				break;
			} 
			
			} 
			
			System.out.println("Deseja continuar? [S/N]: ");
			opcaoContinuar = leia.next().toUpperCase().charAt(0);
			
		
		
		}while (opcaoContinuar == 'N');
		leia.close();	
	}
}