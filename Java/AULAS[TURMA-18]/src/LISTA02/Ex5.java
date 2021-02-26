package LISTA02;

import java.util.Scanner;

public class Ex5 {
	/* YURI MINA RAMPAZO - TURMA 18 - GENERATION BRASIL.
	*PROPOSTA:
	*5) A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de
	* indústrias que são altamente poluentes do meio ambiente. O índice de poluição aceitável
	* varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a
	* suspenderem suas atividades, se o índice crescer para 0,4 as industrias do 1º e 2º grupo são
	* intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser
	* notificados a paralisarem suas atividades. Faça um sistema que leia o índice de poluição
 	* medido e emita a notificação adequada aos diferentes grupos de empresas.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o índice de poluição entre 0.005 e 0.5: ");
		double indicep = sc.nextDouble();
		
		if(indicep >= 0.05 && indicep <=0.25) {
			System.out.println("O índice está aceitável, nenhuma empresa precisa encerrar as atividades!");
		}
		else if(indicep >= 0.3 && indicep < 0.4) {
			System.out.println("As industrias do 1º grupo devem suspender as atividades!");
		}
		else if(indicep >= 0.4 && indicep < 0.5) {
			System.out.println("As industrias do 1º e 2º grupo devem suspender as atividades!");	
		}
		else if(indicep == 0.5) {
			System.out.println("Todos os grupos de indústria devem suspender as atividades!");	
		}
		else if (indicep < 0.05 || indicep > 0.5) {
			System.out.println("Valor inválido para o índice. Por favor tente novamente!");
		}		
		System.out.println("\nObrigado por utilizar nosso programa!");		
		sc.close();
	}
}


