programa
{	/* Yuri Mina Rampazo - Turma 18 - Generation Brasil
	*  Porposta do Projeto:
	* Parabéns aniversariante!
	*/
	
	funcao inicio()
	{	//variáveis
		cadeia nome
		caracter parar = 'n'
		inteiro idade, anoN, anoA	
		//inicioDoPrograma
		enquanto (parar !='s' ou parar != 'S') {
			escreva("Digite seu nome: ")
			leia(nome)
			limpa()
			escreva("Em que ano você nasceu? ")
			leia(anoN)
			limpa()
			escreva("Em que ano estamos? ")
			leia(anoA)
			limpa()
			idade = anoA - anoN
			escreva("Olá ",nome," você tem ",idade," anos!")			
			escreva("Deseja continuar? [s/n]: ")
			leia(parar)	
			limpa()		
		}		
		escreva("\nObrigado por utilizar nosso programa! :D")		
	}	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 609; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */