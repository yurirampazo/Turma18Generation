package APLICACAO;

import java.util.Calendar;
import java.util.Scanner;

import CLASSES.ContaEspecial;
import CLASSES.ContaPoupanca;


public class Teste {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String cpf= "";
		int numero = 0,diaAniversarioPoupanca = 0;//conta poupanca 
		double valor[] = new double [9];
		final double limite = 1000; //Conta especial
		char opcao,opcao1;
		boolean ativa = true;
		 
		ContaPoupanca contaPoupanca = new ContaPoupanca(numero,cpf,ativa,diaAniversarioPoupanca);
		//ContaCorrente contaCorrente = new ContaCorrente(numero,cpf,ativa,contadorTalao);
		ContaEspecial contaEspecial = new ContaEspecial(numero,cpf,ativa,limite);
		
		
		//TELA 1
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
				//CASO SEJA CONTA POUPANÇA	
				for (int i = 0; i < 15; i++) {
					System.out.println();
				}
				do {
					System.out.println("|============================================|");
					System.out.println("|              [ BANCO G-08 ]                |");
					System.out.println("|   ---> Aqui seu dinheiro têm VALOR! <---   |");
					System.out.println("|--------------------------------------------|");	
					System.out.println("|             { CONTA POUPANÇA }             |");
					System.out.println("|============================================|");
					System.out.println();
					System.out.print("Digite o numero da sua conta: ");
					numero = leia.nextInt();
					
					System.out.print("Insira o número do CPF:");  										
			    	cpf = leia.next();
					
					
					System.out.println("Digite 1 - Conta Ativa  ou  2 - Conta Inativa:");  												
					opcao1 = leia.next().charAt(0);
					if (opcao1 == '1') {
						
						ativa = true;
						System.out.println("Conta ativada.");
						} 
						else {
						ativa = false;
						System.out.println("Conta DESATIVADA!!!");
						break;
						}
						
					//TELA 2
					System.out.println("BANCO GEN-18 \nAQUI SEU DINHEIRO TEM VALOR!");
					System.out.println("CONTA POUPANÇA");
					
					System.out.print("Saldo Atual: R$ " + contaPoupanca.getSaldo());
					System.out.println();
					//CALCULO DO SALDO
					
					
					
					for (int i = 0; i < 10; i++) {	
						System.out.print("Digite o valor da operação: R$ ");
						
						valor[i] = leia.nextDouble();
						System.out.print("Débito ou crédito? [D/C]: ");
						opcao = leia.next().toUpperCase().charAt(0);
						if (opcao == 'D') {
							contaPoupanca.debito(valor[i]);
						}
						else if (opcao == 'C') {
							contaPoupanca.credito(valor[i]);
						}	else {
							System.out.println("Opção inválida!");
							break;
						}
						
						
						System.out.println((i + 1) + "º Movimento. Deseja continuar? [S/N]: ");
						opcao1 = leia.next().toUpperCase().charAt(0);
					} 	
				} while (opcao1 == 'N');	
			} break;
		
		case 3: {
			
			//CASO SEJA CONTA ESPECIAL	
			for (int i = 0; i < 15; i++) {
				System.out.println();
			}
			do {
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
				opcao1 = leia.next().charAt(0);
				if (opcao1 == '1') {
					
					ativa = true;
					System.out.println("Conta ativada.");
					} 
					else {
					ativa = false;
					System.out.println("Conta DESATIVADA!!!");
					break;
					}
				
				System.out.print("Saldo Atual: R$ " + contaEspecial.getSaldo());
				System.out.println();
				//CALCULO DO SALDO
				
				for (int i = 0; i < 10; i++) {	
					System.out.print("Digite o valor da operação: R$ ");
					valor[i] = leia.nextDouble();
					System.out.print("Débito ou crédito? [D/C]: ");
					opcao = leia.next().toUpperCase().charAt(0);
					if (opcao == 'D') {
						contaEspecial.debito(valor[i]);
					}
					else if (opcao == 'C') {
						contaEspecial.credito(valor[i]);
					}	else {
						System.out.println("Opção inválida!");
					}
					contaEspecial.usarLimite(valor[i]);
					
					System.out.println((i + 1)+ "º Movimento. Deseja continuar? [S/N]: ");
					opcao1 = leia.next().toUpperCase().charAt(0);
					for (int x = 0; x < 15; x++) {
						System.out.println();
					}
					if(opcao1 == 'N') {
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
			}while (opcao1 == 'N');
					
											
			
				//} while (opcao1 == 'N');	
		
		} break;
		
		default: {
			System.out.println("Opção inválida!");
		} break;
		
		} 
	leia.close();
	}
}