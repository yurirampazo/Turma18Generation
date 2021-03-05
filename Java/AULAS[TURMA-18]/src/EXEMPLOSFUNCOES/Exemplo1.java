package EXEMPLOSFUNCOES;

import java.util.Scanner;

public class Exemplo1 {
	
	//FUNÇÕES SIMPLES! FUNÇÃO PARA PULAR LINHA

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String vocativo;
				
		System.out.print("-------------------");
		System.out.print("Digite o seu nome: ");
		String nome = sc.next().toUpperCase(); 
		System.out.print("Como você se define? : ");
		char genero = sc.next().toUpperCase().charAt(0); 		// M - F - O
		
		
		
		System.out.print("Digite um número inteiro positivo: ");
		int numero = sc.nextInt();
		parImpar(numero);
		System.out.println("-------------------");
	
		
		sc.close();
	}
	
	public static void pula() {
		System.out.println();
	}
	
	public static void parImpar(int numero) {
		if (numero % 2 == 0) {
			System.out.print("O número " + Math.round(numero) + " é par!");
			pula();
		} else {
			System.out.print("O número " + Math.round(numero) + " é ímpar!");
			pula();
		}
	}
	
	public static String tipo(char genero) {	
		String vocativo ="";
		if (genero == 'M') {
			vocativo = "Sr.";
		} else if (genero == 'F') {
			vocativo = "Sra.";
		} else if (genero == 'O' ) {
			vocativo = "Srx.";
		} else {
			System.out.println("N/D.");
		}
		return vocativo;
		}
}
