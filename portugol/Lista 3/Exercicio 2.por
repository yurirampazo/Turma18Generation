programa
{	/* Yuri Mina Rampazo - Turma 18 - Generation Brasil
	*  Porposta do Projeto:
	* 2- Desenvolver um sistema que efetue a soma de todos os números ímpares que são
	* múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
	*/
	
	funcao inicio()
	{	//variáveis
		inteiro i = 0, cont = 0
		//inicioDoPrograma
		para (i = 1; i <= 500; i++) {
			se (i % 2 != 0 e i % 3 == 0) {
				cont++
			}
		escreva(i,"o. Entre 1 e 500, existem ",cont," números ímpares múltiplos de 3.\n")			
		}		
		escreva("\nObrigado por utilizar nosso programa! :D")		
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