programa
{	/* Yuri Mina Rampazo - Turma 18 - Generation Brasil
	*  Porposta do Projeto:
	/*4- Obtenha um número digitado pelo usuário e repita 
	a operação de multiplicar ele por
	três (imprimindo o novo valor) até que ele 
	seja maior do que 100. Ex.: se o usuário
	digita 5, deveremos observar na tela 
	a seguinte sequência: 5 15 45 135.*/
	
	funcao inicio()
	{	real numero = 0.00, total = 0.00
		
		enquanto (total <= 100) {
		escreva("\nDigite um número: ")
		leia(numero)	
		total = numero + total 
		escreva("Subtotal: ", total)
		}		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 540; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */