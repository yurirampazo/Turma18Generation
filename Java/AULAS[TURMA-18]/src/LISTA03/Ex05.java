package LISTA03;

import java.util.Scanner;

public class Ex05 {
	/* YURI MINA RAMPAZO - TURMA 18 - GENERATION BRASIL.
	*PROPOSTA:
	* 5- Crie um programa que leia um n�mero do teclado at� que encontre um
	* n�mero igual a zero. No final, mostre a soma dos n�meros
	* digitados.(DO...WHILE)
	*/
	public static void main(String[] args) {
		Scanner	leia = new Scanner(System.in);
		
		double numero= 0.00, maiorNumero = 0, soma = 0.00;
				
		do {
			System.out.println("Digite um n�mero: ");
			numero = leia.nextDouble();
			if (numero > 0 ) {
				soma += numero;
				if (numero > maiorNumero) {
					maiorNumero = numero;
				}
			}
		} while (numero > 0);
		if (numero == 0) {
			System.out.printf("Voc� digitou 0 \n "
					+ "A soma de tudo �: %.2f",soma);
		} else if (numero < 0) {
			System.out.printf("Voc� digitou um n�mero inv�lidp \nA soma �: %.2f", soma);
		}
	leia.close();
	}
}
