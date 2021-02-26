package ExemplosEmSala;

import java.util.Scanner;

public class DesafioFuncao { // funcao com LACO DE REPETIÇÃO FOR.
	
	public static void main(String[] args) {
		//Var:
		int quantidade = 0;
		//Program:
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o tamanho linha: ");	
		quantidade = sc.nextInt();
		linha(quantidade);
		sc.close();
	}
	public static void linha(int quantidade) {
		for (int i = 0; i <= quantidade; i++) {
			System.out.print("-");
		}
	}
}
