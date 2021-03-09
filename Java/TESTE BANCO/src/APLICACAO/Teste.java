package APLICACAO;


import java.util.Scanner;

import CLASSE.ContaEspecial;


public class Teste {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String cpf= "";
		int numero = 0;
		double valor[] = new double [10];
		final double limite = 1000; //Conta especial
		char opcaoPagamento,opcaoContinuar = 'S', opcaoContaAtivaNaoAtiva;
		boolean ativa = true;
		 
		
		ContaEspecial contaEspecial = new ContaEspecial(numero,cpf,ativa,limite);
		
		
		//TELA 1
		do {
			System.out.println("|============================================|");
			System.out.println("|           [ BANCO GEN18 G-08 ]             |");
			System.out.println("|   ---> Aqui seu dinheiro t�m VALOR! <---   |");
			System.out.println("|--------------------------------------------|");
			System.out.println("| [1] - CONTA POUPAN�A                       |");
			System.out.println("| [2] - CONTA CORRENTE                       |");
			System.out.println("| [3] - CONTA ESPECIAL                       |");
			System.out.println("| [4] - CONTA EMPRESA                        |");
			System.out.println("| [5] - CONTA ESTUDANTIL                     |");
			System.out.println("|============================================|");
			System.out.println("|                                            |");
			System.out.print  ("|  DIGITE O C�DIGO DA OP��O SELECIONADA:     |");
		
			int tipoConta = leia.nextInt();
			// SELE��O DO TIPO DE CONTA
			switch (tipoConta) {
				case 3: {
				
					//CASO SEJA CONTA ESPECIAL	
					for (int i = 0; i < 15; i++) {
						System.out.println();
					}
					
						System.out.println("|============================================|");
						System.out.println("|           [ BANCO GEN18 G-08 ]             |");
						System.out.println("|   ---> Aqui seu dinheiro t�m VALOR! <---   |");
						System.out.println("|--------------------------------------------|");
						System.out.println("|             { CONTA ESPECIAL }             |");
						System.out.println("|============================================|");
						System.out.print("Digite o numero da sua conta: ");
						numero = leia.nextInt();
						
						System.out.print("Insira o n�mero do CPF:");  										
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
						
							for (int i = 0; i < 10 ; i++) {	
							System.out.print("Digite o valor da opera��o: R$ ");
							valor[i] = leia.nextDouble();
							System.out.print("D�bito ou cr�dito? [D/C]: ");
							opcaoPagamento = leia.next().toUpperCase().charAt(0);
							if (opcaoPagamento == 'D') {
								contaEspecial.debito(valor[i]);
							}
							else if (opcaoPagamento == 'C') {
								contaEspecial.credito(valor[i]);
							}	else {
								System.out.println("Op��o inv�lida!");
							}
							contaEspecial.usarLimite(valor[i]);
							
							if (i <= 9) { 
								System.out.println((i + 1)+ "� Movimento. Deseja continuar? [S/N]: ");
								opcaoContinuar = leia.next().toUpperCase().charAt(0);
							}
							
							if(opcaoContinuar == 'N') {
								System.out.println("|============================================|");
								System.out.println("|   Obrigado por utilizar o BANCO GEN18 G-08 |");
								System.out.println("|============================================|");
								break;
							}
							}
							System.out.println("|   Limite de transa��es di�rias atingido.   |");
							System.out.println("|============================================|");
							System.out.printf( "|            [ Saldo:  R$  %.2f ]            |\n", contaEspecial.getSaldo());
							System.out.printf( "|            [ Limite:  R$  %.2f ]         |\n",contaEspecial.getLimite());
							System.out.println("|  Obrigado por utilizar o BANCO GEN18 G-08  |");
							System.out.println("|============================================|");
							break;	
								
						}
											
				
				
					default: {

						System.out.println("Op��o inv�lida!");
						break;
					} 
			
				}  
	
		}while (opcaoContinuar == 'N');
		
		leia.close();	
	}
}