package LISTA02;

import java.util.Scanner;

public class Ex7 {
	/* YURI MINA RAMPAZO - TURMA 18 - GENERATION BRASIL.
	*PROPOSTA:
	* 7) Receber valores de base e altura de um tri�ngulo e 
	* verificar se s�o valores v�lidos (positivos maiores que zero). 
	* Em caso afirmativo, calcular a �rea do tri�ngulo.
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //INSTANCIAR - TIPO DE LAYOUT DEFINE O PADR�O!!!
		double area = 0;
				
		System.out.print("Digite o valor da base do tri�ngulo: ");
		double base = sc.nextDouble();
		System.out.print("Digite o valor da altura do tri�ngulo: ");
		double altura = sc.nextDouble();
		if (altura > 0.00 && base > 0.00) {
			area = (altura * base);
			System.out.printf("A �rea do tri�ngulo �: %.2f", area);
		}	sc.close();
	}
}
