package LISTA04_POO;

public class Funcionario {
	/*YURI MINA RAMPAZO - TURMA 18 - GENERATION BRASIL.
	*PROPOSTA:
	*4) Crie uma classe funcionário e apresente os atributos e métodos
	* referentes esta classe, em seguida crie um objeto funcionário, defina as
	* instancias deste objeto e apresente as informações deste objeto no
	* console.*/
	
	private double salario;
	private String nome;
	public int matricula;
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
