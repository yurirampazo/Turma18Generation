package LISTA02;

import java.util.Scanner;

public class Ex2 {
	/* Yuri Mina Rampazo - Turma 18 - Generation Brasil
	*  Porposta do Projeto:
	*   2) Elabore um sistema que leia as vari�veis C e N, respectivamente c�digo e n�mero de
	*horas trabalhadas de um oper�rio. E calcule o sal�rio sabendo-se que ele ganha R$ 10,00
	*por hora. Quando o n�mero de horas exceder a 50 calcule o excesso de pagamento
	*armazenando-o na vari�vel E, caso contr�rio zerar tal vari�vel. A hora excedente de
	*trabalho vale R$ 20,00. No final do processamento imprimir o sal�rio total e o sal�rio
	*excedente.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
			double ex = 0.00, he = 0.00;	
			System.out.print("Digite  os quatro digitos finais de seu registro na empresa: ");
			double c = sc.nextDouble();
			System.out.print("Digite as quantidade de horas trabalhadas: ");
			double n = sc.nextDouble();
			
			final double limiteHoras = 50.00, valorHora = 20.00;
				
			if (n > limiteHoras) {
				ex = n - limiteHoras;
				he = ex * valorHora;
				System.out.printf("Ol� funcion�rio ", c ,". Voc� fez: %.2f", ex , " hora[s] a mais!");
				System.out.printf("\nPor isso ir� receber R$ %.2f", he ," referentes "
						+ "a essas horas adicionais. Aproveite!");
			}
			else {
				System.out.printf("Ol� funcion�rio ", c ,". Voc� fez: %.2f", ex ,"hora[s] a mais!");
				System.out.println("\nPor isso n�o ir� receber valor adicional esse m�s!");
			}
			System.out.println("\nObrigado por utilizar nosso programa!");
	sc.close();
	}	
}

