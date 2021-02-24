programa
{	/*4. Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: 
	, onde*/
	inclua biblioteca Matematica -->m
	
	funcao inicio()
	{
		//variáveis
		inteiro a = 0, b = 0, c = 0
		real r = 0.00, s = 0.00, d = 0.00
		escreva("Digite um número inteiro, positivo: ")
		leia(a)
		escreva("Digite mais um número inteiro, positivo: ")
		leia(b)
		escreva("Digite mais um número inteiro, positivo: ")
		leia(c)

		r = (m.potencia((a + b), 2))
		s = (m.potencia((b + c), 2))
		d = (r + s) / 2
		

		escreva("O valor de R é: ", m.arredondar(r, 3))
		escreva("O valor de S é: ", m.arredondar(s, 3))
		escreva("O valor de D é: ", m.arredondar(d, 3))		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 514; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */