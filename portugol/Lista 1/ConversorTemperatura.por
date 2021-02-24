programa
{
	inclua biblioteca Matematica -->m
	/* Converter temperatura de celsius para fahrenheit
	 Fator de conversão  --->   °C = (°F − 32) ÷ 1, 8
	*/
	
	funcao inicio()
	{	//variáveis
		real f= 0.00, c = 0.00
		//inicio do programa
		escreva("Digite a temperatura em graus Fahrenheit: ")
		leia(f)
		c = ((f - 32) / 1.8)
		escreva("A temperatura ",f," em graus Celsius é: ", m.arredondar(c, 2))
		//fimdoprograma
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 421; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */