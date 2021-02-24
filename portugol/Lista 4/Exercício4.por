programa
{	/*Yuri Mina Rampazo - Turma 18 - Generation Brasil
	Projeto:
	4. Crie um programa que receba valores do 
	usuário para preencher uma matriz 3X3, e
	em seguida, exiba a soma dos valores dela 
	e a soma dos valores da primeira
	diagonal, ou seja, diagonal principal.
	*/
	funcao pula() {
		escreva("\n")	
	}
	funcao inicio()
	{	
		//variáveis:
		inteiro matriz[3][3], linha = 0, coluna = 0
		inteiro somaTotal = 0, somaDiagonal = 0
		
		//Início do Programa:
		para (linha = 0; linha < 3; linha++) {
			para (coluna = 0; coluna < 3; coluna++) {
				escreva("Digite um valor: ")
				leia(matriz[linha][coluna])
				somaTotal += matriz[linha][coluna]
				limpa()
			}
		}
		escreva("  MATRIZ 3 X 3")
		pula()
		para (linha = 0; linha < 3; linha++) {
			para(coluna = 0; coluna < 3; coluna++){
			somaDiagonal = (matriz[0][0] + matriz[1][1] + matriz[2][2]) 
			escreva("[ " ,matriz[linha][coluna]," ]")	
			}
			pula()
		}	
		
		escreva("A soma total da matriz é: ",somaTotal)
		pula()
		escreva("A soma da diagonal principal é: ",somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 703; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 16, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */