package ARRAYS;

import java.util.Scanner;

public class Tarefa1 {
	/*Faça um programa que crie um valor  por leitura com 5 valores de pontuação de uma atividade 
	 *e o escreva em seguida. Encontre após a maior a pontuação e a apresente.
	 */

	
	public static void main(String[] args) {
		// int valores[5]
		Scanner leia = new Scanner (System.in);
		int  maior= 0;
		int valores [] = new int [5];
		
		
		// MATRIZ E VETOR -- USAR O FOR!! Ajuda MUITO!
		for (int y = 0; y < valores.length;y ++) {
			System.out.print("Digite o "+ (y+1) + "o. valor: ");
			valores[y] = leia.nextInt();
		} 
		for (int y = 0; y < valores.length; y++) {
			System.out.println("O valor do " + (y+1) + "o. é: " + valores[y]);
			if (valores[y] > maior ) {
				maior = valores[y];
			}
		}
	
	System.out.printf("E o maior valor é: %d" , maior);
	
	leia.close();
	}
}
