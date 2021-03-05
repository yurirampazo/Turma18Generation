package LISTA05APLICACAO;

import LISTA05CLASSE.Animal;
import LISTA05CLASSE.Cachorro;
import LISTA05CLASSE.Cavalo;
import LISTA05CLASSE.Preguica;

public class TesteAnimal {
	
	/* YURI MINA RAMPAZO - TURMA 18 - GENERATION BRASIL.
	* PROPOSTA:1- Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
	* comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
	* características de forma que tudo o que for comum a todos os animais fique na classe
	* Animal:*/

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro("Smeagle",15,"Auu Auu");
		Cavalo horse = new Cavalo("Bala no alvo",5,"Hiiii Hiiii Hiii");
		Preguica preguica = new Preguica("Sid",7,"Ahhhhh");
		
		Animal animais [] = new Animal[3];
		animais[0] = dog;
		animais[1] = horse;
		animais[2] = preguica;
		
		
		for(Animal animal : animais ) {
			System.out.println(animal.getNome() + " Faz o seguinte som: "+ animal.getSom());
		}
		
	}
}