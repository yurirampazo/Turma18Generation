import java.util.Scanner;

public class Familia {

	public static void main(String[] args) {  	
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o nome da sua mãe: ");
		String nomeMae = sc.next();
		System.out.println("Digite o nome do seu pai: ");
		String nomePai = sc.next();
		System.out.println("Digite o seu nome: ");
		String nome = sc.next();
				
		System.out.println("\nO nome da sua mãe é: " + nomeMae + 
				"\nO nome do seu pai é: " + nomePai + "\nO seu nome é: " + nome);
		
		sc.close();
	}
}
