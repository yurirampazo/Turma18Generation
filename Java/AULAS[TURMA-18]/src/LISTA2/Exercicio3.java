package LISTA2;

import java.util.Scanner;

public class Exercicio3 {
	/* YURI MINA RAMPAZO - GENERATION BRASIL - TURMA 18
		 *PROJETO:
	 * 3- Faça um programa que receba a idade de uma 
	 * pessoa e mostre na saída em qual
	   categoria ela se encontra:
		.10-14 infantil
		. 15-17 juvenil
		. 18-25 adulto*/

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		if (idade < 10 && idade > 25) {
			System.out.println("Você não digitou uma idade válida. Tente novamente");
		}
		else if (idade >= 10 && idade <= 14) {
			System.out.println("Você está na categoria INFANTIL: 10 - 14 anos");
		}
		else if (idade >= 15 && idade <= 17) {
			System.out.println("Você está na categoria JUVENIL: 15 - 17 anos");
		}
		else if (idade >= 18 && idade <= 25) {
			System.out.println("Você está na categoria ADULTO: 15 - 17 anos");
		}
		sc.close();
	}

}
