package LISTA02;

import java.util.Scanner;

public class Ex4 {
	/* YURI MINA RAMPAZO - TURMA 18 - GENERATION BRASIL.
	*PROPOSTA:
	* 4) Faça um sistema que leia um número inteiro 
	* e mostre uma mensagem indicando se este
	* número é par ou ímpar, e se é positivo ou negativo.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Digite um número inteiro: ");
		int n = sc.nextInt();
		if (n % 2 == 0) {
			if (n < 0) {
				System.out.println("O número " + n + " é par e negativo");
			}
			else {
				System.out.println("O número " + n + " é par e positivo");
			}
		}
		else if (n > 0) {
				System.out.println("O número " + n + " é ímpar e positivo");
		}
		else {
				System.out.println("O número "+ n + " é ímpar e negativo");
		}
		
		System.out.println("Obrigado por utilizar nosso programa!");	
		sc.close();
	}		
}


