package POO;

public class TesteLampada {

	public static void main(String[] args) {
		Lampada lamp1 = new Lampada();
		Lampada lamp2 = new Lampada();
		
		
		lamp1.acesa = true;
		lamp2.acesa = false;
		lamp1.desligar();
		lamp2.ligar();
	}
}
