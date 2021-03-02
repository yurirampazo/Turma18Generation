package POO;

public class Bicicleta {
	int velocidade = 0;  //atiributo1
	int marcha = 0;		//atributo2
	
	public void mudarMarcha(int novoValor) {
		marcha = novoValor;
	}
	public void aumentarVelocidade(double incremento) {
		velocidade += incremento;
	}
	public void freiar(double decremento) {
		velocidade -= decremento;
	}

}
