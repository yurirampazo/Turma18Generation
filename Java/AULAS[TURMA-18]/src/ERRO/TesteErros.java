package ERRO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteErros {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		// se - if  - DESVIO CONDICIONAL  -    switch FUNÇÕES 
		// for - while  - do while  --- LAÇOS DE REPETICAO
		//try - catch
		
		int numero = 0;
		String nomes[] = {"JOAO","MARIA", "PEDRO"};
		
		try {			//TESTAR ERRO

			System.out.println("Digite o nº da posição do vetor: [0 - 2]");
			numero = leia.nextInt();
			
			
			System.out.println("O nome escolhido foi : " + nomes [numero]);
			
		}
		
		catch (InputMismatchException erro ) {		//DEMONSTRAR O QUE É O ERRO
			System.out.println("Você digiitou uma letra on invés de um número!!!");
		}
		
		catch (java.lang.ArrayIndexOutOfBoundsException erro) {  //DEMONSTRAR O QUE É O ERRO
			System.out.println("Você ultrapassou o limite de índices contidos no vetor!!!");
		}
		
		finally	{ 			//PARA TRABALHAR COM BANCO DE DADOS!!!  FECHAR CONEXÕES ABERTAS!!!!
			
			System.out.println("TODA PROATIVIDADE SERÁ CASTIGADA, CÉUSSSS!!!");
		}
		
		leia.close();
	}	
		//ERRO DE TIPO DIFERENTE - java.util.InputMismatchException
		// 	ERRO DE  LIMITE DE VETOR ULTRAPASSADO java.lang.ArrayIndexOutOfBoundsException	
}