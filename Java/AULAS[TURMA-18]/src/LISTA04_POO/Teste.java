package LISTA04_POO;

import java.util.Scanner;

public class Teste {
	/* YURI MINA RAMPAZO - GENERATION BRASIL - TURMA 18
	 * PROJETO: 
	 * 6) Crie uma classe conta bancaria e apresente os atributos e métodos
	 * referentes esta classe, em seguida crie um objeto conta bancaria, defina
	 * as instancias deste objeto e apresente as informações deste objeto no
	 * console.
	 * */

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		//Conta conta1 = new Conta (1,"111.111.111-15");
		//Conta conta2 = new Conta(2);
		Conta conta3 = new Conta(3,"444.555.666-14",true);
		double valor;
		char opcao = 0;
		
		
		System.out.println("Digite o valor: ");
		valor = leia.nextDouble();
		System.out.println("Débito ou crédito? [D/C]: ");
		opcao = leia.next().toUpperCase().charAt(0);
		if (opcao == 'D') {
			conta3.debito(valor);
		}
		else if (opcao == 'C') {
			conta3.credito(valor);
		} else {
			System.out.println("Opção inválida!!!");
		}
			
		//onta3.credito(valor);
		//nta3.debito(45.25);
		System.out.println("Saldo atual: " + conta3.getSaldo());
	leia.close();
	}
}
