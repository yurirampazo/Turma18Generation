package LISTA02;

import java.util.Scanner;

public class Ex1 {
	/* Yuri Mina Rampazo - Turma 18 - Generation Brasil
	*  Porposta do Projeto:
	*  1) João, homem de bem, comprou um microcomputador para controlar o rendimento diário
	*de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
	*regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
	*excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) e
	*verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor
	*da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo
	*ZERO.
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		final double limiteKg = 50.00, valorMulta = 4.00;  // final = const
		double ex = 0.00, m = 0.00;
		
						
		System.out.print("Digite o peso do produto: ");
		double p = sc.nextDouble();
			
		
		if (p > limiteKg ) {
			ex = p - limiteKg;
			m = valorMulta * ex;
			System.out.printf("Você ultrapassou o limite permitido por %.2f", 
			ex ,"[kg]. Sua multa é de R$: %.2f", m);
			}
			else {
			System.out.printf("O excesso de peso do produto é: %.2f ",ex,"[kg]. "
					, "\nA multa é R$ %.2f", m);
			System.out.println("Obrigado por utilizar nosso programa!");
		}
		sc.close();
	}
}
