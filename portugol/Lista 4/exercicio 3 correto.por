programa
{
	inclua biblioteca Util	--> ut
	/*Yuri Mina Rampazo - Turma 18 - Generation Brasil
	Projeto:
	3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
	a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
	das matrizes N1 e N2;
	b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
	posição das matrizes N1 e N2.
	*/
	

    funcao inicio()
    {
        inteiro n1[4][6] , n2[4][6]
        real m1[4][6] , m2[4][6]


            para ( inteiro i = 0 ; i < 4 ; i++) {
                para( inteiro x = 0 ; x < 6 ; x++){
                  n1[i][x] = ut.sorteia(1, 99)
                }

            }
            para (inteiro i = 0 ; i < 4; i++){
            	para (inteiro x = 0 ; x < 6 ; x++){
                        n2[i][x] = ut.sorteia(1, 99)
               }

            }
            escreva("\nSoma das matrizes(N1 + N2) = M1: ")  
		para (inteiro i = 0 ; i < 4; i++){
            	para (inteiro x = 0 ; x < 6 ; x++){
                        m1[i][x] = n1[i][x] + n2[i][x]
                        escreva("\n",m1[i][x])   
              }
		}
		    escreva("\nDiferença das matrizes(N1 - N2) = M2: ")  
		para (inteiro i = 0 ; i < 4; i++){
            	para (inteiro x = 0 ; x < 6 ; x++){
                        m2[i][x] = n1[i][x] - n2[i][x]
                        escreva("\n",m1[i][x])   
              }
		}
    }
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1359; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */