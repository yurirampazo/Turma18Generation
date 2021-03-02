package LISTA04_POO;

import java.util.Scanner;

public class TesteCliente {

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
