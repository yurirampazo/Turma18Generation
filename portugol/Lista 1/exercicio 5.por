programa
{	/*5. Faça um sistema que leia as 3 notas de um aluno
	e calcule a média final deste aluno. 
	Considerar que a média é ponderada e que o peso 
	das notas é: 2,3 e 5, respectivamente.*/
	inclua biblioteca Matematica	--> Mat
	funcao inicio()
	{			
		//variáveis
		real p1 = 0.00, p2 = 0.00, p3 = 0.00, mp = 0.00
		escreva("Digite o valor da primeira nota: ")
		leia(p1)
		escreva("Digite o valor da primeira nota: ")
		leia(p2)
		escreva("Digite o valor da primeira nota: ")
		leia(p3)

		mp = (((p1*2) + (p2*3) + (p3*5)) / (2 + 3 + 5))
		escreva("A média ponderada é igual a: ", Mat.arredondar(mp, 3))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 497; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */