package LISTA1;

import java.util.Scanner;

public class Exercicio6 {
	/* YURI MINA RAMPAZO - GENERATION BRASIL - TURMA 18
	 * PROJETO:
	 * 6. Construa um programa em JAVA que, tendo 
	 * como dados de entrada dois pontos
	 * quaisquer no plano, P(x1, y1) e P(x2, y2), 
	 * escreva a distância entre eles. A fórmula.*/


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Digite o primeiro número: ");
		int x1 = sc.nextInt();
		System.out.print("Digite o segundo número: ");
		int x2 = sc.nextInt();
		System.out.print("Digite o terceiro número: ");
		int y1 = sc.nextInt();
		System.out.print("Digite o quarto número: ");
		int y2 = sc.nextInt();
		
		double diferenca = Math.sqrt(Math.pow((x2 -x1),2) + Math.pow((y2-y1),2));

		System.out.printf("A diferença entre os pontos é: %.2f" , diferenca);
		sc.close();
	}
}