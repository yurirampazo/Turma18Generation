package LISTA04_POO;

import TESTE.Funcionario;

public class TestaFuncionario {
	
	/*YURI MINA RAMPAZO - TURMA 18 - GENERATION BRASIL.
	*PROPOSTA:
	*4) Crie uma classe funcionário e apresente os atributos e métodos
	* referentes esta classe, em seguida crie um objeto funcionário, defina as
	* instancias deste objeto e apresente as informações deste objeto no
	* console.*/

	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		func.setNome("Yuri");
		func.setSalario(2500);
		
		System.out.println("Nome do funcionário: " + func.getNome());
		System.out.println("Salário: " + func.getSalario());
		
	}
}
