package TESTE;

public class TestandoFuncionario {

	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		func.setNome("Yuri");
		func.setSalario(2500);
		
		System.out.println(func.getNome());
		System.out.println(func.getSalario());
	}
}
