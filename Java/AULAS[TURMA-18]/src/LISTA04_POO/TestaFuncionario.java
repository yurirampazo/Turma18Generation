package LISTA04_POO;

import TESTE.Funcionario;

public class TestaFuncionario {
	
	/*YURI MINA RAMPAZO - TURMA 18 - GENERATION BRASIL.
	*PROPOSTA:
	*4) Crie uma classe funcion�rio e apresente os atributos e m�todos
	* referentes esta classe, em seguida crie um objeto funcion�rio, defina as
	* instancias deste objeto e apresente as informa��es deste objeto no
	* console.*/

	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		func.setNome("Yuri");
		func.setSalario(2500);
		
		System.out.println("Nome do funcion�rio: " + func.getNome());
		System.out.println("Sal�rio: " + func.getSalario());
		
	}
}
