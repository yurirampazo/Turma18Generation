package POLIMORFISMOAPLICACAO;

import POLIMORFISMOCLASSES.Pessoa;
import POLIMORFISMOCLASSES.PessoaFisica;
import POLIMORFISMOCLASSES.PessoaJuridica;

public class TestePolimorfismo {

	public static void main(String[] args) {
		PessoaFisica fisica = new PessoaFisica();
		fisica.setNome("José");
		fisica.setCpf(43703688819L);
		
		PessoaJuridica juridica = new PessoaJuridica();
		juridica.setNome("José");
		juridica.setCnpj(0001215145626L);
	
	
	
		Pessoa pessoas [] = new Pessoa[2];
		pessoas[0] = fisica;
		pessoas[1] = juridica;
	
		for (Pessoa pessoa: pessoas) {
			System.out.println(pessoa.getNome());
		}
	
	
	
	}

}
