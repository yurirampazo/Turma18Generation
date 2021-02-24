programa
{	/* Yuri Mina Rampazo - Turma 18 - Generation Brasil
	*  Porposta do Projeto:
	*  3) Desenvolva um sistema em que:
	*Leia 4 (quatro) números;
	*Calcule o quadrado de cada um;
	*Se o valor resultante do quadrado do terceiro for &gt;= 1000, imprima-o e finalize;
	*Caso contrário, imprima os valores lidos e seus respectivos quadrados.
	*/
	inclua biblioteca Matematica --> m
	
	funcao inicio()
	{	//variáveis
		real a = 0.00, b = 0.00, c = 0.00 , d = 0.00, a2 = 0.00, b2 = 0.00, c2 = 0.00, d2 = 0.00
		//inicioDoPrograma
		escreva("Digite um número: ")
		leia(a)
		limpa()
		escreva("Digite outro número: ")
		leia(b)
		limpa()
		escreva("Digite mais número: ")
		leia(c)
		limpa()
		escreva("Digite um último número: ")
		leia(d)
		limpa()

		a2 = (m.potencia(a, 2))
		b2 = (m.potencia(b, 2))
		c2 = (m.potencia(c, 2))
		d2 = (m.potencia(d, 2))
		se (c2 >= 1000) {
			escreva ("O quadrado de ",c," é ", c2,"!")
		}
		senao {
			escreva ("O quadrado de ",a," é ", (m.arredondar(a2,3)),"!")
			escreva ("\nO quadrado de ",b," é ", (m.arredondar(b2,3)),"!")
			escreva ("\nO quadrado de ",c," é ", (m.arredondar(c2,3)),"!")
			escreva ("\nO quadrado de ",d," é ", (m.arredondar(d2,3)),"!")
		}
		escreva("\nObrigado por utilizar nosso programa!")		
	}	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1215; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */