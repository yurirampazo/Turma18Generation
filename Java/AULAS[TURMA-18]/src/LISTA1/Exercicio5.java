package LISTA1;

import java.util.Scanner;

public class Exercicio5 {
	/* YURI MINA RAMPAZO - GENERATION BRASIL - TURMA 18
	 * PROJETO:
	 * 5. Fa�a um sistema que leia as 3 notas de um aluno e 
	 * calcule a m�dia final deste
	 * aluno. Considerar que a m�dia � ponderada e 
	 * que o peso das notas �: 2,3 e 5,
	 * respectivamente.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
					
		System.out.print("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();
		System.out.print("Digite a terceira nota: ");
		double nota3 = sc.nextDouble();
		
		double mediaPonderada = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2 + 3 + 5);
		System.out.println("A m�dia ponderada das notas �: " + mediaPonderada);
		
		sc.close();
	}

}
