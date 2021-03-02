package LISTA04_POO;

public class Cliente {
	/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto cliente, defina as instancias deste
	objeto e apresente as informações deste objeto no console.*/
	String nome;
	int idade;
	String cpf;
	
	public void Dados() {
		System.out.println("--------------------------------------");
		System.out.println("            DADOS DO CLIENTE:         ");
		System.out.println("--------------------------------------");
		System.out.println("Nome do cliente: "+ nome);
		System.out.println("CPF do cliente: " + cpf );
		System.out.println("Idade do cliente: " + idade);
		System.out.println("--------------------------------------");
	}
}
