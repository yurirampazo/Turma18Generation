package LISTA02;

import java.util.Scanner;

public class Ex8 {
	/* YURI MINA RAMPAZO - TURMA 18 - GENERATION BRASIL.
	*PROPOSTA:
	*8) Construa um sistema para ler 
	* uma vari�vel num�rica N e imprimi-la somente
	* se a mesma for maior que 100, 
	* caso contr�rio imprimi-la com o valor zero.
	*/	

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite um n�mero: ");
		double numero = sc.nextDouble();
		if (numero > 100) {
			System.out.printf("O n�mero digitado foi: %.2f",numero);
		}
		else {
			System.out.println("0");
		}		
		System.out.println("\nObrigado por utilizar nosso programa!");
		sc.close();
	}

}
