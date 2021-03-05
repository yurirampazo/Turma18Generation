package LISTA05APLICACAO;

import java.util.ArrayList;
import java.util.Collection;

public class TesteEstoque {

	public static void main(String[] args) {
		Collection <String> estoque = new ArrayList <> (); //Instanciando ArrayList
		estoque.add("Blusas");
		estoque.add("Camisetas");
		estoque.add("Jeans");
		estoque.add("Calçados");
		
		//LISTA INPICIO	
				System.out.println("Lista de itens: " + estoque);
				//remover
				
				System.out.println("Removendo item");
				System.out.println("Lista de itens: " + estoque);
				estoque.remove("Camisetas");
				
				//atualizando a lista
				System.out.println("Lista atualizada");
				System.out.println("Lista de itens: " + estoque);
				
				//mostrar dados
				for (String estoq: estoque) {
					System.out.println("Nomes: " + estoq);
				}

	}

}
