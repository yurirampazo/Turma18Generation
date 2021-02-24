programa
{	/* Yuri Mina Rampazo - Turma 18 - Generation Brasil
	*  Porposta do Projeto:
	*  1) João, homem de bem, comprou um microcomputador para controlar o rendimento diário
	*de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
	*regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
	*excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) e
	*verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor
	*da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo
	*ZERO.
	*/
	
	funcao inicio()
	{	//variáveis
		real p = 0.00, ex = 0.00, m = 0.00
		//inicioDoPrograma
		escreva("Digite o peso do produto: ")
		leia(p)
		se (p > 50)
		{
			ex = p -50
			m = 4 * p
			escreva("Você ultrapassou o limite permitido por",ex,"[kg]. Sua multa é de R$: ",m)
		}
		senao
		{
			escreva("O peso do produtp é: ",p,"[kg]")
		}

		escreva("\nFim do programa!")		
	}	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 974; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */