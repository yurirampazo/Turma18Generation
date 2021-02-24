import java.util.Scanner;

public class Exercicio7 {
	/* YURI MINA RAMPAZO - GENERATION BRASIL - TURMA 18
	 * PROJETO:
	 * 7 Um sistema de equações lineares do tipo:
	 * .*/

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
				
		System.out.println("Digite o número a: ");
		int a = sc.nextInt();
		System.out.println("Digite o número a: ");
		int b = sc.nextInt();
		System.out.println("Digite o número a: ");
		int c = sc.nextInt();
		System.out.println("Digite o número a: ");
		int d = sc.nextInt();
		System.out.println("Digite o número a: ");
		int e = sc.nextInt();
		System.out.println("Digite o número a: ");
		int f = sc.nextInt();
		
		double x = ((c * e) -(b * f)) / ((a * e) -(b * d));
		double y = ((a * f) -(c * d)) / ((a * e) -(b * d));

		System.out.println("X = " + x + "\nY = "+y);
		
		sc.close();
	}

}
