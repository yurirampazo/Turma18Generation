package ExemplosEmSala;

import java.util.Scanner;

public class TestaLacos {
	 /*YURI MINA RAMPAZO - TURMA 18 - GENERATION BRASIL.
		*PROPOSTA:
		* ESTUDO DE LACOS
		* 	PARA - FOR (EASYYY)
		* 	ENQUANTO - WHILE
		*/
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		String nome;
		char genero = 0; // M - F - O
		
		System.out.print("Digite seu nome: ");
		nome = leia.next();
		System.out.print("Digite o seu genero [M/F/O]: ");
		genero = leia.next().toUpperCase().charAt(genero);
		
		while (genero != 'M' &&  genero != 'F' && genero != 'O') {
			System.out.println("Você digitou errado. Tente novamente com: [M/F/O].");
			genero = leia.next().toUpperCase().charAt(0);
		}
		System.out.println("Ola " + nome + ", seu gênero é: " + genero);
	leia.close();
	}
	
	public static void linha(int tamanho) {
		for (int i = 0; i <= tamanho; i++) {
			System.out.print("-");
		}
	}

	public static void pula() {
		System.out.println();
	}
}
