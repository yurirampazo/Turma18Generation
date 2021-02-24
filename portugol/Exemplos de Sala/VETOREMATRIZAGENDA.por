programa
{	//AGENDA
	
	funcao inicio()
	{	
		cadeia agenda[24][31] //linhas  horas 0-23  colunas dias 0-30
		inteiro dia, hora
		caracter opcao = '1'
				
		faca	{	
			escreva("Digite o número do dia [1-31]: ")
			leia(dia)
			escreva("Digite a hora da atividade [0-23]: ")
			leia(hora)
			escreva("Digite a tarefa: ")
			leia(agenda[hora][dia-1])
			escreva("Continua? 1- Sim ou 2-Não: ")
			leia(opcao)
		 
		} enquanto (opcao =='1')

		para (inteiro dias = 0; dias < 31; dias++) { //giro dos dias -- VETOR E MATRIZ SEMPRE TEM GIRO 
		para (inteiro horas =0; horas <24; horas++){ // giro das horas
			se(agenda[horas][dias] != ""){
			escreva("\nDia: ",dias+1," as ",horas," horas: ",agenda[horas][dias])
			}
		}	
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 721; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */