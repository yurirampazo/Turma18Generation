package LISTA03;

import java.util.Scanner;

public class Ex02 {
	/* YURI MINA RAMPAZO - TURMA 18 - GENERATION BRASIL.
	*PROPOSTA:
	* 2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/

	public static void main(String[] args) {
Scanner	leia = new Scanner(System.in);
		
		double numero = 0;
		int numeroPar = 0, numeroImpar = 0;
		
		for (int i =0; i <=10; i++) {
			System.out.println("Digite um n�mero: ");
			numero = leia.nextDouble();
			if (numero % 2 == 0) {
				numeroPar++;
				
			} else if (numero % 2 != 0) {
				numeroImpar++;
			}
		}
		System.out.println("Dos valores digitados " + numeroPar + " s�o pares.");	
		System.out.println("Dos valores digitados " + numeroImpar + " s�o �mpares.");
	leia.close();
	}
}
