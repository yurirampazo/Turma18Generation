package LISTA04_POO;

public class Aviao { // CLASSE
	/*YURI MINA RAMPAZO - TURMA 18 - GENERATION BRASIL.
	*PROPOSTA:
	*2) Crie uma classe avião e apresente os atributos e métodos referentes
	* esta classe, em seguida crie um objeto avião, defina as instancias deste
	* objeto e apresente as informações deste objeto no console.*/
	double velocidadeMaxima;
	String cor;
	String modelo;
	int assentos;
	int id;
			
	public void Dados() {
		System.out.println("--------------------------------------");
		System.out.println("           DADOS DA AERONAVE:         ");
		System.out.println("--------------------------------------");
		System.out.println("Modelo da aeronave: "+ modelo);
		System.out.println("Número de série: "+ id);

		System.out.println("Número assentos: " + assentos );
		System.out.println("Cor do avião: " + cor);
		System.out.println("Velocidade máxima do modelo: " + velocidadeMaxima);
		System.out.println("--------------------------------------");
	}
}