package APLICACAO;

import java.util.*;

import CLASSES.ContaEmpresa;
import CLASSES.ContaEspecial;

public class Aplicacao {
	static Scanner leia = new Scanner(System.in);		//Variáveis globais para poderem ser acessadas por todos os métodos no código
	static int tipoConta, opcaoOperacao;
	static short opcaoAtividade;
	static char opcaoContinuar = 'S';
	static boolean ativa = true;

	public static char pararAtividadeAcesso(char opcaoContinuar) { 	//FINALIZA O PROGRAMA
		System.out.print("| Deseja mesmo sair? [S/N]:                  |");
		opcaoContinuar = leia.next().toUpperCase().charAt(0);
		if (opcaoContinuar == 'S') {
			System.out.println("|============================================|");
			System.out.println("|      OBRIGADO POR UTILIZAR O NEW BANK      |");
			System.out.println("|============================================|");
			System.exit(0);
		}
		else if (opcaoContinuar == 'N') {
			mostrarContas();
		}
		
		else {
			invalidarOpcaoContas(opcaoContinuar);
		}
		return opcaoContinuar;
	}
	public static void encerrarPorLimite() {				//MENSSAGEM DE LIMITE DE ACESSOS UTILIZADO, FORÇA ENCERRAMENTO.
		System.out.println("|============================================|");
		System.out.println("|  LIMITE DE MOVIMENTAÇÕES DIÁRIAS ATINGIDO  |");
		System.out.println("|--------------------------------------------|");
		System.out.println("|      OBRIGADO POR UTILIZAR O NEW BANK      |");
		System.out.println("|============================================|");
	}
	public static int invalidarOpcaoMenu (int opcaoOperacao) {   //MÉTODO PARA INVALIDAR ERROS PROVENIENTES DO USUÁRIO NO MENU DE ATIVIDADES
		do {
			System.out.println("|============================================|");
			System.out.println("|               OPÇÃO INVÁLIDA               |");
			System.out.println("|--------------------------------------------|");
			System.out.println("| Deseja tentar novamente? [S/N]:            |");
			opcaoContinuar = leia.next().toUpperCase().charAt(0);	
			if (opcaoContinuar =='S') {
				mostrarMenu();
			}
			
			else if(opcaoContinuar == 'N') {
				pararAtividade(opcaoContinuar);	
			}
			else {
				invalidarOpcaoContas(opcaoContinuar);
			}
		} while (opcaoContinuar == 'N');

		return opcaoOperacao;
	}
	public static char invalidarOpcao (char opcaoContinuar) {   //MÉTODO PARA INVALIDAR ERROS PROVENIENTES DO USUÁRIO
		do {
			System.out.println("|============================================|");
			System.out.println("|               OPÇÃO INVÁLIDA               |");
			System.out.println("|--------------------------------------------|");
			System.out.println("| Deseja encerrar as atividades? [S/N]:      |");
			opcaoContinuar = leia.next().toUpperCase().charAt(0);	
			if (opcaoContinuar =='N') {
				mostrarContas();
			}
			
			else if(opcaoContinuar == 'S') {
				pararAtividade(opcaoContinuar);	
			}
			else {
				invalidarOpcao(opcaoContinuar);
			}
		} while (opcaoContinuar == 'S');

		return opcaoContinuar;
	}
	public static int invalidarOpcaoContas (int opcaoConta) {   //MÉTODO PARA INVALIDAR ERROS PROVENIENTES DO USUÁRIO NAS OPÇOES DE CONTA
		do {
			System.out.println("|============================================|");
			System.out.println("|               OPÇÃO INVÁLIDA               |");
			System.out.println("|--------------------------------------------|");
			System.out.println("| Deseja tentar novamente? [S/N]:            |");
			opcaoContinuar = leia.next().toUpperCase().charAt(0);	
			if (opcaoContinuar =='S') {
				mostrarContas();
			}
			
			else if(opcaoContinuar == 'N') {
				pararAtividadeAcesso(opcaoContinuar);	
			}
			else {
				invalidarOpcaoContas(opcaoContinuar);
			}
		} while (opcaoContinuar == 'N');

		return opcaoConta;
	}
	public static char pararAtividade(char opcaoContinuar) { 	//FINALIZA O PROGRAMA
		System.out.print("| Deseja mesmo sair? [S/N]:                  |");
		opcaoContinuar = leia.next().toUpperCase().charAt(0);
		if (opcaoContinuar == 'S') {
			System.out.println("|============================================|");
			System.out.println("|      OBRIGADO POR UTILIZAR O NEW BANK      |");
			System.out.println("|============================================|");
			System.exit(0);
		}
		else if (opcaoContinuar == 'N') {
			mostrarMenu();
		}
		
		else {
			invalidarOpcaoContas(opcaoContinuar);
		}
		return opcaoContinuar;
	}
	public static short verificarAtividade(short opcaoAtividade, boolean ativa) {  // STATUS DA CONTA(ATIVA/INATIVA)
			System.out.println("|============================================|");
			System.out.println("|    POR FAVOR, INFORME O STATUS DA CONTA:   |");
			System.out.println("|--------------------------------------------|");
			System.out.println("|[1] -> CONTA ATIVA                          |");
			System.out.println("|[2] -> CONTA INATIVA                        |");
			System.out.println("|============================================|");
					
			opcaoAtividade = leia.nextShort();
			if (opcaoAtividade == 1) {
				limparTela();
				ativa = true;
				System.out.println("|============================================|");
				System.out.println("|             CONTA NEW BANK ATIVA           |");
				System.out.println("|--------------------------------------------|");
				System.out.println("|Por gentileza, aguarde um momento.          |");
								
			} else if (opcaoAtividade == 2) {
				limparTela();
				ativa = false;
				System.out.println("|============================================|");
				System.out.println("|            CONTA NEW BANK INATIVA          |");
				System.out.println("|--------------------------------------------|");
				System.out.println("|Para abrir uma nova conta, acesse nosso App |");
				System.out.println("|Aguardamos seu retorno ansiosamente!        |");
				System.out.println("|============================================|");
				System.exit(0);
			} else { 
				invalidarOpcaoContas(opcaoContinuar);
			}
		return opcaoAtividade;
	}
	public static void limparTela() {			//LIMPA TELA PULANDO LINHAS EM LOOP
		for (int i = 0; i < 15; i++) {
			System.out.println();
		}
	}
	public static String inserirCPF(String cpf) {  				//MÉTODO PARA ACESSO: VERIFICAÇÃO DO CPF
		System.out.print("Insira o número do CPF:");
		cpf = leia.next();
		limparTela();
		return cpf;
	}
	public static int mostrarMenu() {			//MÉTODO PARA MENU DE ACESSO AS AÇÕES DA CONTA
		System.out.println("|============================================|");
		System.out.println("|               [ NEW BANK ]                 |");
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
		if (opcaoOperacao < 1  || opcaoOperacao > 5) {
			invalidarOpcaoMenu(opcaoOperacao);
		}
			limparTela();
		return opcaoOperacao;
	}
	public static int acessarConta(int numero) {				//MÉTODO PARA ACESSO: VERIFICAÇÃO DO NÚMERO
		System.out.println("|--------------------------------------------|");
		System.out.println("|               [ NEW BANK ]                 |");
		System.out.println("|   ---> Aqui seu dinheiro têm VALOR! <---   |");
		System.out.println("|============================================|");
		System.out.print("Digite o numero da sua conta: ");
		return numero = leia.nextInt();
	}
	public static int mostrarContas() {     	//MÉTODO PARA MOSTRAR OS TIPOS DE CONTA DISPONIVEIS

		System.out.println("|============================================|");
		System.out.println("|               [ NEW BANK ]                 |");
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
		if (tipoConta < 1 || tipoConta > 6) {
			invalidarOpcaoContas(tipoConta);
		}
		limparTela();
		return tipoConta;
	}

	public static void main(String[] args) {
		String cpf = "";  // VARIÁVEIS LOCAIS DO MÉTODO MAIN
		int numero = 0, contador = 0;
		double[] valor = new double [10];
		do {
			mostrarContas();  
			limparTela();  
			
			switch (tipoConta) {    //ESCOLHA DO TIPO DE CONTA
			 case 3: 				//CASO ESCOLHA CONTA ESPECIAL
				limparTela();
				double limite = 1000.00;			
				ContaEspecial contaEspecial = new ContaEspecial(numero, cpf, ativa, limite);
				System.out.println("|============================================|");
				System.out.println("|             { CONTA  ESPECIAL }            |");
				acessarConta(numero);  	
				inserirCPF(cpf);		
				verificarAtividade(opcaoAtividade, ativa); 	
				
				do {
					contador = contaEspecial.getContador();
					System.out.println("|--------------------------------------------|");
					System.out.println("    LIMITE DE MOVIMENTAÇÕES (HOJE): " + contaEspecial.getContador() + "/10");
					mostrarMenu();
					switch (opcaoOperacao) {
						case 1: 
							limparTela();
							contaEspecial.consultarSaldo();
						break;
						
						case 2: 
							limparTela();
							System.out.println("|============================================|");
							System.out.println("| DIGITE O VALOR DA OPERAÇÃO: R$             |");
							valor[contador] = leia.nextDouble();
							contaEspecial.creditar(valor[contador]);					
							contaEspecial.consultarSaldo();
						break;
							
						case 3: 
							limparTela();
							System.out.println("|============================================|");
							System.out.println("         DIGITE O VALOR DA OPERAÇÃO: R$       ");
							valor[contador] = leia.nextDouble();
							if (valor[contador] > contaEspecial.getSaldo()) {
								contaEspecial.usarLimite(valor[contador]);
								contaEspecial.consultarSaldo();
							} else if (valor[contador] <= contaEspecial.getSaldo()) {
								contaEspecial.debitar(valor[contador]);
								contaEspecial.consultarSaldo();									
							}
							//contaEspecial.setContador(contaEspecial.getContador() + 1);
						break;
						
						case 4: 
							limparTela();
							ContaEspecial.informarLimite(4);
						break;
						
						case 5:  
							pararAtividade(opcaoContinuar);
						break;
					}
						
				} while (contaEspecial.getContador() < valor.length);
				
				if (contaEspecial.getContador() == valor.length) {
					encerrarPorLimite();
				}
				break;
				
			case 4:
				limparTela();
				double emprestimoEmpresa = 10000.00;
				char pedirEmprestimo = 'N';
				ContaEmpresa contaEmpresa = new ContaEmpresa(numero, cpf, ativa, pedirEmprestimo);
				System.out.println("|============================================|");
				System.out.println("|             { CONTA  EMPRESA }             |");
				acessarConta(numero);  	
				inserirCPF(cpf);		
				verificarAtividade(opcaoAtividade, ativa); 	
				
				do {
					contador = contaEmpresa.getContador();
					System.out.println("|--------------------------------------------|");
					System.out.println("    LIMITE DE MOVIMENTAÇÕES (HOJE): " + contaEmpresa.getContador() + "/10");
					mostrarMenu();
					switch (opcaoOperacao) {
						case 1: 
							limparTela();
							contaEmpresa.consultarSaldo();
						break;
						
						case 2: 
							limparTela();
							System.out.println("|============================================|");
							System.out.println("| DIGITE O VALOR DA OPERAÇÃO: R$             |");
							valor[contador] = leia.nextDouble();
							contaEmpresa.creditar(valor[contador]);					
							contaEmpresa.consultarSaldo();
						break;
							
						case 3: 
							limparTela();
							System.out.println("|============================================|");
							System.out.println("         DIGITE O VALOR DA OPERAÇÃO: R$       ");
							valor[contador] = leia.nextDouble();
							if (valor[contador] > contaEmpresa.getSaldo()) {
								System.out.println("|--------------------------------------------|");
								System.out.println("| DESEJA SOLICITAR UM EMPRÉSTIMO? [S/N] ?    |");
								System.out.println("|--------------------------------------------|");
								opcaoContinuar = leia.next().toUpperCase().charAt(0);
								if (opcaoContinuar == 'S') {
									contaEmpresa.consultarSaldo();
									System.out.println("|--------------------------------------------|");
									System.out.println("| DIGITE O VALOR DO EMPRÉSTIMO: R$           |");
									System.out.println("|--------------------------------------------|");
									valor[contador] = leia.nextDouble();
									contaEmpresa.pedirEmprestimo(valor[contador]);
								} else if (opcaoContinuar == 'N') {
									System.out.println("|--------------------------------------------|");
									System.out.println("|          O QUE DESEJA FAZER AGORA?         |");
									System.out.println("|--------------------------------------------|");
									System.out.println("| [1] - VOLTAR AO MENU DE ATIVIDADES         |");
									System.out.println("| [2] - SAIR                                 |");
									System.out.println();
									switch(opcaoAtividade) {
										case 1: 
											mostrarMenu();	
										break;
										
										case 2:
											pararAtividade(opcaoContinuar);
										break;
									}
								} else {
									invalidarOpcao(opcaoContinuar);	
								}
													
							} else if (valor[contador] <= contaEmpresa.getSaldo()) {
								contaEmpresa.debitar(valor[contador]);
								contaEmpresa.consultarSaldo();									
							}
							//contaEspecial.setContador(contaEspecial.getContador() + 1);
						break;
						
						case 4: 
							limparTela();
							ContaEspecial.informarLimite(4);
						break;
						
						case 5:  
							pararAtividade(opcaoContinuar);
					}
						
				} while (contaEmpresa.getContador() < valor.length);
				
				if (contaEmpresa.getContador() == valor.length) {
					encerrarPorLimite();
				}
			break;
			}
		} while (tipoConta == 6);
	}
}