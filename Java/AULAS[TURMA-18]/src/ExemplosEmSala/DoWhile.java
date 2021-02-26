package ExemplosEmSala;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner	leia = new Scanner(System.in);
		
		double numero= 0.00, maiorNumero = 0, soma = 0.00;
				
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextDouble();
			if (numero >= 0 ) {
				soma += numero;
				if (numero > maiorNumero) {
					maiorNumero = numero;
				}
			}
		} while (numero >= 0);
		if (numero < 0) {
			System.out.printf("Você digitou um número negativo \n "
					+ "A soma de tudo é: %.2f",soma);
		}
	leia.close();
	}
}
