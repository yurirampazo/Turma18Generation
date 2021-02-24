programa
{	/* Yuri Mina Rampazo - Turma 18 - Generation Brasil
	*  Porposta do Projeto:
	* 3- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
	* apresente no final o total do somatório, a média e o total de valores lidos. O programa
	* deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
	* positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
	* negativo.*/
	funcao inicio()
	{	//variáveis
		real n = 0.00, somatorio = 0.0, media = 0.0, total = 0.0
		
		//inicioDoPrograma
		enquanto (n >= 0) {
			escreva("\nDigite um número: ")
			leia(n)
			somatorio = somatorio + n
			total++
			media = somatorio / total
										
		}		
			escreva("\n Somatório: ", somatorio)
			escreva("\n Média: ", media)
			escreva("\n Total: ", total)		
	}	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 711; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */