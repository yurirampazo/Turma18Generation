package EXEMPLOSIF;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int numero = 0;
		System.out.print("Digite um n�mero real inteiro para saber se � par ou �mpar: ");
		numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			if ( numero < 0) {
				System.out.println("O n�mero " + numero + ", � par e negativo.");
			}
			else {
				System.out.println("O n�mero " + numero + ", � par e positivo.");
			}
		}
		else if (numero % 2 != 0) {
			if ( numero < 0) {
				System.out.println("O n�mero " + numero + ", � �mpar e negativo.");
			}
			else {
				System.out.println("O n�mero " + numero + ", � �mpar e positivo.");
			}
			// Com System.out.printf(numero)
			// %d - numero int - inteiro
			// %s - tipo String - cadeia de caractere
			// %f - tipo double -- .0f (2 casas decimais		
		}
		sc.close();
	}
}
