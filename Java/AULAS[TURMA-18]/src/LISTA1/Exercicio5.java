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
		int nota1 = 0, nota2 = 0, nota3 = 0;	
		double mediaPonderada;
				
		System.out.println("Digite a primeira nota: ");
		nota1 = sc.nextInt();
		System.out.println("Digite a segunda nota: ");
		nota2 = sc.nextInt();
		System.out.println("Digite a terceira nota: ");
		nota3 = sc.nextInt();
		
		mediaPonderada = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2 + 3 + 5);
		System.out.println("A m�dia ponderada das notas �: " + mediaPonderada);
		
		sc.close();
	}

}
