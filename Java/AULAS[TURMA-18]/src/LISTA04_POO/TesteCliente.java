package LISTA04_POO;

import java.util.Scanner;

public class TesteCliente {
	/*YURI MINA RAMPAZO - TURMA 18 - GENERATION BRASIL.
	*PROPOSTA:
	*1) Crie uma classe cliente e apresente os atributos e métodos referentes
	* esta classe, em seguida crie um objeto cliente, defina as instancias deste
	* objeto e apresente as informações deste objeto no console.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cliente cliente = new Cliente();

		System.out.print("Digite o nome do cliente: ");
		cliente.nome = sc.nextLine();
		System.out.print("Digite o CPF do cliente: ");
		cliente.cpf = sc.nextLine();
		System.out.print("Digite a sua idade: ");
		cliente.idade = sc.nextInt();
		cliente.Dados();
	sc.close();
	}
}
