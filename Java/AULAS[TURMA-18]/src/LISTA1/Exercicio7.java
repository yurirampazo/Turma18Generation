package LISTA1;

import java.util.Scanner;

public class Exercicio7 {
	/* YURI MINA RAMPAZO - GENERATION BRASIL - TURMA 18
	 * PROJETO:
	 * 7 Um sistema de equa��es lineares do tipo:
	 * .*/

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
				
		System.out.print("Digite o n�mero a: ");
		int a = sc.nextInt();
		System.out.print("Digite o n�mero b: ");
		int b = sc.nextInt();
		System.out.print("Digite o n�mero c: ");
		int c = sc.nextInt();
		System.out.print("Digite o n�mero d: ");
		int d = sc.nextInt();
		System.out.print("Digite o n�mero e: ");
		int e = sc.nextInt();
		System.out.print("Digite o n�mero f: ");
		int f = sc.nextInt();
		
		double x = ((c * e) -(b * f)) / ((a * e) -(b * d));
		double y = ((a * f) -(c * d)) / ((a * e) -(b * d));

		System.out.println("X = " + x + "\nY = "+ y);
		sc.close();
	}
}