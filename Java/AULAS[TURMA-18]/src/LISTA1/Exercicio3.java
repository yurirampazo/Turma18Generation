package LISTA1;

import java.util.Scanner;

public class Exercicio3 {
	/* YURI MINA RAMPAZO - GENERATION BRASIL - TURMA 18
	 * PROJETO: 
	 *3. Fa�a um sistema que leia o tempo de 
	 * dura��o de um evento em uma f�brica
	 * expressa em segundos e mostre-o
 	 * expresso em horas, minutos e segundos.
 	 */
	
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
			
		
		System.out.println("Digite o tempo de dura��o do evento em segundos: ");
		int duracao = sc.nextInt(); 
		
		int horas = duracao / 3600;
		int minutos = (duracao % 3600) / 60;
		int segundos = (duracao % 3600) % 60;
		
		System.out.println("O tempo de dura��o do evento �: "
		+ ""+ horas + "horas, " + minutos + "minutos e "+ segundos +"segundos.");
		
		sc.close();		
		
	}


}
