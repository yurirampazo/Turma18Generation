package LISTA04_POO;

import java.util.Scanner;

public class TesteAviao { //PROGRAMA
	/*YURI MINA RAMPAZO - TURMA 18 - GENERATION BRASIL.
	*PROPOSTA:
	*2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
	* esta classe, em seguida crie um objeto avi�o, defina as instancias deste
	* objeto e apresente as informa��es deste objeto no console.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aviao aviao = new Aviao();
		
		System.out.print("Digite o modelo da aeronave: ");
		aviao.modelo = sc.nextLine();
		System.out.print("Digite o n�mero de s�rie da aeronave: ");
		aviao.id = sc.nextInt();
		
		System.out.print("Digite o n�mero de assentos: ");
		aviao.assentos = sc.nextInt();
		System.out.print("Digite a cor do avi�o: ");
		aviao.cor = sc.nextLine();
		System.out.print("Digite velocidade m�xima do avi�o: [km/h]");
		aviao.velocidadeMaxima = sc.nextDouble();
		for(int i = 0; i < 30; i++) {
			System.out.println();
		}
		aviao.Dados();
	sc.close();
	}
}
