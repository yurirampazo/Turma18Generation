import java.util.Scanner;

public class Familia {

	public static void main(String[] args) {  	
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o nome da sua m�e: ");
		String nomeMae = sc.next();
		System.out.println("Digite o nome do seu pai: ");
		String nomePai = sc.next();
		System.out.println("Digite o seu nome: ");
		String nome = sc.next();
				
		System.out.println("\nO nome da sua m�e �: " + nomeMae + 
				"\nO nome do seu pai �: " + nomePai + "\nO seu nome �: " + nome);
		
		sc.close();
	}
}
