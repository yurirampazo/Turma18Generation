package LISTA04_POO;

public class Funcionario {
	/*YURI MINA RAMPAZO - TURMA 18 - GENERATION BRASIL.
	*PROPOSTA:
	*4) Crie uma classe funcion�rio e apresente os atributos e m�todos
	* referentes esta classe, em seguida crie um objeto funcion�rio, defina as
	* instancias deste objeto e apresente as informa��es deste objeto no
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
