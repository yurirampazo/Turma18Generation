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
		real ex = 0.00, m = 0.00, p = 0.00
		const real LIMITEKG = 50.00, VALORMULTA = 4.00  
		//inicioDoPrograma
		escreva("Digite o peso do produto: ")
		leia(p)
		limpa()
		se (p > LIMITEKG) {
			ex = p - LIMITEKG
			m = VALORMULTA * ex
			escreva("Você ultrapassou o limite permitido por ",ex,"[kg]. Sua multa é de R$: ",m)
		}
		escreva("O excesso de peso do produto é: ",ex,"[kg]. \nA multa é R$ ",m)
		escreva("\nObrigado por utilizar nosso programa!")
	}	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1129; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */