programa
{	/* Yuri Mina Rampazo - Turma 18 - Generation Brasil
	*  Porposta do Projeto:
	*  5) A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de
	* indústrias que são altamente poluentes do meio ambiente. O índice de poluição aceitável
	* varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a
	* suspenderem suas atividades, se o índice crescer para 0,4 as industrias do 1º e 2º grupo são
	* intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser
	* notificados a paralisarem suas atividades. Faça um sistema que leia o índice de poluição
 	* medido e emita a notificação adequada aos diferentes grupos de empresas.
	*/
	funcao inicio()
	{	//variáveis
		real indicep = 0.00 
		cadeia grupo1, grupo2, grupo3
		//inicioDoPrograma
		escreva("Digite o índice de poluição entre 0.005 e 0.5: ")
		leia(indicep)
		limpa()
		se (indicep >= 0.05 e indicep <=0.25) {
			escreva ("O índice está aceitável, nenhuma empresa precisa encerrar as atividades!")
		}
		senao se (indicep >= 0.3 e indicep < 0.4) {
			escreva("As industrias do 1º grupo devem suspender as atividades!")
		}
		senao se (indicep >= 0.4 e indicep < 0.5) {
			escreva("As industrias do 1º e 2º grupo devem suspender as atividades!")	
		}
		senao se (indicep == 0.5) {
			escreva("Todos os grupos de indústria devem suspender as atividades!")	
		}
		senao se (indicep < 0.05 ou indicep > 0.5) {
			escreva("Valor inválido para o índice. Por favor tente novamente!")
		}		
		escreva("\nObrigado por utilizar nosso programa!")		
	}	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1589; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */