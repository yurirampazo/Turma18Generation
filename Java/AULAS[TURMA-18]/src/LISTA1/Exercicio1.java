package LISTA1;
	import java.util.Scanner;

	public class Exercicio1 {
		
		/* YURI MINA RAMPAZO - GENERATION BRASIL - TURMA 18
		 * 1. 
		 *PROJETO: 
		 *1. Faça um sistema que leia a idade de
		 * uma pessoa expressa em anos, meses e
		 * dias e mostre-a expressa apenas em dias.
		 */
		
		public static void main(String[] args) {
			Scanner sc =  new Scanner (System.in);
			int idade = 0; 	// poderia declarar após a entrada de dados
			int idadeEmDias = 0;
			
			System.out.println("Digite sua idade em anos: ");
			idade = sc.nextInt();
					
			idadeEmDias	= (idade * 365);
			
			System.out.println("Sua idade em dias é aproximadamente: " + idadeEmDias);
			
			sc.close();
			
		}
		
}
