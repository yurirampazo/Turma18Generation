package LISTA04_POO;

public class Patinete {
	/*YURI MINA RAMPAZO - TURMA 18 - GENERATION BRASIL.
	*PROPOSTA:
	*5) Crie uma classe patinete e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto patinete, defina as instancias deste
	objeto e apresente as informações deste objeto no console.*/
	int velocidade = 0;  //atiributo1
	int rodas = 2;		//atributo2
	
	public void aumentarVelocidade(double incremento) {
		velocidade += incremento;
	}
	public void freiar(double decremento) {
		velocidade -= decremento;
	}

}