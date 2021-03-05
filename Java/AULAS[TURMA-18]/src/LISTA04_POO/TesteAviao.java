package LISTA04_POO;

import java.util.Scanner;

public class TesteAviao { //PROGRAMA
	/*YURI MINA RAMPAZO - TURMA 18 - GENERATION BRASIL.
	*PROPOSTA:
	*2) Crie uma classe avião e apresente os atributos e métodos referentes
	* esta classe, em seguida crie um objeto avião, defina as instancias deste
	* objeto e apresente as informações deste objeto no console.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aviao aviao = new Aviao();
		
		System.out.print("Digite o modelo da aeronave: ");
		aviao.modelo = sc.nextLine();
		System.out.print("Digite o número de série da aeronave: ");
		aviao.id = sc.nextInt();
		
		System.out.print("Digite o número de assentos: ");
		aviao.assentos = sc.nextInt();
		System.out.print("Digite a cor do avião: ");
		aviao.cor = sc.nextLine();
		System.out.print("Digite velocidade máxima do avião: [km/h]");
		aviao.velocidadeMaxima = sc.nextDouble();
		for(int i = 0; i < 30; i++) {
			System.out.println();
		}
		aviao.Dados();
	sc.close();
	}
}
