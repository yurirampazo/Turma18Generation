programa
{	/* Yuri Mina Rampazo - Turma 18 - Generation Brasil
	*  Porposta do Projeto:
	7) Receber valores de base e altura de um triângulo e 
	* verificar se são valores válidos (positivos maiores que zero). 
	* Em caso afirmativo, calcular a área do triângulo.
	*/
	
	funcao inicio()
	{	//variáveis
		real altura = 0.00, base = 0.00, area = 0.00
		//inicioDoPrograma
		escreva("Digite o valor da base do triângulo: ")
		leia(altura)
		escreva("Digite o valor da altura do triângulo: ")
		leia(base)
		se (altura > 0.00 e base > 0.00) {
			area = altura * base
			escreva("A área do triângulo é: ",area)
		}
		escreva("\nObrigado por utilizar nosso programa!")	
	}	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 662; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */