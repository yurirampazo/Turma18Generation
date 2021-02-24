programa
{	/* Yuri Mina Rampazo - Turma 18 - Generation Brasil
	*  Porposta do Projeto:
	* Parabéns aniversariante!
	*/
	
	funcao inicio()
	{	//variáveis
		cadeia nome
		caracter teste = 'n'
		inteiro idade, anoN, anoA	
		//inicioDoPrograma
		faca  {
			escreva("Digite seu nome: ")
			leia(nome)			
			escreva("Em que ano você nasceu? ")
			leia(anoN)			
			escreva("Em que ano estamos? ")
			leia(anoA)			
			idade = anoA - anoN
			escreva("Olá ",nome," você tem ",idade," anos!")			
			escreva("\nDeseja continuar? [s/n]: ")
			leia(teste)
				enquanto ((teste != 'n' ou teste != 'N') e (teste != 's' ou teste != 'S')) {
					escreva("Digite S ou N .")
				}
			} enquanto (teste == 's' ou teste == 'S') 	
				
		escreva("\nObrigado por utilizar nosso programa! :D")		
	}	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 655; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */