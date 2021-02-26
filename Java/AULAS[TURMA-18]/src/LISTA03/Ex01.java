package LISTA03;

import java.util.Scanner;

public class Ex01 {
	/* YURI MINA RAMPAZO - TURMA 18 - GENERATION BRASIL.
	*PROPOSTA:
	* 1- Informar todos os números de 1000 a 1999 
	* que quando divididos por 11
	obtemos resto = 5. (FOR)*/
	public static void main(String[] args) {
		Scanner	leia = new Scanner(System.in);
		
		int resto5 = 0;
		
		for (int i =1000; i <=1999; i++) {
			if (i % 11 ==5) {
				resto5++;
				System.out.println(resto5);
			}
		}
	leia.close();
	}
}
