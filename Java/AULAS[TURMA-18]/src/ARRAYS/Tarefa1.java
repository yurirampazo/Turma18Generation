package ARRAYS;

import java.util.Scanner;

public class Tarefa1 {
	/*Fa�a um programa que crie um valor  por leitura com 5 valores de pontua��o de uma atividade 
	 *e o escreva em seguida. Encontre ap�s a maior a pontua��o e a apresente.
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
			System.out.println("O valor do " + (y+1) + "o. �: " + valores[y]);
			if (valores[y] > maior ) {
				maior = valores[y];
			}
		}
	
	System.out.printf("E o maior valor �: %d" , maior);
	
	leia.close();
	}
}
