package ERRO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteErros {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		// se - if  - DESVIO CONDICIONAL  -    switch FUN��ES 
		// for - while  - do while  --- LA�OS DE REPETICAO
		//try - catch
		
		int numero = 0;
		String nomes[] = {"JOAO","MARIA", "PEDRO"};
		
		try {			//TESTAR ERRO

			System.out.println("Digite o n� da posi��o do vetor: [0 - 2]");
			numero = leia.nextInt();
			
			
			System.out.println("O nome escolhido foi : " + nomes [numero]);
			
		}
		
		catch (InputMismatchException erro ) {		//DEMONSTRAR O QUE � O ERRO
			System.out.println("Voc� digiitou uma letra on inv�s de um n�mero!!!");
		}
		
		catch (java.lang.ArrayIndexOutOfBoundsException erro) {  //DEMONSTRAR O QUE � O ERRO
			System.out.println("Voc� ultrapassou o limite de �ndices contidos no vetor!!!");
		}
		
		finally	{ 			//PARA TRABALHAR COM BANCO DE DADOS!!!  FECHAR CONEX�ES ABERTAS!!!!
			
			System.out.println("TODA PROATIVIDADE SER� CASTIGADA, C�USSSS!!!");
		}
		
		leia.close();
	}	
		//ERRO DE TIPO DIFERENTE - java.util.InputMismatchException
		// 	ERRO DE  LIMITE DE VETOR ULTRAPASSADO java.lang.ArrayIndexOutOfBoundsException	
}