package EXEMPLOSIF;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int numero = 0;
		System.out.print("Digite um número real inteiro para saber se é par ou ímpar: ");
		numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			if ( numero < 0) {
				System.out.println("O número " + numero + ", é par e negativo.");
			}
			else {
				System.out.println("O número " + numero + ", é par e positivo.");
			}
		}
		else if (numero % 2 != 0) {
			if ( numero < 0) {
				System.out.println("O número " + numero + ", é ímpar e negativo.");
			}
			else {
				System.out.println("O número " + numero + ", é ímpar e positivo.");
			}
			// Com System.out.printf(numero)
			// %d - numero int - inteiro
			// %s - tipo String - cadeia de caractere
			// %f - tipo double -- .0f (2 casas decimais		
		}
		sc.close();
	}
}
