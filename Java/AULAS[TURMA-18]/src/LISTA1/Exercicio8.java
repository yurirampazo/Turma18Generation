package LISTA1;

import java.util.Scanner;

public class Exercicio8 {
	/* YURI MINA RAMPAZO - GENERATION BRASIL - TURMA 18
	 * PROJETO: 
	 *8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
	percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
	Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
	escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
	consumidor.
 	 */
	
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		
				
		double impostos = 0.45, percentual = 0.28;
		
		System.out.print("Escreva o custo de f�brica do carro: ");
		double custo = sc.nextDouble();
		
		double custoConsumidor = (custo / (impostos + percentual));
		
		System.out.println("O custo para o consumidor final ser�: R$" + Math.round(custoConsumidor));
		sc.close();	
			
	}

}