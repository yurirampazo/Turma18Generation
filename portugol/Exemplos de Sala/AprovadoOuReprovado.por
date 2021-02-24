programa
{	/* Yuri Mina Rampazo - Turma 18 - Generation Brasil
	*  Porposta do Projeto: SE a nota for <=5 reprovado
	*/
	
	funcao inicio()
	{	//variáveis
		real nota = 0.00
		cadeia nome
		caracter sexo
		//inicioDoPrograma
		escreva("Digite seu nome: ")
		leia(nome)
		escreva("Digite o sexo [M/F/O]]: ")
		leia(sexo)
		escreva("Digite sua nota de 0 - 10: ")
		leia(nota)
		//Estrutura Condicional
		se (nota >= 6)
		{	
			se (sexo == 'M' ou sexo == 'm')
			{
			escreva ("Oi, ",nome,". Parabéns!!! Você foi APROVADO.")
			}
			senao se (sexo == 'F' ou sexo == 'f')
			{
				escreva ("Oi, ",nome,". Parabéns!!! Você foi APROVADA.")	
			}
			senao se (sexo == 'O' ou sexo == 'o')
				escreva ("Oi, ",nome,". Parabéns!!! Você foi APROVADE.")
			senao
			{
				escreva ("Você digitou um sexo inválido! Tente novamente.")
			}
		}
		senao se (nota >= 5 e nota < 6)
		{	se ( sexo == 'M' ou sexo == 'm')
			{
				escreva ("Oi, ",nome,". Você está retido. Mas terá chances de passar ainda!")	
			}
			senao se (sexo == 'F' ou sexo == 'f')
			{
				escreva ("Oi, ",nome,". Você está retida. Mas terá chances de passar ainda!")
			}
			senao se (sexo == 'O' ou sexo == 'o')
			{
				escreva ("Oi, ",nome,". Você está retide. Mas terá chances de passar ainda!")	
			}
			senao
			{
				escreva ("Você digitou um sexo inválido! Tente novamente.")
			}
		}
		senao
		{
			se (sexo == 'M' ou sexo == 'm')
			{
				escreva ("Oi, ",nome,". Infelizmente você foi reprovado.")
			}
			senao se (sexo == 'F' ou sexo == 'f')
			{
				escreva ("Oi, ",nome,". Infelizmente você foi reprovada.")		
			}
			senao se (sexo == 'O' ou sexo == 'o')
			{
				escreva ("Oi, ",nome,". Infelizmente você foi reprovade.")	
			}
			senao
			{
				escreva ("Você digitou um sexo inválido! Tente novamente.")
			}
		}
		escreva("\nFim do programa!")		
	}	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1777; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */