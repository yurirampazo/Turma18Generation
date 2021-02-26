package LISTA02;

import java.util.Scanner;

public class Ex5 {
	/* YURI MINA RAMPAZO - TURMA 18 - GENERATION BRASIL.
	*PROPOSTA:
	*5) A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m 3 grupos de
	* ind�strias que s�o altamente poluentes do meio ambiente. O �ndice de polui��o aceit�vel
	* varia de 0,05 at� 0,25. Se o �ndice sobe para 0,3 as ind�strias do 1� grupo s�o intimadas a
	* suspenderem suas atividades, se o �ndice crescer para 0,4 as industrias do 1� e 2� grupo s�o
	* intimadas a suspenderem suas atividades, se o �ndice atingir 0,5 todos os grupos devem ser
	* notificados a paralisarem suas atividades. Fa�a um sistema que leia o �ndice de polui��o
 	* medido e emita a notifica��o adequada aos diferentes grupos de empresas.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o �ndice de polui��o entre 0.005 e 0.5: ");
		double indicep = sc.nextDouble();
		
		if(indicep >= 0.05 && indicep <=0.25) {
			System.out.println("O �ndice est� aceit�vel, nenhuma empresa precisa encerrar as atividades!");
		}
		else if(indicep >= 0.3 && indicep < 0.4) {
			System.out.println("As industrias do 1� grupo devem suspender as atividades!");
		}
		else if(indicep >= 0.4 && indicep < 0.5) {
			System.out.println("As industrias do 1� e 2� grupo devem suspender as atividades!");	
		}
		else if(indicep == 0.5) {
			System.out.println("Todos os grupos de ind�stria devem suspender as atividades!");	
		}
		else if (indicep < 0.05 || indicep > 0.5) {
			System.out.println("Valor inv�lido para o �ndice. Por favor tente novamente!");
		}		
		System.out.println("\nObrigado por utilizar nosso programa!");		
		sc.close();
	}
}


