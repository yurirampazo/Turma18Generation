programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro idade, anoNascimento, anoAtual

		escreva("Digite seu nome: ")
		leia(nome)
		escreva("Em que ano você nasceu? ")
		leia(anoNascimento)
		escreva("Em que ano nós estamos? ")
		leia(anoAtual)
		idade = anoAtual - anoNascimento
		escreva("Olá, ",nome, "você tem aproximadamente ",idade," anos de idade!")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 275; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */