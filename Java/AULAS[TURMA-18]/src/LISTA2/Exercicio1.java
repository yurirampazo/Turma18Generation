package LISTA2;

import java.util.Scanner;

public class Exercicio1 {
		/* YURI MINA RAMPAZO - GENERATION BRASIL - TURMA 18
		 *PROJETO:
		 *1- Faça um programa que receba três inteiros 
		 *e diga qual deles é o maior.*/

	public static void main(String[] args) {		// ctrl + shift + o = inicializa JAVA UTIL
		Scanner sc = new Scanner (System.in);
		System.out.print("Digite um número inteiro: ");
		int numero1 = sc.nextInt();
		System.out.print("Digite outro número inteiro: ");
		int numero2 = sc.nextInt();
		System.out.print("Digite mais um número inteiro: ");
		int numero3 = sc.nextInt();
		
		if (numero1 > numero2 && numero2 >= numero3) {
			System.out.println("O maior número digitado foi o 1o. número: " + numero1);
		}	
		else if (numero2 > numero1 && numero1 >= numero3) {
			System.out.println("O maior número digitado foi o 2o. número: " + numero1);
		}
		else {
			System.out.println("O maior número digitado foi o 3o. número: " + numero3);
		}
		sc.close();
	}
}
