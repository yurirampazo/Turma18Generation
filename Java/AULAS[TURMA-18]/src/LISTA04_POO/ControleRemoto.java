package LISTA04_POO;

public class ControleRemoto {
	/*YURI MINA RAMPAZO - TURMA 18 - GENERATION BRASIL.
	*PROPOSTA:
	*3) Crie uma classe produto eletr�nico e apresente os atributos e m�todos
	* referentes esta classe, em seguida crie um objeto produto eletr�nico,
	* defina as instancias deste objeto e apresente as informa��es deste objeto
	* no console.
	*/
	

	String cor;
	String marca;
	double canalAtual;
	double volumeAtual;
	
	void liga() {
		System.out.println("A televis�o liga...");
	}
	
	void mudaCanal(double numero) {
		double canalAtual = this.canalAtual + 1;
		this.canalAtual = canalAtual;
	}
	
	void aumentaVolume() {
		double volumeAtual = this.volumeAtual + 1;
		this.volumeAtual = volumeAtual;
	}
}
