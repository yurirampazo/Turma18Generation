package CLASSESEXEMPLOS;

public class Funcionario {
	//ATRIBUTOS
	private String nome;
	private int matricula;
	protected int horasTrabalhadas;
	protected double valorPorHora;
	
	//CONSTRUTORES
	public Funcionario(String nome, int matricula, int horasTrabalhadas, double valorPorHora) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorPorHora = valorPorHora;
	}
	
	
	//GETTERS AND SETTERS
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	
	//METODOS GENÉRICOS
	public double salario () {
		
		return (horasTrabalhadas * valorPorHora);
	}
	// SOBRECARGA METODO SALARIO
	public double salario (double imposto) {
		return (horasTrabalhadas * valorPorHora) - ((horasTrabalhadas * valorPorHora) * imposto);
	}
}
