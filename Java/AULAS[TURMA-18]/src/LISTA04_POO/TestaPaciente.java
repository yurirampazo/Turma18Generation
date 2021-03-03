package LISTA04_POO;

import java.util.Scanner;

public class TestaPaciente {
	/*YURI MINA RAMPAZO - TURMA 18 - GENERATION BRASIL.
	*PROPOSTA:
	*7) Crie uma classe paciente e apresente os atributos e métodos referentes
	* esta classe, em seguida crie um objeto paciente, defina as instancias deste
	* objeto e apresente as informações deste objeto no console.*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Paciente paciente = new Paciente();

		System.out.print("Olá qual o seu seu nome? ");
		paciente.nome = sc.nextLine();
		System.out.print("Quantos anos você tem? ");
		paciente.idade = sc.nextInt();
		System.out.print("Quais sintomas está sentindo? ");
		paciente.sintomas = sc.next();
		System.out.print("A quantos dias está assim? ");
		paciente.tempo = sc.nextInt();
		
		paciente.Dados();
	sc.close();
	}
}