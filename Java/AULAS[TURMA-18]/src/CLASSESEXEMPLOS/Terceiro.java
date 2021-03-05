package CLASSESEXEMPLOS;

public class Terceiro extends Funcionario {
	//ATRIBUTOS
	private double adicional;
	
	//CONSTRUTOR
	public Terceiro(String nome, int matricula, int horasTrabalhadas, double valorPorHora, double adicional) {
		super(nome, matricula, horasTrabalhadas, valorPorHora);
		this.adicional = adicional;
	}
	
	//GETTERS AND SETTERS
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	//MÉTODO ESPECIAL DA SUBCLASSE
	@Override
	public double salario () {
		
		return (horasTrabalhadas * valorPorHora) + adicional;
	}
	@Override
	public double salario (double imposto) {
		return (horasTrabalhadas * valorPorHora) - ((horasTrabalhadas * valorPorHora) * imposto) + adicional;
	}
}
