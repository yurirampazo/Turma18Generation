package LISTA02;

import java.util.Scanner;

public class Ex3 {
	/* Yuri Mina Rampazo - Turma 18 - Generation Brasil
	*  Porposta do Projeto:
	*   3) Desenvolva um sistema em que:
	*Leia 4 (quatro) números;
	*Calcule o quadrado de cada um;
	*Se o valor resultante do quadrado do terceiro for maior > 1000, imprima-o e finalize;
	*Caso contrário, imprima os valores lidos e seus respectivos quadrados.
	*/

	public static void main(String[] args) {
		//real a = 0.00, b = 0.00, c = 0.00 , d = 0.00, a2 = 0.00, b2 = 0.00, c2 = 0.00, d2 = 0.00
		Scanner sc = new Scanner (System.in);
		System.out.printf("Digite um número: ");
		double a = sc.nextDouble();
		System.out.print("Digite outro número: ");
		double b = sc.nextDouble();
		System.out.print("Digite mais número: ");
		double c = sc.nextDouble();
		System.out.print("Digite mais número: ");
		double d = sc.nextDouble();
		

		double a2 = (Math.pow(a, 2));
		double b2 = (Math.pow(b, 2));
		double c2 = (Math.pow(c, 2));
		double d2 = (Math.pow(d, 2));
		if (c2 >= 1000) {
			System.out.printf("O quadrado de %.2f",c," é %.2f", c2,"!");
		}
		else {
			System.out.println("O quadrado de "+ a +" é "+ a2 + "!");
			System.out.println("O quadrado de "+ b +" é "+ b2 +"!");
			System.out.println("O quadrado de "+ c +" é "+ c2 +"!");
			System.out.println("O quadrado de "+ d +" é "+ d2 + "!");
		}
		System.out.printf("\nObrigado por utilizar nosso programa!");
		sc.close();
	}	
}
