programa
{	/* Yuri Mina Rampazo - Turma 18 - Generation Brasil
	*Proposta:
	*O usuário vai digitar um número inteiro positivo, 
	*diga se ele é par ou  ímpar*/
	
	funcao inicio()
	{	//váriaveis
		inteiro n = 0
		//inícioDoPrograma
		escreva("Digite um número inteiro positivo: ")
		leia(n)
		se (n <= 0)
		{
			escreva("Você inseriu um número inválido!")
		}
		senao se (n % 2 == 0)
		{
			escreva("O número ",n," é par.")
		}
		senao 
		{
			escreva("O número ",n," é ímpar.")
		}
		escreva("\nFim do programa!")			
	}			
}
	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 373; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */