package LISTA04_POO;

public class Aviao { // CLASSE
	/*YURI MINA RAMPAZO - TURMA 18 - GENERATION BRASIL.
	*PROPOSTA:
	*2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
	* esta classe, em seguida crie um objeto avi�o, defina as instancias deste
	* objeto e apresente as informa��es deste objeto no console.*/
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
		System.out.println("N�mero de s�rie: "+ id);

		System.out.println("N�mero assentos: " + assentos );
		System.out.println("Cor do avi�o: " + cor);
		System.out.println("Velocidade m�xima do modelo: " + velocidadeMaxima);
		System.out.println("--------------------------------------");
	}
}