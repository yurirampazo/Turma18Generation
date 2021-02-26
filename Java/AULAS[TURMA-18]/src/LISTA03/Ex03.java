package LISTA03;

import java.util.Scanner;

public class Ex03 {
	/* YURI MINA RAMPAZO - TURMA 18 - GENERATION BRASIL.
	*PROPOSTA:
	*3- Solicitar a idade de várias pessoas e imprimir: 
	* Total de pessoas com menos de 21 anos. 
	* Total de pessoas com mais de 50 anos. 
	* O programa termina quandoidade for =-99. (WHILE)*/

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int idade = 0, menor21 = 0, maior50 = 0;
		
		while (idade != -99) {
			System.out.println("Digite sua idade: ");
			idade = sc.nextInt();
			if (idade > 50) {
				maior50++;
			} else if (idade < 21) {
				menor21++;
			}
		System.out.println("Total de pessoas com menos de 21 anos: " + menor21);	
		System.out.println("Total de pessoas com meais de 50 anos: " + maior50);	
		}

	sc.close();
	}/*nt idade = 0, total21 = 0, total50 = 0;
        Scanner ler = new Scanner(System.in);

        while (idade >-99) {

            System.out.print("Por favor,digite a sua idade: ");
            idade = ler.nextInt();

            if (idade == 21) {
                total21++;
            }
            if (idade == 50) {
                total50 ++ ;

            }
        }
        System.out.print("O total de pessoas com 21 anos: " + total21);
        System.out.print("O total de pessoas com 51 anos é: " + total50);*/

}
