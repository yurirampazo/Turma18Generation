import java.util.Scanner;

public class Exercicio4 {
	
	/* YURI MINA RAMPAZO - GENERATION BRASIL - TURMA 18
	 * PROJETO:
	 * 4. Escreva um sistema que leia três 
	 * números inteiros e positivos (A, B, C) e
	 * calcule a seguinte expressão:*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0, c = 0;	
				
		System.out.println("Digite um número inteiro positivo: ");
		a = sc.nextInt();
		System.out.println("Digite mais um número inteiro positivo: ");
		b = sc.nextInt();
		System.out.println("Digite outro número inteiro positivo: ");
		c = sc.nextInt();
		
		double r = Math.pow((a + b), 2);
		double s = Math.pow((b + c), 2);
		double d = (r + s) / 2;
		
		System.out.println("R = "+ r +"\nS = "+s +"\nD = "+ d);
		
		sc.close();	

	}

}
