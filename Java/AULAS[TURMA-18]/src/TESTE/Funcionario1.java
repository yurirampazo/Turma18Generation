package TESTE;

public class Funcionario1 extends Pessoa {
	private String departamento;
	
	public Funcionario1(String nome, int matricula, String departamento) {
		super(nome,matricula);  //atribuição de parametros da herança da superclasse
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
}
