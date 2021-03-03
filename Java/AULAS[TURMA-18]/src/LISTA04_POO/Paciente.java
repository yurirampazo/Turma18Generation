package LISTA04_POO;

public class Paciente {
	/*YURI MINA RAMPAZO - TURMA 18 - GENERATION BRASIL.
	*PROPOSTA:
	*7) Crie uma classe paciente e apresente os atributos e métodos referentes
	* esta classe, em seguida crie um objeto paciente, defina as instancias deste
	* objeto e apresente as informações deste objeto no console.*/
	String nome, sintomas;
	int idade, tempo;
		
	public void Dados() {
		System.out.println("--------------------------------------");
		System.out.println("         DADOS PARA TRIAGEM:          ");
		System.out.println("--------------------------------------");
		System.out.println("Nome do cliente: "+ nome);
		System.out.println("Idade do cliente: " + idade);
		System.out.println("Sintomas: " + sintomas);
		System.out.println("Tempo que apresenta os sintomas em dias: " + tempo);
		System.out.println("--------------------------------------");
	}
}