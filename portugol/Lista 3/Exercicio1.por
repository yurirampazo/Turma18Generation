programa
{	/* Yuri Mina Rampazo - Turma 18 - Generation Brasil
	*  Porposta do Projeto: Usar Função (PARA)
	*  1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
	* coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
	* a) média do salário da população;
	* b) média do número de filhos;
	* c) maior salário;
	* d) percentual de pessoas com salário até R$100,00.
	* 
	*/
	inclua biblioteca Matematica --> m
	
	
	funcao inicio()
	{	//variáveis
		real mediaSalarial = 0.00, salario = 0.00, totalSalario = 0.00
		real mediaFilhos = 0.00, maiorSalario = 0.00, percentual = 0.00
		inteiro menorDeCem = 0, filhos = 0, totalFilhos = 0
		const inteiro HAB = 20
		//inicioDoPrograma
		para(inteiro i = 1; i <= HAB; i++) {
			escreva(i,"o. Digite seu salário: ")
			leia(salario)
			escreva("Digite a quantidade de filhos que você possui: ")
			leia(filhos)
			totalFilhos = totalFilhos + filhos
			totalSalario = totalSalario + salario
			mediaSalarial = totalSalario / i
			mediaFilhos = totalFilhos / i
			limpa()
			se (salario > maiorSalario){
				maiorSalario = salario
			}
			se (salario < 100) {
				menorDeCem++
			}
		}		
		escreva("\na) Média do salário da população; R$ ", mediaSalarial)
		escreva("\nb) Média do nº de filhos da população; R$ ", mediaFilhos)
		escreva("\nc) Maior salário R$ ", maiorSalario)
		escreva("\nd) Percentual de pessoas com salario até R$ 100,00: ",(menorDeCem * 100) / HAB,"%")
		escreva((menorDeCem * 100) / HAB)
			
		escreva("\nObrigado por utilizar nosso programa! :D")		
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1462; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */