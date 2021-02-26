package LISTA02;

import java.util.Scanner;

public class Ex7 {
	/* YURI MINA RAMPAZO - TURMA 18 - GENERATION BRASIL.
	*PROPOSTA:
	* 7) Receber valores de base e altura de um triângulo e 
	* verificar se são valores válidos (positivos maiores que zero). 
	* Em caso afirmativo, calcular a área do triângulo.
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //INSTANCIAR - TIPO DE LAYOUT DEFINE O PADRÃO!!!
		double area = 0;
				
		System.out.print("Digite o valor da base do triângulo: ");
		double base = sc.nextDouble();
		System.out.print("Digite o valor da altura do triângulo: ");
		double altura = sc.nextDouble();
		if (altura > 0.00 && base > 0.00) {
			area = (altura * base);
			System.out.printf("A área do triângulo é: %.2f", area);
		}	sc.close();
	}
}
