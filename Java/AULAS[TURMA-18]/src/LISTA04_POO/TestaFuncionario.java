package LISTA04_POO;

import TESTE.Funcionario;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		func.setNome("Yuri");
		func.setSalario(2500);
		
		System.out.println("Nome do funcion�rio: " + func.getNome());
		System.out.println("Sal�rio: " + func.getSalario());
		
	}
}
