programa
{	/*
	4 times - PALMEIREAS,SPFC, SANTOS, CORINTHIANS
	PONTOS POR TIME
	GANHA - 3 PTS, EMPATA - 1 PT,  PERDE - 0 PT
	3 RODADAS COM TODOS OS TIMES 
	PERGUNTANDO - GANHOU, PERDEU, EMPATOU?
	DEPOIS DE 3 RODADAS TOTALIZE E MOSTRE OS PONTOS POR TIME 
	OBRIGATORIO USAR VETOR
	VETOR - TIMES
	VETOR - PONTOS
	*/
	
	funcao inicio()
	{
		cadeia times[] = {"PALMEIRAS","SPFC","SANTOS","CORINTHIANS"}
		inteiro pontos[4]
		caracter resultado
		
		para (inteiro y=0; y < 3; y++) {
			escreva("Rodada ",y,": ")
			
			para (inteiro i=0; i < 4; i++) {			
				escreva("\nResultado do ",times[i],": ")
				
				escreva("\n[1] -> GANHOU ")
				escreva("\n[2] -> PERDEU")
				escreva("\n[3] -> EMPATOU ")
				escreva("\n")
				escreva("\nDigite um número para informar: ")
				leia(resultado)
				limpa()
				se (resultado == '1') {
					pontos[i] += 3
				}
				senao se (resultado == '2'){
					pontos[i] += 0
			
				}
				senao se (resultado == '3'){
					pontos[i] += 1
				}
			}
		}
		escreva("\nResultado: ")
		para (inteiro x=0; x < 4; x++) {
			escreva("\n",times[x]," ", pontos[x])
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 799; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */