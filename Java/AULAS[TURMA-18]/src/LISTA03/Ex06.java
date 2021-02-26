package LISTA03;

import java.util.Scanner;

public class Ex06 {
	/* YURI MINA RAMPAZO - TURMA 18 - GENERATION BRASIL.
	*PROPOSTA:
	* 6- Escrever um programa que receba vários números inteiros no teclado. E no
	* final imprimir a média dos números múltiplos de 3. Para sair digitar
	* 0(zero).(DO...WHILE)
	*/
	public static void main(String[] args) {
		Scanner	leia = new Scanner(System.in);
		
		double numero= 0.00, media = 0, soma = 0.00;
		int multiplo3 = 0;
		
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextDouble();
			if (numero > 0 ) {
				soma += numero;
				if (numero % 3 == 0) {
					soma += numero;
					multiplo3++;
				}
			}
			media = (soma/multiplo3);
		} while (numero > 0);
		if (numero == 0) {
			System.out.printf("Você digitou 0 \n "
					+ "A média dos números multiplos de 3 é: %.2f",media);
		} else if (numero < 0) {
			System.out.printf("Você digitou um número inválido \nA média é: %.2f",media);
			System.out.println("Você digitou" + multiplo3 + "números múltiplos de 3");
		}
	leia.close();
	}

}
