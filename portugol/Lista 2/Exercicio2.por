programa
{	/* Yuri Mina Rampazo - Turma 18 - Generation Brasil
	*  Porposta do Projeto:
	*  2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
	*horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
	*por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
	*armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
	*trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
	*excedente.
	*/
	
	funcao inicio()
	{	//variáveis
		real c, n = 0.00, he= 0.00, ex = 0.00	
		const real LIMITEH = 50.00, VALORHORA = 20.00
		//inicioDoPrograma
		escreva("Digite  os quatro digitos finais de seu registro na empresa: ")
		leia(c)
		limpa()
		escreva("Digite as quantidade de horas trabalhadas: ")
		leia(n)
		limpa()
		se (n > LIMITEH) {
			ex = n - LIMITEH
			he = ex * VALORHORA
			escreva("Olá funcionário ",c,". Você fez: ",ex," hora[s] a mais!")
			escreva("\nPor isso irá receber R$ ",he," referentes a essas horas adicionais. Aproveite!")
		}
		senao {
			escreva("Olá funcionário ",c,". Você fez: ",ex," hora[s] a mais!")
			escreva("\nPor isso não irá receber valor adicional esse mês!")
		}
		escreva("\nObrigado por utilizar nosso programa!")	
	}	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1293; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */