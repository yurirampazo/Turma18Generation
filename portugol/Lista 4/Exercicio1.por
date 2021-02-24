programa
{	/*1. Faça um programa que crie um vetor 
	por leitura com 5 valores de pontuação de uma
	atividade e o escreva em seguida. 
	Encontre após a maior pontuação e a apresente.
	*/
	
	funcao inicio()
	{
		inteiro valor[5],maior = 0
	
		para (inteiro i =0; i < 5; i++) {
			escreva("Digite uma pontução para a direção do filme: ")
			leia(valor[i])
			limpa()
			se (valor[i] > maior) {
				maior = valor[i]
			}
			
		}
		para (inteiro i=0; i < 5; i++) {
			escreva("\n",i+1,"o. Pontuação: ",valor[i])
		}
		escreva("\nO maior valor atribuído foi: ",maior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 569; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */