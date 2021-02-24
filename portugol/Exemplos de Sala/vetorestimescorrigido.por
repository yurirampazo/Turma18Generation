programa
{
    //4 TIMES - PALMEIRAS, SPFC, SANTOS, CORINTHIANS
    // TEM PONTOS POR TIME
    // GANHA - 3 PONTOS, EMPATIA -1, PERDE -0
    // 3 RODADAS COM TODOS OS TIMES
    //PERGUNTANDO GANHOU, PERDEU, EMPATOU
    // DEPOIS DE 3 RODADAS TOTALIZE E MOSTRE OS PONTOS POR TIME
    // OBRIGATORIO USAR VETOR
    // VETOR TIMES - TEXTO
    // VETOR PONTOS - INTEIRO
    
    funcao inicio()
    {
        cadeia times[] = {"PALMEIRAS", "SPFC", "SANTOS", "CORINTHIANS"}
        inteiro pontos[4]
        caracter resultado

        para(inteiro y=1; y<=3; y++){
            escreva("Rodada ",y,": \n")
            
            para(inteiro i=0; i<4; i++){
                escreva("\n",times[i]," 1- Ganhou, 2- Empatou, 3- Perdeu: ")
                leia(resultado)
                se(resultado == '1'){
                    pontos[i] += 3
                }
                senao se(resultado == '2'){
                    pontos[i] = pontos[i] + 1
                }
                senao se(resultado == '3'){
                    pontos[i] = pontos[i] + 0
                }    
            }
            
        }
        escreva("\nResultado:")
        para(inteiro x=0; x < 4; x++){
            escreva("\n",times[x]," ",pontos[x])
            }
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 366; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */