package APLICACAO;

import java.util.Scanner;

import CLASSES.ContaEspecial;


public class Teste {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String cpf= "";
		int numero = 0;
		double valor;
		final double limite = 1000;
		char opcao,opcao1;
		boolean ativa = true;
		
		//ContaEspecial contaPoupanca = new ContaEspecial(numero,cpf,ativa,limite,diaAniversarioPoupanca);
		//ContaCorrente contaCorrente = new ContaCorrente(numero,cpf,ativa,contadorTalao);
		ContaEspecial contaEspecial = new ContaEspecial(numero,cpf,ativa,limite);
		
		
		//TELA 1
		System.out.println("-------------------------------------------");
		System.out.println("BANCO GEN-18 \nAQUI SEU DINHEIRO TEM VALOR!");
		System.out.println("-------------------------------------------");
		System.out.println("[1] - CONTA POUPAN�A");
		System.out.println("[2] - CONTA CORRENTE");
		System.out.println("[3] - CONTA ESPECIAL");
		System.out.println("[4] - CONTA EMPRESA");
		System.out.println("[5] - CONTA ESTUDANTIL");
		System.out.println("DIGITE O C�DIGO DA OP��O SELECIONADA: ");
		
		// SELE��O DO TIPO DE CONTA
		int tipoConta = leia.nextInt();
		switch (tipoConta) {
			/*case 1: {
				//CASO SEJA CONTA POUPAN�A	
				for (int i = 0; i < 15; i++) {
					System.out.println();
				}
				do {
					System.out.println("BANCO GEN-18 \nAQUI SEU DINHEIRO TEM VALOR!");
					System.out.println("CONTA POUPAN�A");
					System.out.print("Digite o numero da sua conta: ");
					numero = leia.nextInt();
					
					System.out.print("Insira o n�mero do CPF:");  										
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
					System.out.println("CONTA ESPECIAL");
					System.out.print("Saldo Atual: R$ " + contaPoupanca.getSaldo());
					System.out.println();
					//CALCULO DO SALDO
					
					for (int i = 0; i <10; i++) {	
						System.out.print("Digite o valor da opera��o: R$ ");
						valor = leia.nextDouble();
						System.out.print("D�bito ou cr�dito? [D/C]: ");
						opcao = leia.next().toUpperCase().charAt(0);
						if (opcao == 'D') {
							contaPoupanca.debito(valor);
						}
						else if (opcao == 'C') {
							contaPoupanca.credito(valor);
						}	else {
							System.out.println("Op��o inv�lida!");
						}
						contaPoupanca.usarLimite(valor);
						
						System.out.println((i + 1) + "� Movimento. Deseja continuar? [S/N]: ");
						opcao1 = leia.next().toUpperCase().charAt(0);
					} 	
				} while (opcao1 == 'N');	
			} break;*/
		
		case 3: {
			
			//CASO SEJA CONTA ESPECIAL	
			for (int i = 0; i < 15; i++) {
				System.out.println();
			}
			do {
				System.out.println("BANCO GEN-18 \nAQUI SEU DINHEIRO TEM VALOR!");
				System.out.println("CONTA ESPECIAL");
				System.out.print("Digite o numero da sua conta: ");
				numero = leia.nextInt();
				
				System.out.print("Insira o n�mero do CPF:");  										
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
				System.out.println("CONTA ESPECIAL");
				System.out.print("Saldo Atual: R$ " + contaEspecial.getSaldo());
				System.out.println();
				//CALCULO DO SALDO
				
				for (int i = 0; i <10; i++) {	
					System.out.print("Digite o valor da opera��o: R$ ");
					valor = leia.nextDouble();
					System.out.print("D�bito ou cr�dito? [D/C]: ");
					opcao = leia.next().toUpperCase().charAt(0);
					if (opcao == 'D') {
						contaEspecial.debito(valor);
					}
					else if (opcao == 'C') {
						contaEspecial.credito(valor);
					}	else {
						System.out.println("Op��o inv�lida!");
					}
					contaEspecial.usarLimite(valor);
					
					System.out.println((i + 1)+ "� Movimento. Deseja continuar? [S/N]: ");
					opcao1 = leia.next().toUpperCase().charAt(0);
				} 	
			} while (opcao1 == 'N');	
		
		} break;
		
		default: {
			System.out.println("Op��o inv�lida!");
		} break;
		
		} 
	leia.close();
	}
}