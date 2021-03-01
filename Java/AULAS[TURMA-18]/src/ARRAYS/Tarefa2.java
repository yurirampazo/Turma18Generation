package ARRAYS;

import java.util.Random;
import java.util.Scanner;

public class Tarefa2 {
	
	/* Yuri Mina Rampazo	- Turma 18 - GeneratiON Brasil!
	Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
	que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
	imprima a média aritmética dos lançamentos, contabilize e apresente também
	quantas foram as ocorrências da maior pontuação.*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lancamentos[] = new int [3];
		double mediaAritmetica = 0.00;
		int maiorPontuacao = 0;
		int contMaior = 0;
		double somaValores =0.00;
		Random numeroDado = new Random(); //instanciar - chamar criar -CLASSE, MAIS CLEAN
		
		
		for (int x = 0; x < lancamentos.length; x++) {
			System.out.printf("Digite o valor do %dº lancamento : ",(x+1));
			//lancamentos[x] = (int) (Math.random() *6-1)+1; METODO ROOTS
			//(maximo-minimo)+numero do contadorque inicia com 0
			lancamentos[x] = numeroDado.nextInt(6)+1;
			//chama os lancamentos -  nºaleatorio(maiornumero) + numeor inicial
			somaValores += lancamentos[x];
			maiorPontuacao = Math.max(maiorPontuacao,lancamentos[x]);
			
		}	
		for (int x = 0; x < lancamentos.length; x++) {
			System.out.printf("\nO valor do %d lançamento é: %d",(x+1),lancamentos[x]);
			if (lancamentos[x] == maiorPontuacao) {
				contMaior++;
			}	
		}
		mediaAritmetica = somaValores / lancamentos.length;
		System.out.printf("\nSoma de lançamentos sorteados:  %.0f",somaValores);
		System.out.printf("\nA média aritmética é: %.2f",mediaAritmetica);
		System.out.printf("\nO maior valor sorteado foi: %d",maiorPontuacao);
		System.out.printf("\nO maior valor aparece %d vezes",contMaior);
	sc.close();
	}
}