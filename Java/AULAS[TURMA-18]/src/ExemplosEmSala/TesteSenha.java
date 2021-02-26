package ExemplosEmSala;

import java.util.Scanner;

public class TesteSenha {
	/*YURI MINA RAMPAZO - TURMA 18 - GENERATION BRASIL.
	*PROPOSTA:
	* ESTUDO DE LACOS
	* FACA ENQUANTO - DO WHILE*/

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in); 
		
		String nome = null;
		 int senha = 123;
		 
				 
		while (senha == 123) {
			System.out.print("Digite seu nome: ");
			nome = leia.next().toUpperCase();
			System.out.print("Digite sua senha: ");
			senha = leia.nextInt();
			System.out.println("Olá " + nome + " seja bem vindo!");
		}
		
		System.out.println("ACESSO NEGADO!!!"); 
		
		
	leia.close();
	}

}
