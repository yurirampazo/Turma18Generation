package LISTA03;

import java.util.Scanner;

public class Ex04 {
	/* YURI MINA RAMPAZO - TURMA 18 - GENERATION BRASIL.
	*PROPOSTA:
	*4- Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
	* psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
	* era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
	* (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
	* agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
	* pessoas, calcule e mostre: (WHILE)
	- o n�mero de pessoas calmas;
	- o n�mero de mulheres nervosas;
	- o n�mero de homens agressivos;
	- o n�mero de outros calmos;
	- o n�mero de pessoas nervosas com mais de 40 anos;
	- o n�mero de pessoas calmas com menos de 18 anos.*/


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int idade = 0, i = 0, outrosCalmos = 0, mulheresNervosas = 0, homensAgressivos = 0; 
		int maior40 = 0, menor18 = 0, calmas = 0, humor = 0;
		char genero;
		
		while (i < 2) {
			System.out.println("Digite sua idade: ");
			idade = input.nextInt();
			if (idade < 0) {
				System.out.println("Voc� n�o pode ter idade negativa. Isso � biologicamente IMPOSS�VEL!");
				idade = input.nextInt();
			}
			System.out.println("Digite seu g�nero: [F/O/M]");
			genero = input.next().toUpperCase().charAt(0);
			if (genero != 'F' && genero !='O' && genero != 'M') {
				System.out.println("Voc� n�o digitou um g�nero v�lido. Tente novamente [F/O/M]");
				genero = input.next().toUpperCase().charAt(0);
			}
			System.out.println("Digite um n�mero de acordo "
					+ "com o seu h�mor: \n1 - CALMO \n2 - NERVOSO \n3 - AGRESSIVO");
			humor = input.next().charAt(0);
			if (humor != '1' && humor != '2' && humor != '3') {
				System.out.println("Voc� n�o digitou um h�mor conhecido. Tente novamente [1/2/3]");
				humor = input.next().charAt(0);
			} else if (humor == '1' ) {
				calmas++;
			} else if (humor == '1' && genero =='O') {
					outrosCalmos++;
			} else if (idade < 18 && humor == '1') {
					menor18++;
			} else if (humor == '2' && genero =='F') {
					mulheresNervosas++;
			} else if (idade > 40 && humor == '2') {
					maior40++;
			} else if ( humor == '3' && genero =='H') {
					homensAgressivos++;
			}
			
		 i++;
		}
		System.out.println("Existem " + calmas + " pessoas calmas.");
		System.out.println("Existem " + mulheresNervosas + "mulheres nervosas.");
		System.out.println("Existem " + homensAgressivos + "homens agressivos.");
		System.out.println("Existem " + homensAgressivos + "homens agressivos.");
		System.out.println("Existem " + outrosCalmos + "outros calmos.");
		System.out.println("Existem " + maior40 + "pessoas nervosas com mais de 40 anos.");
		System.out.println("Existem " + menor18 + "pessoas calmas com menos de 18 anos.");
	input.close();
	}
}
