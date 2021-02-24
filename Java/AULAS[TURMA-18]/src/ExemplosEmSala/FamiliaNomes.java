package ExemplosEmSala;

import java.util.Scanner;

public class FamiliaNomes {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in); // Chamada para INPUT(ENTRADA) de dados pelo user.
		
		System.out.print("Digite o nome da sua mãe: ");
		String nomeMae = sc.next();
		System.out.print("Digite o nome do seu pai: ");
		String nomePai = sc.next();	
		System.out.print("Digite o seu nome: ");
		String nome = sc.next();	
		
		System.out.println("\nNome da mãe: " + nomeMae +"\nNome do pai: " + nomePai + 
				"\nSeu nome: " + nome);
		
		sc.close();
	}

}
