package LISTA03;

import java.util.Scanner;

public class Ex05 {
	/* YURI MINA RAMPAZO - TURMA 18 - GENERATION BRASIL.
	*PROPOSTA:
	* 5- Crie um programa que leia um número do teclado até que encontre um
	* número igual a zero. No final, mostre a soma dos números
	* digitados.(DO...WHILE)
	*/
	public static void main(String[] args) {
		Scanner	leia = new Scanner(System.in);
		
		double numero= 0.00, maiorNumero = 0, soma = 0.00;
				
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextDouble();
			if (numero > 0 ) {
				soma += numero;
				if (numero > maiorNumero) {
					maiorNumero = numero;
				}
			}
		} while (numero > 0);
		if (numero == 0) {
			System.out.printf("Você digitou 0 \n "
					+ "A soma de tudo é: %.2f",soma);
		} else if (numero < 0) {
			System.out.printf("Você digitou um número inválidp \nA soma é: %.2f", soma);
		}
	leia.close();
	}
}
