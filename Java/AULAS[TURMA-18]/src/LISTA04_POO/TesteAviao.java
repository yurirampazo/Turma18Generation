package LISTA04_POO;

import java.util.Scanner;

public class TesteAviao {

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
		System.out.print("Digite velocidade m�xima do avi�o: ");
		aviao.velocidadeMaxima = sc.nextDouble();
		
		
	sc.close();
	}
}
