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
			System.out.printf("Voc� possui %d anos e est� no grupo: Infantil A = 5 a 7 anos!", idade);
		}
		else if (idade >= 8 && idade <= 11) {
			System.out.printf("Voc� possui %d anos e est� no grupo: Infantil B = 8 a 11 anos!", idade);
		}
		else if (idade >= 12 && idade <= 13) {
			System.out.printf("Voc� possui %d anos e est� no grupo: Juvenil A = 12 a 13 anos!", idade);
		}
		else if (idade >= 14 && idade <= 17) {
			System.out.printf("Voc� possui %d anos e est� no grupo: Juvenil B = 14 a 17 anos!", idade);
		}
		else if (idade > 17 && idade <= 18) {
			System.out.printf("Voc� possui %d anos e n�o possu� grupo, mas � quase um adulto!", idade);
		}
		else if (idade > 18) {
			System.out.printf("Voc� possui %d anos e est� no grupo: Adultos > 18 anos!", idade);
		}
		System.out.printf("Obrigado por utilizar nosso programa!");		
		sc.close();
		}
}
