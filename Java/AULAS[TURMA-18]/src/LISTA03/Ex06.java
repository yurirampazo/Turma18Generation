package LISTA03;

import java.util.Scanner;

public class Ex06 {
	/* YURI MINA RAMPAZO - TURMA 18 - GENERATION BRASIL.
	*PROPOSTA:
	* 6- Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
	* final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
	* 0(zero).(DO...WHILE)
	*/
	public static void main(String[] args) {
		Scanner	leia = new Scanner(System.in);
		
		double numero= 0.00, media = 0, soma = 0.00;
		int multiplo3 = 0;
		
		do {
			System.out.println("Digite um n�mero: ");
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
			System.out.printf("Voc� digitou 0 \n "
					+ "A m�dia dos n�meros multiplos de 3 �: %.2f",media);
		} else if (numero < 0) {
			System.out.printf("Voc� digitou um n�mero inv�lido \nA m�dia �: %.2f",media);
			System.out.println("Voc� digitou" + multiplo3 + "n�meros m�ltiplos de 3");
		}
	leia.close();
	}

}
