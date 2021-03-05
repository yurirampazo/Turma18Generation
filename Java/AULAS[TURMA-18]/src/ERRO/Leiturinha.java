package ERRO;

import java.io.File;		// --INPUT: ENTRADA 		---- OUTPUT: SAIDA
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Leiturinha {
	
	public static void main(String[] args) {
		File arquivo = new File ("C: \\teste\\lista.txt");
		Scanner sc = null;
		
		
		try {
			
			sc = new Scanner (arquivo);
			while (sc.hasNextLine()) {
				
				System.out.println(sc.nextLine());
			}
		}
		
		catch (FileNotFoundException erro){
			
			System.out.println("Arquivo não encontrado!");
		}
		
		finally {
			if (sc != null) {
				
				sc.close();
			}
			
		}
	}
}