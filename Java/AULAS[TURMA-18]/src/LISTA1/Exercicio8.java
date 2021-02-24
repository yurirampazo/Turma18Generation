package LISTA1;

import java.util.Scanner;

public class Exercicio8 {
	/* YURI MINA RAMPAZO - GENERATION BRASIL - TURMA 18
	 * PROJETO: 
	 *8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
	percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
	Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
	escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
	consumidor.
 	 */
	
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		
				
		double impostos = 0.45, percentual = 0.28;
		
		System.out.print("Escreva o custo de fábrica do carro: ");
		double custo = sc.nextDouble();
		
		double custoConsumidor = (custo / (impostos + percentual));
		
		System.out.println("O custo para o consumidor final será: R$" + Math.round(custoConsumidor));
		sc.close();	
			
	}

}