package LISTA02;

import java.util.Scanner;

public class Ex4 {
	/* YURI MINA RAMPAZO - TURMA 18 - GENERATION BRASIL.
	*PROPOSTA:
	* 4) Fa�a um sistema que leia um n�mero inteiro 
	* e mostre uma mensagem indicando se este
	* n�mero � par ou �mpar, e se � positivo ou negativo.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Digite um n�mero inteiro: ");
		int n = sc.nextInt();
		if (n % 2 == 0) {
			if (n < 0) {
				System.out.println("O n�mero " + n + " � par e negativo");
			}
			else {
				System.out.println("O n�mero " + n + " � par e positivo");
			}
		}
		else if (n > 0) {
				System.out.println("O n�mero " + n + " � �mpar e positivo");
		}
		else {
				System.out.println("O n�mero "+ n + " � �mpar e negativo");
		}
		
		System.out.println("Obrigado por utilizar nosso programa!");	
		sc.close();
	}		
}


