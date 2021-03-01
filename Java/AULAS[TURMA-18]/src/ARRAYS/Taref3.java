package ARRAYS;

import java.util.Random;
import java.util.Scanner;

public class Taref3 {
	public static void main(String[] args) {
		/*Yuri Mina Rampazo - Turma 18 - Generation Brasil
		Projeto:
		4. Crie um programa que receba valores do 
		usu�rio para preencher uma matriz 3X3, e
		em seguida, exiba a soma dos valores dela 
		e a soma dos valores da primeira
		diagonal, ou seja, diagonal principal.
		*/
		//vari�veis:
		Scanner leia = new Scanner(System.in);
		int matriz[][] = new int[3][3];
		final int LINHA = 3, COLUNA = 3;
		int l = 0, c = 0,somaTotal = 0, somaDiagonal = 0;
		Random aleatorio = new Random();	
		//In�cio do Programa:
		for (l = 0; l < LINHA; l++) {
			for (c = 0; c < COLUNA; c++) {
			//System.out.printf("Digite um valor: ");
			//matriz[l][c] = leia.nextInt();
			matriz[l][c] = aleatorio.nextInt(99)+1;
			
			somaTotal += matriz[l][c];
			}
		}
		System.out.println(" ------------------------");
		System.out.println("    MATRIZ [3 X 3]       ");
		System.out.println(" ------------------------");
		for (l = 0; l < LINHA; l++) {
			for(c = 0; c < COLUNA; c++){
			if (l == c) {
				somaDiagonal = (matriz[l][c] + matriz[l][c] + matriz[l][c]);
			}
			System.out.printf("[ %d ]\t",matriz[l][c]);	
			if (c == 2) {
				System.out.println(" ");
			}
			}
		}
		System.out.printf("\nA soma total da matriz �: %d",somaTotal);
		
		System.out.printf("\nA soma da diagonal principal �: %d",somaDiagonal);
		leia.close();
	}
}


