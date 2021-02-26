package LISTA02;

import java.util.Scanner;

public class Ex2 {
	/* Yuri Mina Rampazo - Turma 18 - Generation Brasil
	*  Porposta do Projeto:
	*   2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
	*horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
	*por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
	*armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
	*trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
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
				System.out.printf("Olá funcionário ", c ,". Você fez: %.2f", ex , " hora[s] a mais!");
				System.out.printf("\nPor isso irá receber R$ %.2f", he ," referentes "
						+ "a essas horas adicionais. Aproveite!");
			}
			else {
				System.out.printf("Olá funcionário ", c ,". Você fez: %.2f", ex ,"hora[s] a mais!");
				System.out.println("\nPor isso não irá receber valor adicional esse mês!");
			}
			System.out.println("\nObrigado por utilizar nosso programa!");
	sc.close();
	}	
}

