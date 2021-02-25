package LISTA2;

import java.util.Scanner;

public class Ex2 {
	class Exercicio1 {
		/* YURI MINA RAMPAZO - GENERATION BRASIL - TURMA 18
		 *PROJETO:
		 *2- Faça um programa que entre com 
		 *três números e coloque em ordem crescente.*/
		public void main(String[] args) {		// ctrl + shift + o = inicializa JAVA UTIL
			Scanner sc = new Scanner (System.in);
			System.out.print("Digite um número inteiro: ");
			int numero1 = sc.nextInt();
			System.out.print("Digite outro número inteiro: ");
			int numero2 = sc.nextInt();
			System.out.print("Digite mais um número inteiro: ");
			int numero3 = sc.nextInt();
			
			if (numero1 > numero2 && numero2 >= numero3) {
				System.out.printf("Ordem crescente: " , "\n1o." ,numero3
						+  "\n2o." +numero2 + "\n3o." +numero1);
			}	
			else if (numero2 > numero1 && numero1 >= numero3) {
				System.out.printf("Ordem crescente: " + "\n1o." +numero3
						+  "\n2o." +numero1 , "\n3o." +numero2);
			}
			else if (numero2 > numero3 && numero3 >= numero1) {
					System.out.printf("Ordem crescente: " + "\n1o." ,numero1
							+  "\n2o." +numero3 , "\n3o." +numero2);	
			}
			else if (numero2 > numero1 && numero1 >= numero3) {
				System.out.printf("Ordem crescente: " , "\n1o." +numero3
						,  "\n2o." ,numero1 , "\n3o." +numero2);	
			}
			else if (numero3 > numero2 && numero2 >= numero1){
				System.out.printf("Ordem crescente: " , "\n1o." +numero1
						,  "\n2o." +numero2 , "\n3o." +numero3);
			}
			else if (numero3 > numero1 && numero1 >= numero2){
				System.out.printf("Ordem crescente: " , "\n1o." +numero2
						+  "\n2o." ,numero1 , "\n3o." ,numero3);
			}
			sc.close();
		}
}
}
