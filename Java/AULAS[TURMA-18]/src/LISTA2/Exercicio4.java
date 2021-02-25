package LISTA2;

import java.util.Scanner;

public class Exercicio4 {
	/* YURI MINA RAMPAZO - GENERATION BRASIL - TURMA 18
	 *PROJETO:
	 * 4- Faça um programa em que permita a entrada de um 
	 * número qualquer e exiba se este
	 * número é par ou ímpar. Se for par exiba também 
	 * a raiz quadrada do mesmo; se for
	 * ímpar exiba o número elevado ao quadrado.*/
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int numero = 0;
		System.out.print("Digite um número real inteiro para saber se é par ou ímpar: ");
		numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			if ( numero < 0) {
				System.out.println("O número " + numero + ", é par e negativo.");
				System.out.println("E ele não possuí raíz quadrada por ser negativo");
			}
			else {
				System.out.println("O número " + numero + ", é par e positivo.");
				System.out.println("E sua raíz quadrada é: " + Math.sqrt(numero));
			}
		}
		else if (numero % 2 != 0) {
			if ( numero < 0) {
				System.out.println("O número " + numero + ", é ímpar e negativo.");
				System.out.println("E o seu quadrado vale: " + Math.pow(numero, 2));
			}
			else {
				System.out.println("O número " + numero + ", é ímpar e positivo.");
				System.out.println("E o seu quadrado vale: " + Math.pow(numero, 2));
			}
		}
		sc.close();
	}
}