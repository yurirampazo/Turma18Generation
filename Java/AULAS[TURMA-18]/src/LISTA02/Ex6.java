package LISTA02;

import java.util.Scanner;

public class Ex6 {
	/* YURI MINA RAMPAZO - TURMA 18 - GENERATION BRASIL.
	*PROPOSTA:
	*6) Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes
	* categorias:
	* Infantil A = 5 a 7 anos
	* Infantil B = 8 a 11 anos
	* Juvenil A = 12 a 13 anos
	* Juvenil B = 14 a 17 anos
	* Adultos = Maiores de 18 anos
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		if (idade >= 5 && idade <= 7) {
			System.out.printf("Você possui "+ idade + " anos e está no grupo: Infantil A = 5 a 7 anos!");
		}
		else if (idade >= 8 && idade <= 11) {
			System.out.println("Você possui " + idade + " anos e está no grupo: Infantil B = 8 a 11 anos!");
		}
		else if (idade >= 12 && idade <= 13) {
			System.out.println("Você possui " + idade + " anos e está no grupo: Juvenil A = 12 a 13 anos!");
		}
		else if (idade >= 14 && idade <= 17) {
			System.out.println("Você possui " + idade + " anos e está no grupo: Juvenil B = 14 a 17 anos!");
		}
		else if (idade > 17 && idade <= 18) {
			System.out.println("Você possui " + idade + " anos e não possuí grupo, mas é quase um adulto!");
		}
		else if (idade > 18) {
			System.out.println("Você possui " + idade + " anos e está no grupo: Adultos > 18 anos!");
		}
		System.out.println("Obrigado por utilizar nosso programa!");		
		sc.close();
		}
}
