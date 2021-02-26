package LISTA02;

import java.util.Scanner;

public class Ex1 {
	/* Yuri Mina Rampazo - Turma 18 - Generation Brasil
	*  Porposta do Projeto:
	*  1) Jo�o, homem de bem, comprou um microcomputador para controlar o rendimento di�rio
	*de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
	*regulamento do estado de S�o Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
	*excedente. Jo�o precisa que voc� fa�a um sistema que leia a vari�vel P (peso de tomates) e
	*verifique se h� excesso. Se houver, gravar na vari�vel E (Excesso) e na vari�vel M o valor
	*da multa que Jo�o dever� pagar. Caso contr�rio mostrar tais vari�veis com o conte�do
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
			System.out.printf("Voc� ultrapassou o limite permitido por %.2f", 
			ex ,"[kg]. Sua multa � de R$: %.2f", m);
			}
			else {
			System.out.printf("O excesso de peso do produto �: %.2f ",ex,"[kg]. "
					, "\nA multa � R$ %.2f", m);
			System.out.println("Obrigado por utilizar nosso programa!");
		}
		sc.close();
	}
}
