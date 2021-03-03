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
		Conta conta1 = new Conta();
		conta1.setNumero(50475182);
		conta1.setTipo("Corrente");
		
		
		System.out.print("Digite seu CPF para criar sua conta corrente: ");
		conta1.cpf = leia.next();
		System.out.print("Digite somente o primeiro nome para validar o CPF: ");
		conta1.primeiroNome = leia.next();
		
				
		for(int i = 0; i < 30; i++) {
			System.out.println();
		}
		conta1.Dados();
		System.out.println("Seja bem vindo ao banco Gen18.\nEstamos felizes em te ter conosco!");
	leia.close();
	}
}
