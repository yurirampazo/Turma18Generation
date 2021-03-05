package APLICACAO;

import java.util.Scanner;

import CLASSES.Conta;

public class Teste {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Conta conta1 = new Conta (1,"111.111.111-15");
		Conta conta2 = new Conta(2);
		Conta conta3 = new Conta(3,"444.555.666-14",true);
		double valor;
		char opcao = 0;
		
		
		System.out.println("Digite o valor: ");
		valor = leia.nextDouble();
		System.out.println("Débito ou crédito? [D/C]: ");
		valor = leia.nextLine().toUpperCase().charAt(0);
		if (opcao == 'D') {
			conta3.debito(valor);
		}
		else if (opcao == 'C') {
			conta3.credito(valor);
		}	
		//onta3.credito(valor);
		//nta3.debito(45.25);
		System.out.println(conta3.getSaldo());
	leia.close();
	}
}
