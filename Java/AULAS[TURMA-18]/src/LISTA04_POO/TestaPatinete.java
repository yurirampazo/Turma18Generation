package LISTA04_POO;

public class TestaPatinete {
	/*YURI MINA RAMPAZO - TURMA 18 - GENERATION BRASIL.
	*PROPOSTA:
	*5) Crie uma classe patinete e apresente os atributos e m�todos referentes
	esta classe, em seguida crie um objeto patinete, defina as instancias deste
	objeto e apresente as informa��es deste objeto no console.*/

	int velocidade = 0;  //atiributo1
	int rodas = 0;		//atributo2
	

	public static void main(String[] args) {
		Patinete pat = new Patinete();
		System.out.println("O patinete sem andar est� a " + pat.velocidade + "[km/h]");	
		pat.aumentarVelocidade(3);
	
		System.out.println("O patinete agora est� andando a " + pat.velocidade + "[km/h]");	
		pat.aumentarVelocidade(3);
		System.out.println("O patinete possu� " + pat.rodas + " rodas.");
		
		
	}

}
