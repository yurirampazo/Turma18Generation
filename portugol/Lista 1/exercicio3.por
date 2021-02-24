programa
{	
	/* Faça um sistema que leia o tempo de duração de um evento em 
	 *  uma fábrica expressa em segundos e mostre-o expresso em horas, 
	 *  minutos e segundos.
	*/
	funcao inicio()
	{	
		//variáveis
		inteiro tempoDuracao = 0, horas = 0,  minutos = 0, segundos = 0
		
		escreva("Digite o tempo de duração do evento em segundos: ")
		leia(tempoDuracao)

		horas = tempoDuracao/3600
		minutos = (tempoDuracao % 3600) / 60
		segundos = (tempoDuracao % 3600) % 60

		escreva("Hora[s]: ", horas,"\n")
		escreva("Minutos[s]: ", minutos,"\n")
		escreva("Segundo[s]: ", segundos)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 282; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */