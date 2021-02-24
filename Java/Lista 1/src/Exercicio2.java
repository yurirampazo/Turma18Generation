import java.util.Scanner;

public class Exercicio2 {
	/* YURI MINA RAMPAZO - GENERATION BRASIL - TURMA 18
	 * PROJETO: 
	 *2. Faça um sistema que leia a idade de 
	 * uma pessoa expressa em dias e mostre-a
	 * expressa em anos, meses e dias.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int idadeEmDias = 0;
		int idade = 0;
		int anos = 0;
		int meses = 0; 
		int dias = 0;
		
		System.out.println("Digite sua idade em dias: ");
		idadeEmDias = sc.nextInt();
		
		anos = idadeEmDias / 365;
		meses = (idadeEmDias % 365) /30;
		dias =(idadeEmDias % 365) % 30;
		
		System.out.println("Sua idade em aproximada é: "+ anos +" anos, "+ meses +" meses e "+ dias +"dias.");
		
	}
	

		
}
