package ExemplosEmSala;

import java.util.Scanner;

public class ExTriangulo {

	public static void main(String[] args) {
		/*BASE * ALTURA *2 // AREA DO TRIANGULO

		RECEBE DADOS DE 3 TRIANGULOS
		MOSTRA A BASE, ALTURA E A AREA DE CADA TRIANGULO*/
		Scanner leia = new Scanner (System.in);
		double area1 = 0.00, area2 = 0.00 ,area3 = 0.00;
		double base1 = 0.00, base2 = 0.00, base3 = 0.00;
		double altura1 = 0.00, altura2 = 0.00, altura3 = 0.00; 
		double maior = 0.00;
	
			System.out.print("Escreva a altura do 1º triângulo: [u.m]");
			altura1 = leia.nextDouble();
			System.out.print("Escreva a base do 1º triângulo: [u.m]");
			base1 = leia.nextDouble();
			area1 = base1*Math.pow(altura1, 2);
					if(area1 > maior) {
						maior = area1;
					};
			System.out.print("Escreva a altura do 2º triângulo: [u.m]");
			altura2 = leia.nextDouble();
			System.out.print("Escreva a base do 2º triângulo: [u.m]");
			base2 = leia.nextDouble();
			area2 = base2*Math.pow(altura2, 2);
			if(area2 > maior) {
				maior = area2;
			};
	
		
			System.out.println("Escreva a altura do 3º triângulo: [u.m]");
			altura3 = leia.nextDouble();
			System.out.print("Escreva a base do 3º triângulo: [u.m]");
			base3 = leia.nextDouble();
			area3 = base3*Math.pow(altura3, 2);
			if(area3 > maior) {
				maior = area3;
			};
			System.out.printf("\n-----------------------------");
			System.out.printf("\n       TRIÂNGULO 1:          ");
			System.out.printf("\n-----------------------------");
			System.out.printf("\nA altura do 1º triângulo é: %.2f [u.m]",altura1);
			System.out.printf("\nA base do 1º triângulo é: %.2f [u.m]",base1);
			System.out.printf("\nA area do 1º triângulo é: %.2f [u.m]",area1);
			System.out.printf("\n-----------------------------");
			System.out.printf("\n       TRIÂNGULO 2:          ");
			System.out.printf("\n-----------------------------");
			System.out.printf("\nA altura do 2º triângulo é: %.2f [u.m]",altura2);
			System.out.printf("\nA base do 2º triângulo é: %.2f [u.m]",base2);
			System.out.printf("\nA area do 2º triângulo é: %.2f [u.m]",area2);
			System.out.printf("\n-----------------------------");
			System.out.printf("\n       TRIÂNGULO 3:          ");
			System.out.printf("\n-----------------------------");
			System.out.printf("\nA altura do 2º triângulo é: %.2f [u.m]",altura3);
			System.out.printf("\nA base do 2º triângulo é: %.2f [u.m]",base3);
			System.out.printf("\nA area do 2º triângulo é: %.2f [u.m]",area3);
			System.out.printf("\nO maior triângulo é o: %.2f",maior);
			
		
	leia.close();
	}
}