package EXEMPLOSIF;

import java.util.Scanner;

public class CategoriaIdade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			System.out.print("Digite a idade do nadador: ");
			int idade = sc.nextInt();
			if (idade < 5) {
				System.out.println("Infelizmente n�o podemos atender!");
		    }
			else if (idade <= 7)	{
		            System.out.println("Infantil A = 5 a 7 anos");
		    } 
			else if (idade <= 11)	{
		           System.out.println("Infantil B = 8 a 11 anos");
		    }
		    else if (idade <= 13)	{
		            System.out.println("Juvenil A = 12 a 13 anos");
		    }
		    else if (idade <= 17)	{
		            System.out.println("Juvenil B = 14 a 17 anos");
		    }
		    else {
		           System.out.println("Adultos = Maiores de 18 anos");
		        }
		        
		        System.out.println("OBRIGADO, VOLTE SEMPRE!");
		    sc.close();
	}
}
