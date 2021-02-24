programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
		//variaveis
		real a = 0.00, b = 0.00, c = 0.00, d = 0.00, et = 0.00, f = 0.00, x = 0.00, y = 0.00

		escreva("Digite o valor de a: ")
		leia(a)		
		escreva("Digite o valor de b: ")
		leia(b)		
		escreva("Digite o valor de c: ")
		leia(c)		
		escreva("Digite o valor de d: ")
		leia(d)		
		escreva("Digite o valor de e: ")
		leia(et)		
		escreva("Digite o valor de f: ")
		leia(f)
		//preparo - processamento
		x=((c*et)-(b*f)) / ((a*et)-(c*d))
		y=((a*f)-(c*d)) / ((a*et)-(b*d))

		escreva("O valor de x é:", Mat.arredondar(x, 2))
		escreva("O valor de y é:", Mat.arredondar(x, 2))
		
	}
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 659; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */